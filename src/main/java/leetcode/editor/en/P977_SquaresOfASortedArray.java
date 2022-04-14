//Given an integer array nums sorted in non-decreasing order, return an array 
//of the squares of each number sorted in non-decreasing order. 
//
// 
// Example 1: 
//
// 
//Input: nums = [-4,-1,0,3,10]
//Output: [0,1,9,16,100]
//Explanation: After squaring, the array becomes [16,1,0,9,100].
//After sorting, it becomes [0,1,9,16,100].
// 
//
// Example 2: 
//
// 
//Input: nums = [-7,-3,2,3,11]
//Output: [4,9,9,49,121]
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 10⁴ 
// -10⁴ <= nums[i] <= 10⁴ 
// nums is sorted in non-decreasing order. 
// 
//
// 
//Follow up: Squaring each element and sorting the new array is very trivial, 
//could you find an O(n) solution using a different approach? Related Topics Array 
//Two Pointers Sorting 👍 5100 👎 148
    
package leetcode.editor.en;
/** 
 * id: 977
 * title: Squares of a Sorted Array
 * author: Ives.He 
 * date: 2022-04-15 00:04:23
 * for TEST copy:
 * import leetcode.editor.en.P977_SquaresOfASortedArray .Solution;
 * P977_SquaresOfASortedArray_Test
 */
public class P977_SquaresOfASortedArray{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0;
        int k = nums.length-1;
        int [] result = new int [nums.length];
        for(int r = result.length-1; r>=0; r--){
            // swap
            if(Math.abs(nums[i])>Math.abs(nums[k])){
                result[r] = nums[i]*nums[i];
                i++;
            }else{
                result[r] = nums[k]*nums[k];
                k--;
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
//Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2
//,...,yn]. 
//
// Return the array in the form [x1,y1,x2,y2,...,xn,yn]. 
//
// 
// Example 1: 
//
// 
//Input: nums = [2,5,1,3,4,7], n = 3
//Output: [2,3,5,4,1,7] 
//Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,
//5,4,1,7].
// 
//
// Example 2: 
//
// 
//Input: nums = [1,2,3,4,4,3,2,1], n = 4
//Output: [1,4,2,3,3,2,4,1]
// 
//
// Example 3: 
//
// 
//Input: nums = [1,1,2,2], n = 2
//Output: [1,2,1,2]
// 
//
// 
// Constraints: 
//
// 
// 1 <= n <= 500 
// nums.length == 2n 
// 1 <= nums[i] <= 10^3 
// 
//
// Related Topics Array 👍 4872 👎 251
    
package leetcode.editor.en;
/** 
 * id: 1470
 * title: Shuffle the Array
 * author: Ives.He 
 * date: 2023-05-17 21:33:31
 * for TEST copy:
 * import leetcode.editor.en.P1470_ShuffleTheArray .Solution;
 * P1470_ShuffleTheArray_Test
 */
public class P1470_ShuffleTheArray{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int idx = 1;
        int[] result = new int[2*n];
        while(n<nums.length){
            result[idx] = nums[n];
            idx+=2;
            n++;
        }
        idx=0;
        n=0;
        while(n<nums.length/2){
            result[idx] = nums[n];
            idx+=2;
            n++;
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
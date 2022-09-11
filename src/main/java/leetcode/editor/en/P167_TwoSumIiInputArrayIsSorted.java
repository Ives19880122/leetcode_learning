//Given a 1-indexed array of integers numbers that is already sorted in non-
//decreasing order, find two numbers such that they add up to a specific target 
//number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1
// < index2 <= numbers.length. 
//
// Return the indices of the two numbers, index1 and index2, added by one as an 
//integer array [index1, index2] of length 2. 
//
// The tests are generated such that there is exactly one solution. You may not 
//use the same element twice. 
//
// Your solution must use only constant extra space. 
//
// 
// Example 1: 
//
// 
//Input: numbers = [2,7,11,15], target = 9
//Output: [1,2]
//Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We 
//return [1, 2].
// 
//
// Example 2: 
//
// 
//Input: numbers = [2,3,4], target = 6
//Output: [1,3]
//Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We 
//return [1, 3].
// 
//
// Example 3: 
//
// 
//Input: numbers = [-1,0], target = -1
//Output: [1,2]
//Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We 
//return [1, 2].
// 
//
// 
// Constraints: 
//
// 
// 2 <= numbers.length <= 3 * 10⁴ 
// -1000 <= numbers[i] <= 1000 
// numbers is sorted in non-decreasing order. 
// -1000 <= target <= 1000 
// The tests are generated such that there is exactly one solution. 
// 
// Related Topics Array Two Pointers Binary Search 👍 7600 👎 1066
    
package leetcode.editor.en;
/** 
 * id: 167
 * title: Two Sum II - Input Array Is Sorted
 * author: Ives.He 
 * date: 2022-09-11 12:27:13
 * for TEST copy:
 * import leetcode.editor.en.P167_TwoSumIiInputArrayIsSorted .Solution;
 * P167_TwoSumIiInputArrayIsSorted_Test
 */
public class P167_TwoSumIiInputArrayIsSorted{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length-1;
        int[] arr = {};
        while(l<r){
            int sum = numbers[l]+numbers[r];
            if (sum>target){
                r--;
            }else if (sum<target){
                l++;
            }else{
                arr = new int[]{l+1,r+1};
                break;
            }
        }
        return arr;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
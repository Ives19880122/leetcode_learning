//Given an integer array nums of length n, you want to create an array ans of 
//length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-
//indexed). 
//
// Specifically, ans is the concatenation of two nums arrays. 
//
// Return the array ans. 
//
// 
// Example 1: 
//
// 
//Input: nums = [1,2,1]
//Output: [1,2,1,1,2,1]
//Explanation: The array ans is formed as follows:
//- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
//- ans = [1,2,1,1,2,1] 
//
// Example 2: 
//
// 
//Input: nums = [1,3,2,1]
//Output: [1,3,2,1,1,3,2,1]
//Explanation: The array ans is formed as follows:
//- ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
//- ans = [1,3,2,1,1,3,2,1]
// 
//
// 
// Constraints: 
//
// 
// n == nums.length 
// 1 <= n <= 1000 
// 1 <= nums[i] <= 1000 
// 
// Related Topics Array 👍 903 👎 181
    
package leetcode.editor.en;
/** 
 * id: 1929
 * title: Concatenation of Array
 * author: Ives.He 
 * date: 2022-04-14 21:41:12
 * for TEST copy:
 * import leetcode.editor.en.P1929_ConcatenationOfArray .Solution;
 * P1929_ConcatenationOfArray_Test
 */
public class P1929_ConcatenationOfArray{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int [2*nums.length];
        for(int i= 0; i<nums.length; i++){
            ans[i] = ans[i+nums.length] = nums[i];
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
//Given an integer array nums, find the contiguous subarray (containing at 
//least one number) which has the largest sum and return its sum. 
//
// A subarray is a contiguous part of an array. 
//
// 
// Example 1: 
//
// 
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: [4,-1,2,1] has the largest sum = 6.
// 
//
// Example 2: 
//
// 
//Input: nums = [1]
//Output: 1
// 
//
// Example 3: 
//
// 
//Input: nums = [5,4,-1,7,8]
//Output: 23
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 10⁵ 
// -10⁴ <= nums[i] <= 10⁴ 
// 
//
// 
// Follow up: If you have figured out the O(n) solution, try coding another 
//solution using the divide and conquer approach, which is more subtle. 
// Related Topics Array Divide and Conquer Dynamic Programming 👍 15076 👎 705

package leetcode.editor.en;
/**
  * id：53
  * title：Maximum Subarray
  * author: Ives.He
  * date：2021-10-08 13:23:04
  * for TEST copy:
  * import leetcode.editor.en.P53_MaximumSubarray.Solution;
  * P53_MaximumSubarray_Test
  */
public class P53_MaximumSubarray{
  
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        // 收集暫存
        int[] dp = new int[n];
        dp[0] = nums[0];
        for(int i = 1; i<nums.length; i++){
            // 如果當前數字大於,前一數字＋當前數字,則回傳當前數字
            dp[i] = Math.max(nums[i],nums[i]+dp[i-1]);
        }
        int res = Integer.MIN_VALUE;
        // 比對取得答案
        for( int i = 0; i< dp.length; i++){
            res = Math.max(res,dp[i]);
        }
        return res;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}
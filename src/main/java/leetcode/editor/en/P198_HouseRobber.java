//You are a professional robber planning to rob houses along a street. Each 
//house has a certain amount of money stashed, the only constraint stopping you from 
//robbing each of them is that adjacent houses have security systems connected and 
//it will automatically contact the police if two adjacent houses were broken 
//into on the same night. 
//
// Given an integer array nums representing the amount of money of each house, 
//return the maximum amount of money you can rob tonight without alerting the 
//police. 
//
// 
// Example 1: 
//
// 
//Input: nums = [1,2,3,1]
//Output: 4
//Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
//Total amount you can rob = 1 + 3 = 4.
// 
//
// Example 2: 
//
// 
//Input: nums = [2,7,9,3,1]
//Output: 12
//Explanation: Rob house 1 (money = 2), rob house 3 (money = 9) and rob house 5 
//(money = 1).
//Total amount you can rob = 2 + 9 + 1 = 12.
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 100 
// 0 <= nums[i] <= 400 
// 
// Related Topics Array Dynamic Programming 👍 14534 👎 297
    
package leetcode.editor.en;

import java.util.Arrays;

/**
 * id: 198
 * title: House Robber
 * author: Ives.He 
 * date: 2022-09-17 12:47:55
 * for TEST copy:
 * import leetcode.editor.en.P198_HouseRobber .Solution;
 * P198_HouseRobber_Test
 */
public class P198_HouseRobber{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    int[] memo;
    public int rob(int[] nums) {
        memo = new int [nums.length];
        Arrays.fill(memo,-1);
        return plan(nums,0);
    }
    private int plan(int[] nums, int idx){
        if(idx>=nums.length) return 0;
        if(memo[idx]!=-1) return memo[idx];
        int result = Math.max(nums[idx] + plan(nums,idx+2),plan(nums,idx+1));
        memo[idx]=result;
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
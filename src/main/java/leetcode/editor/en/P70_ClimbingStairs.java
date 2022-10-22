//You are climbing a staircase. It takes n steps to reach the top. 
//
// Each time you can either climb 1 or 2 steps. In how many distinct ways can 
//you climb to the top? 
//
// 
// Example 1: 
//
// 
//Input: n = 2
//Output: 2
//Explanation: There are two ways to climb to the top.
//1. 1 step + 1 step
//2. 2 steps
// 
//
// Example 2: 
//
// 
//Input: n = 3
//Output: 3
//Explanation: There are three ways to climb to the top.
//1. 1 step + 1 step + 1 step
//2. 1 step + 2 steps
//3. 2 steps + 1 step
// 
//
// 
// Constraints: 
//
// 
// 1 <= n <= 45 
// 
// Related Topics Math Dynamic Programming Memoization 👍 8695 👎 258
    
package leetcode.editor.en;
/** 
 * id: 70
 * title: Climbing Stairs
 * author: Ives.He 
 * date: 2021-10-16 00:23:59
 * for TEST copy:
 * import leetcode.editor.en.P70_ClimbingStairs .Solution;
 * P70_ClimbingStairs_Test
 */
public class P70_ClimbingStairs{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int climbStairs(int n) {
        // only 1 or 2 , 1 <= n <= 45
        // 下樓梯要每次都要重算一遍,往上爬則不用
        // return climbStairs(n-1) + climbStairs(n-2);
        if(n<2) return 1;
        int[] dp = new  int[n+1];
        dp[1] = 1;  // 一階
        dp[2] = 2;  // 二階
        for (int i = 3; i < n+1 ; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
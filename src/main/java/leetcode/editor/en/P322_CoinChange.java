//You are given an integer array coins representing coins of different 
//denominations and an integer amount representing a total amount of money. 
//
// Return the fewest number of coins that you need to make up that amount. If 
//that amount of money cannot be made up by any combination of the coins, return -1.
// 
//
// You may assume that you have an infinite number of each kind of coin. 
//
// 
// Example 1: 
//
// 
//Input: coins = [1,2,5], amount = 11
//Output: 3
//Explanation: 11 = 5 + 5 + 1
// 
//
// Example 2: 
//
// 
//Input: coins = [2], amount = 3
//Output: -1
// 
//
// Example 3: 
//
// 
//Input: coins = [1], amount = 0
//Output: 0
// 
//
// 
// Constraints: 
//
// 
// 1 <= coins.length <= 12 
// 1 <= coins[i] <= 2³¹ - 1 
// 0 <= amount <= 10⁴ 
// 
//
// Related Topics Array Dynamic Programming Breadth-First Search 👍 16223 👎 365
//
    
package leetcode.editor.en;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * id: 322
 * title: Coin Change
 * author: Ives.He 
 * date: 2023-06-02 22:44:38
 * for TEST copy:
 * import leetcode.editor.en.P322_CoinChange .Solution;
 * P322_CoinChange_Test
 */
public class P322_CoinChange{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount <= 0) {
            return 0;
        }

        Arrays.sort(coins);

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(amount);

        boolean[] visited = new boolean[amount + 1];
        visited[amount] = true;

        int step = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Integer cur = queue.poll();
                for (int x : coins) {
                    int target = cur - x;
                    if (target == 0) {
                        return step;
                    }
                    if (target < 0) {
                        break;
                    }
                    if (!visited[target]) {
                        visited[target] = true;
                        queue.offer(target);
                    }
                }
            }

            step++;
        }

        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
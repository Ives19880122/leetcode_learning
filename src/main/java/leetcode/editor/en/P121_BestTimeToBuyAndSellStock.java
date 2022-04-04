//You are given an array prices where prices[i] is the price of a given stock 
//on the iᵗʰ day. 
//
// You want to maximize your profit by choosing a single day to buy one stock 
//and choosing a different day in the future to sell that stock. 
//
// Return the maximum profit you can achieve from this transaction. If you 
//cannot achieve any profit, return 0. 
//
// 
// Example 1: 
//
// 
//Input: prices = [7,1,5,3,6,4]
//Output: 5
//Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 
//6-1 = 5.
//Note that buying on day 2 and selling on day 1 is not allowed because you 
//must buy before you sell.
// 
//
// Example 2: 
//
// 
//Input: prices = [7,6,4,3,1]
//Output: 0
//Explanation: In this case, no transactions are done and the max profit = 0.
// 
//
// 
// Constraints: 
//
// 
// 1 <= prices.length <= 10⁵ 
// 0 <= prices[i] <= 10⁴ 
// 
// Related Topics Array Dynamic Programming 👍 15263 👎 512
    
package leetcode.editor.en;
/** 
 * id: 121
 * title: Best Time to Buy and Sell Stock
 * author: Ives.He 
 * date: 2022-04-05 00:23:02
 * for TEST copy:
 * import leetcode.editor.en.P121_BestTimeToBuyAndSellStock .Solution;
 * P121_BestTimeToBuyAndSellStock_Test
 */
public class P121_BestTimeToBuyAndSellStock{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxProfit(int[] prices) {
        // 起始值
        int min = prices[0];
        int maxProfit = 0;
        for(int i = 1; i<prices.length; i++){
            // 如果小於現況值,則取代最小值
            min = Math.min(prices[i],min);
            // 計算利差,如果大於現況,則將獲利結果取代
            maxProfit = Math.max(maxProfit,prices[i]-min);
        }
        return maxProfit;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
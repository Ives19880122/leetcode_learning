//You have n coins and you want to build a staircase with these coins. The 
//staircase consists of k rows where the iᵗʰ row has exactly i coins. The last row of 
//the staircase may be incomplete. 
//
// Given the integer n, return the number of complete rows of the staircase you 
//will build. 
//
// 
// Example 1: 
// 
// 
//Input: n = 5
//Output: 2
//Explanation: Because the 3ʳᵈ row is incomplete, we return 2.
// 
//
// Example 2: 
// 
// 
//Input: n = 8
//Output: 3
//Explanation: Because the 4ᵗʰ row is incomplete, we return 3.
// 
//
// 
// Constraints: 
//
// 
// 1 <= n <= 2³¹ - 1 
// 
//
// Related Topics Math Binary Search 👍 2723 👎 1120
    
package leetcode.editor.en;
/** 
 * id: 441
 * title: Arranging Coins
 * author: Ives.He 
 * date: 2022-10-15 09:50:32
 * for TEST copy:
 * import leetcode.editor.en.P441_ArrangingCoins .Solution;
 * P441_ArrangingCoins_Test
 */
public class P441_ArrangingCoins{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int arrangeCoins(int n) {
        int pre = 0;
        for (int i = 1; i <= n; i++) {
            n -= i;
            if(n>=0){
                pre++;
            }else{
                break;
            }
        }
        return pre;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
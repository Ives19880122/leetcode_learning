//We are playing the Guess Game. The game is as follows: 
//
// I pick a number from 1 to n. You have to guess which number I picked. 
//
// Every time you guess wrong, I will tell you whether the number I picked is 
//higher or lower than your guess. 
//
// You call a pre-defined API int guess(int num), which returns three possible 
//results: 
//
// 
// -1: Your guess is higher than the number I picked (i.e. num > pick). 
// 1: Your guess is lower than the number I picked (i.e. num < pick). 
// 0: your guess is equal to the number I picked (i.e. num == pick). 
// 
//
// Return the number that I picked. 
//
// 
// Example 1: 
//
// 
//Input: n = 10, pick = 6
//Output: 6
// 
//
// Example 2: 
//
// 
//Input: n = 1, pick = 1
//Output: 1
// 
//
// Example 3: 
//
// 
//Input: n = 2, pick = 1
//Output: 1
// 
//
// 
// Constraints: 
//
// 
// 1 <= n <= 2³¹ - 1 
// 1 <= pick <= n 
// 
//
// Related Topics Binary Search Interactive 👍 1638 👎 227
    
package leetcode.editor.en;

import leetcode.dummy.GuessGame;

/**
 * id: 374
 * title: Guess Number Higher or Lower
 * author: Ives.He 
 * date: 2022-10-10 15:46:06
 * for TEST copy:
 * import leetcode.editor.en.P374_GuessNumberHigherOrLower .Solution;
 * P374_GuessNumberHigherOrLower_Test
 */
public class P374_GuessNumberHigherOrLower{
    //leetcode submit region begin(Prohibit modification and deletion)
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */
public class Solution extends GuessGame {

    public int guessNumber(int n) {
        int l = 1;
        int r = n;
        int m = l+(r-l)/2;
        while(l<=r){
            int t = guess(m);
            if(t==0) break;
            if(t>0) l=m+1;
            if(t<0) r=m-1;
            m = l+(r-l)/2;
        }
        return m;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
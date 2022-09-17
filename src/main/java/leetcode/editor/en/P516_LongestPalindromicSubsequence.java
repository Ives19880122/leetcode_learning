////Given a string s, find the longest palindromic subsequence's length in s. 
////
//// A subsequence is a sequence that can be derived from another sequence by 
////deleting some or no elements without changing the order of the remaining 
//elements. 
////
//// 
//// Example 1: 
////
//// 
////Input: s = "bbbab"
////Output: 4
////Explanation: One possible longest palindromic subsequence is "bbbb".
//// 
////
//// Example 2: 
////
//// 
////Input: s = "cbbd"
////Output: 2
////Explanation: One possible longest palindromic subsequence is "bb".
//// 
////
//// 
//// Constraints: 
////
//// 
//// 1 <= s.length <= 1000 
//// s consists only of lowercase English letters. 
//// 
//// Related Topics String Dynamic Programming 👍 6245 👎 255
//
    
package leetcode.editor.en;

import java.util.Arrays;

/**
 * id: 516
 * title: Longest Palindromic Subsequence
 * author: Ives.He 
 * date: 2022-09-17 12:47:42
 * for TEST copy:
 * import leetcode.editor.en.P516_LongestPalindromicSubsequence .Solution;
 * P516_LongestPalindromicSubsequence_Test
 */
public class P516_LongestPalindromicSubsequence{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    int[][] memo;
    public int longestPalindromeSubseq(String s) {
        memo = new int[s.length()][s.length()];
        for (int i = 0; i < memo.length; i++) {
            Arrays.fill(memo[i],-1);
        }
        return helper(s,0,s.length()-1);
    }
    private int helper(String s, int start, int end){
        if(start>end) return 0;
        if(start==end) return 1;
        if(memo[start][end]!=-1) return memo[start][end];
        int c1 = 0;
        if(s.charAt(start)==s.charAt(end)){
            c1 = 2 + helper(s,start+1, end-1);
        }
        int c2 = helper(s,start+1, end);
        int c3 = helper(s,start, end-1);
        int result = Math.max(c1,Math.max(c2,c3));
        memo[start][end] = result;
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
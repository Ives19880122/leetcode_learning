//Given a string s which consists of lowercase or uppercase letters, return the 
//length of the longest palindrome that can be built with those letters. 
//
// Letters are case sensitive, for example, "Aa" is not considered a palindrome 
//here. 
//
// 
// Example 1: 
//
// 
//Input: s = "abccccdd"
//Output: 7
//Explanation: One longest palindrome that can be built is "dccaccd", whose 
//length is 7.
// 
//
// Example 2: 
//
// 
//Input: s = "a"
//Output: 1
//Explanation: The longest palindrome that can be built is "a", whose length is 
//1.
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 2000 
// s consists of lowercase and/or uppercase English letters only. 
// 
// Related Topics Hash Table String Greedy 👍 3541 👎 208
    
package leetcode.editor.en;
/** 
 * id: 409
 * title: Longest Palindrome
 * author: Ives.He 
 * date: 2022-09-17 10:42:32
 * for TEST copy:
 * import leetcode.editor.en.P409_LongestPalindrome .Solution;
 * P409_LongestPalindrome_Test
 */
public class P409_LongestPalindrome{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int longestPalindrome(String s) {
        int[] dic = new int [60];
        for(char d : s.toCharArray()) dic[d -'A']++;
        int count = 0;
        for(int c : dic) count += 2*(c/2);
        return count!=s.length() ? count + 1 : count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
//You are given two strings s and t. 
//
// String t is generated by random shuffling string s and then add one more 
//letter at a random position. 
//
// Return the letter that was added to t. 
//
// 
// Example 1: 
//
// 
//Input: s = "abcd", t = "abcde"
//Output: "e"
//Explanation: 'e' is the letter that was added.
// 
//
// Example 2: 
//
// 
//Input: s = "", t = "y"
//Output: "y"
// 
//
// 
// Constraints: 
//
// 
// 0 <= s.length <= 1000 
// t.length == s.length + 1 
// s and t consist of lowercase English letters. 
// 
//
// Related Topics Hash Table String Bit Manipulation Sorting 👍 3213 👎 397
    
package leetcode.editor.en;
/** 
 * id: 389
 * title: Find the Difference
 * author: Ives.He 
 * date: 2022-09-26 23:47:54
 * for TEST copy:
 * import leetcode.editor.en.P389_FindTheDifference .Solution;
 * P389_FindTheDifference_Test
 */
public class P389_FindTheDifference{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public char findTheDifference(String s, String t) {
        int [] dic = new int[26];
        char c = 'a';
        for (int i = 0; i < t.length(); i++) {
            dic[t.charAt(i)-'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            dic[s.charAt(i)-'a']--;
        }
        for (int i = 0; i < dic.length; i++) {
            if(dic[i]==1){
                c += i;
                break;
            }
        }
        return c;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
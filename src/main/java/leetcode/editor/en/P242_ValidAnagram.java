//Given two strings s and t, return true if t is an anagram of s, and false 
//otherwise. 
//
// An Anagram is a word or phrase formed by rearranging the letters of a 
//different word or phrase, typically using all the original letters exactly once. 
//
// 
// Example 1: 
// Input: s = "anagram", t = "nagaram"
//Output: true
// Example 2: 
// Input: s = "rat", t = "car"
//Output: false
// 
// 
// Constraints: 
//
// 
// 1 <= s.length, t.length <= 5 * 10⁴ 
// s and t consist of lowercase English letters. 
// 
//
// 
// Follow up: What if the inputs contain Unicode characters? How would you 
//adapt your solution to such a case? 
// Related Topics Hash Table String Sorting 👍 4547 👎 207
    
package leetcode.editor.en;
/** 
 * id: 242
 * title: Valid Anagram
 * author: Ives.He 
 * date: 2022-04-06 23:24:13
 * for TEST copy:
 * import leetcode.editor.en.P242_ValidAnagram .Solution;
 * P242_ValidAnagram_Test
 */
public class P242_ValidAnagram{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        char[] chars = new char[26];
        char[] chars2 = new char[26];
        for(int i =0; i<s.length(); i++ ){
            chars[s.charAt(i)-'a']++;
            chars2[t.charAt(i)-'a']++;
        }
        for(int i =0; i<26; i++){
            if(chars[i]!=chars2[i])return false;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
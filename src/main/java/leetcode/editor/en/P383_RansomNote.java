//Given two strings ransomNote and magazine, return true if ransomNote can be 
//constructed from magazine and false otherwise. 
//
// Each letter in magazine can only be used once in ransomNote. 
//
// 
// Example 1: 
// Input: ransomNote = "a", magazine = "b"
//Output: false
// Example 2: 
// Input: ransomNote = "aa", magazine = "ab"
//Output: false
// Example 3: 
// Input: ransomNote = "aa", magazine = "aab"
//Output: true
// 
// 
// Constraints: 
//
// 
// 1 <= ransomNote.length, magazine.length <= 10⁵ 
// ransomNote and magazine consist of lowercase English letters. 
// 
// Related Topics Hash Table String Counting 👍 1623 👎 294
    
package leetcode.editor.en;
/** 
 * id: 383
 * title: Ransom Note
 * author: Ives.He 
 * date: 2022-04-09 02:51:39
 * for TEST copy:
 * import leetcode.editor.en.P383_RansomNote .Solution;
 * P383_RansomNote_Test
 */
public class P383_RansomNote{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length())return false;
        char[] table = new char[26];
        for(int i = 0; i<magazine.length();i++){
            table[magazine.charAt(i)-'a']++;
        }
        for(int i = 0; i<ransomNote.length();i++){
            char h = ransomNote.charAt(i);
            if(table[h -'a']-1<0)return false;
            table[h-'a']--;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
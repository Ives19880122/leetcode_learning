//Given a 0-indexed string word and a character ch, reverse the segment of word 
//that starts at index 0 and ends at the index of the first occurrence of ch (
//inclusive). If the character ch does not exist in word, do nothing. 
//
// 
// For example, if word = "abcdefd" and ch = "d", then you should reverse the 
//segment that starts at 0 and ends at 3 (inclusive). The resulting string will be 
//"dcbaefd". 
// 
//
// Return the resulting string. 
//
// 
// Example 1: 
//
// 
//Input: word = "abcdefd", ch = "d"
//Output: "dcbaefd"
//Explanation: The first occurrence of "d" is at index 3. 
//Reverse the part of word from 0 to 3 (inclusive), the resulting string is 
//"dcbaefd".
// 
//
// Example 2: 
//
// 
//Input: word = "xyxzxe", ch = "z"
//Output: "zxyxxe"
//Explanation: The first and only occurrence of "z" is at index 3.
//Reverse the part of word from 0 to 3 (inclusive), the resulting string is 
//"zxyxxe".
// 
//
// Example 3: 
//
// 
//Input: word = "abcd", ch = "z"
//Output: "abcd"
//Explanation: "z" does not exist in word.
//You should not do any reverse operation, the resulting string is "abcd".
// 
//
// 
// Constraints: 
//
// 
// 1 <= word.length <= 250 
// word consists of lowercase English letters. 
// ch is a lowercase English letter. 
// 
// Related Topics Two Pointers String 👍 309 👎 6
    
package leetcode.editor.en;
/** 
 * id: 2000
 * title: Reverse Prefix of Word
 * author: Ives.He 
 * date: 2022-04-14 22:05:01
 * for TEST copy:
 * import leetcode.editor.en.P2000_ReversePrefixOfWord .Solution;
 * P2000_ReversePrefixOfWord_Test
 */
public class P2000_ReversePrefixOfWord{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reversePrefix(String word, char ch) {
        int idx = word.indexOf(ch);
        String d = word.substring(idx+1);
        StringBuilder pre = new StringBuilder();
        while(idx>=0){
            pre.append(word.charAt(idx));
            idx--;
        }
        return pre+d;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
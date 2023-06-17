//You are given the strings key and message, which represent a cipher key and a 
//secret message, respectively. The steps to decode message are as follows: 
//
// 
// Use the first appearance of all 26 lowercase English letters in key as the 
//order of the substitution table. 
// Align the substitution table with the regular English alphabet. 
// Each letter in message is then substituted using the table. 
// Spaces ' ' are transformed to themselves. 
// 
//
// 
// For example, given key = "happy boy" (actual key would have at least one 
//instance of each letter in the alphabet), we have the partial substitution table of 
//('h' -> 'a', 'a' -> 'b', 'p' -> 'c', 'y' -> 'd', 'b' -> 'e', 'o' -> 'f'). 
// 
//
// Return the decoded message. 
//
// 
// Example 1: 
// 
// 
//Input: key = "the quick brown fox jumps over the lazy dog", message = "vkbs 
//bs t suepuv"
//Output: "this is a secret"
//Explanation: The diagram above shows the substitution table.
//It is obtained by taking the first appearance of each letter in "the quick 
//brown fox jumps over the lazy dog".
// 
//
// Example 2: 
// 
// 
//Input: key = "eljuxhpwnyrdgtqkviszcfmabo", message = "zwx hnfx lqantp mnoeius 
//ycgk vcnjrdb"
//Output: "the five boxing wizards jump quickly"
//Explanation: The diagram above shows the substitution table.
//It is obtained by taking the first appearance of each letter in 
//"eljuxhpwnyrdgtqkviszcfmabo".
// 
//
// 
// Constraints: 
//
// 
// 26 <= key.length <= 2000 
// key consists of lowercase English letters and ' '. 
// key contains every letter in the English alphabet ('a' to 'z') at least once.
// 
// 1 <= message.length <= 2000 
// message consists of lowercase English letters and ' '. 
// 
//
// Related Topics Hash Table String 👍 698 👎 73
    
package leetcode.editor.en;

import java.util.Arrays;

/**
 * id: 2325
 * title: Decode the Message
 * author: Ives.He 
 * date: 2023-06-17 09:15:51
 * for TEST copy:
 * import leetcode.editor.en.P2325_DecodeTheMessage .Solution;
 * P2325_DecodeTheMessage_Test
 */
public class P2325_DecodeTheMessage{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String decodeMessage(String key, String message) {
        int [] dic = new int[26];
        Arrays.fill(dic,-1);
        int idx = 0;
        // 解碼表
        for(int i=0; i<key.length(); i++){
            char c = key.charAt(i);
            if(c ==' ' || dic[c-'a']!=-1) continue;
            dic[c-'a'] = idx++;
        }
        // 解開message
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<message.length();i++){
            char c = message.charAt(i);
            if(c == ' '){
                sb.append(c);
            }else{
                sb.append((char)(dic[ c - 'a']+'a'));
            }
        }
        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
//You are given two strings word1 and word2. Merge the strings by adding 
//letters in alternating order, starting with word1. If a string is longer than the 
//other, append the additional letters onto the end of the merged string. 
//
// Return the merged string. 
//
// 
// Example 1: 
//
// 
//Input: word1 = "abc", word2 = "pqr"
//Output: "apbqcr"
//Explanation: The merged string will be merged as so:
//word1:  a   b   c
//word2:    p   q   r
//merged: a p b q c r
// 
//
// Example 2: 
//
// 
//Input: word1 = "ab", word2 = "pqrs"
//Output: "apbqrs"
//Explanation: Notice that as word2 is longer, "rs" is appended to the end.
//word1:  a   b 
//word2:    p   q   r   s
//merged: a p b q   r   s
// 
//
// Example 3: 
//
// 
//Input: word1 = "abcd", word2 = "pq"
//Output: "apbqcd"
//Explanation: Notice that as word1 is longer, "cd" is appended to the end.
//word1:  a   b   c   d
//word2:    p   q 
//merged: a p b q c   d
// 
//
// 
// Constraints: 
//
// 
// 1 <= word1.length, word2.length <= 100 
// word1 and word2 consist of lowercase English letters. 
// 
//
// Related Topics Two Pointers String 👍 746 👎 15
    
package leetcode.editor.en;
/** 
 * id: 1768
 * title: Merge Strings Alternately
 * author: Ives.He 
 * date: 2022-09-26 23:26:12
 * for TEST copy:
 * import leetcode.editor.en.P1768_MergeStringsAlternately .Solution;
 * P1768_MergeStringsAlternately_Test
 */
public class P1768_MergeStringsAlternately{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l = 0;
        int r = 0;
        StringBuffer sb = new StringBuffer();
        while(true){
            if(sb.length()%2==0&&l<word1.length()){
                sb.append(word1.charAt(l++));
            }else if(sb.length()%2==1&&r<word2.length()){
                sb.append(word2.charAt(r++));
            }else if(l<word1.length()){
                sb.append(word1.charAt(l++));
            }else if(r<word2.length()){
                sb.append(word2.charAt(r++));
            }else {
                break;
            }
        }
        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
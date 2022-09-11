//Given a string s, reverse the order of characters in each word within a 
//sentence while still preserving whitespace and initial word order. 
//
// 
// Example 1: 
// Input: s = "Let's take LeetCode contest"
//Output: "s'teL ekat edoCteeL tsetnoc"
// Example 2: 
// Input: s = "God Ding"
//Output: "doG gniD"
// 
// 
// Constraints: 
//
// 
// 1 <= s.length <= 5 * 10⁴ 
// s contains printable ASCII characters. 
// s does not contain any leading or trailing spaces. 
// There is at least one word in s. 
// All the words in s are separated by a single space. 
// 
// Related Topics Two Pointers String 👍 3287 👎 192
    
package leetcode.editor.en;

/**
 * id: 557
 * title: Reverse Words in a String III
 * author: Ives.He 
 * date: 2022-09-11 11:58:29
 * for TEST copy:
 * import leetcode.editor.en.P557_ReverseWordsInAStringIii .Solution;
 * P557_ReverseWordsInAStringIii_Test
 */
public class P557_ReverseWordsInAStringIii{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseWords(String s) {
        String[] sp = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<sp.length; i++){
            sb.append(helper(sp[i]));
            if(i< sp.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    private String helper(String s){
        char[] words = s.toCharArray();
        int start = 0;
        int end = words.length-1;
        while(start<end){
            char tmp = words[start];
            words[start] = words[end];
            words[end] = tmp;
            start++;
            end--;
        }
        return String.valueOf(words);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
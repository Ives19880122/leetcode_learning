//Given a string s of lower and upper case English letters. 
//
// A good string is a string which doesn't have two adjacent characters s[i] 
//and s[i + 1] where: 
//
// 
// 0 <= i <= s.length - 2 
// s[i] is a lower-case letter and s[i + 1] is the same letter but in upper-
//case or vice-versa. 
// 
//
// To make the string good, you can choose two adjacent characters that make 
//the string bad and remove them. You can keep doing this until the string becomes 
//good. 
//
// Return the string after making it good. The answer is guaranteed to be 
//unique under the given constraints. 
//
// Notice that an empty string is also good. 
//
// 
// Example 1: 
//
// 
//Input: s = "leEeetcode"
//Output: "leetcode"
//Explanation: In the first step, either you choose i = 1 or i = 2, both will 
//result "leEeetcode" to be reduced to "leetcode".
// 
//
// Example 2: 
//
// 
//Input: s = "abBAcC"
//Output: ""
//Explanation: We have many possible scenarios, and all lead to the same answer.
// For example:
//"abBAcC" --> "aAcC" --> "cC" --> ""
//"abBAcC" --> "abBA" --> "aA" --> ""
// 
//
// Example 3: 
//
// 
//Input: s = "s"
//Output: "s"
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 100 
// s contains only lower and upper case English letters. 
// 
//
// Related Topics String Stack 👍 2344 👎 109
    
package leetcode.editor.en;

import java.util.Stack;

/**
 * id: 1544
 * title: Make The String Great
 * author: Ives.He 
 * date: 2023-09-10 16:15:23
 * for TEST copy:
 * import leetcode.editor.en.P1544_MakeTheStringGreat .Solution;
 * P1544_MakeTheStringGreat_Test
 */
public class P1544_MakeTheStringGreat{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String makeGood(String s) {
        Stack<Character> sc = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(!sc.isEmpty() && (c-32==sc.peek()||c+32==sc.peek())) sc.pop();
            else sc.add(c);
        }
        while(!sc.isEmpty()){
            sb.append(sc.pop());
        }
        return sb.reverse().toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
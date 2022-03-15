//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']
//', determine if the input string is valid. 
//
// An input string is valid if: 
//
// 
// Open brackets must be closed by the same type of brackets. 
// Open brackets must be closed in the correct order. 
// 
//
// 
// Example 1: 
//
// 
//Input: s = "()"
//Output: true
// 
//
// Example 2: 
//
// 
//Input: s = "()[]{}"
//Output: true
// 
//
// Example 3: 
//
// 
//Input: s = "(]"
//Output: false
// 
//
// Example 4: 
//
// 
//Input: s = "([)]"
//Output: false
// 
//
// Example 5: 
//
// 
//Input: s = "{[]}"
//Output: true
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 10⁴ 
// s consists of parentheses only '()[]{}'. 
// 
// Related Topics String Stack 👍 9282 👎 366

package leetcode.editor.en;

import java.util.Stack;

/**
  * id：20
  * title：Valid Parentheses
  * author: Ives.He
  * date：2021-10-07 12:47:01
  * version2 : char
*/
public class P20_ValidParentheses {
    public static void main(String[] args) {
        Solution solution = new P20_ValidParentheses().new Solution();
        System.out.println("Hello world");
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0) return false; // 單數判斷
        char[] arr = s.toCharArray();
        int step =0;
        Stack<Character> tmp = new Stack();
        while (step<arr.length){
            char cur = arr[step];
            if('('== cur ||'['== cur ||'{'== cur){
                tmp.push(arr[step]);
            }else if(tmp.isEmpty() ||
                    ( ')'== cur && '('!= tmp.pop()) ||
                    ( ']'== cur && '['!= tmp.pop()) ||
                    ( '}'== cur && '{'!= tmp.pop())) {
                return false;
            }
            step++;
        }
        return tmp.isEmpty();  // 正常通過為空
    }
}
//leetcode submit region end(Prohibit modification and deletion)

} 
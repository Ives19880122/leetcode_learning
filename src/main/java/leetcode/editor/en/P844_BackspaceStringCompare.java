//Given two strings s and t, return true if they are equal when both are typed 
//into empty text editors. '#' means a backspace character. 
//
// Note that after backspacing an empty text, the text will continue empty. 
//
// 
// Example 1: 
//
// 
//Input: s = "ab#c", t = "ad#c"
//Output: true
//Explanation: Both s and t become "ac".
// 
//
// Example 2: 
//
// 
//Input: s = "ab##", t = "c#d#"
//Output: true
//Explanation: Both s and t become "".
// 
//
// Example 3: 
//
// 
//Input: s = "a#c", t = "b"
//Output: false
//Explanation: s becomes "c" while t becomes "b".
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length, t.length <= 200 
// s and t only contain lowercase letters and '#' characters. 
// 
//
// 
// Follow up: Can you solve it in O(n) time and O(1) space? 
//
// Related Topics Two Pointers String Stack Simulation 👍 6655 👎 303
    
package leetcode.editor.en;
/** 
 * id: 844
 * title: Backspace String Compare
 * author: Ives.He 
 * date: 2023-09-10 16:08:24
 * for TEST copy:
 * import leetcode.editor.en.P844_BackspaceStringCompare .Solution;
 * P844_BackspaceStringCompare_Test
 */
public class P844_BackspaceStringCompare{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean backspaceCompare(String s, String t) {
        int p = s.length()-1;
        int q = t.length()-1;
        int backSC = 0;
        int backTC = 0;
        while(p>=0 || q>=0){
            if(p>=0 && '#'==s.charAt(p)){
                backSC++;
                p--;
                continue;
            }
            if(p>=0 && backSC>0){
                backSC--;
                p--;
                continue;
            }
            if(q>=0 && '#'==t.charAt(q)){
                backTC++;
                q--;
                continue;
            }
            if(q>=0 && backTC>0){
                backTC--;
                q--;
                continue;
            }
            if(q<0||p<0) return false;
            if(s.charAt(p)!=t.charAt(q)) return false;
            p--;
            q--;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
//Given two binary strings a and b, return their sum as a binary string. 
//
// 
// Example 1: 
// Input: a = "11", b = "1"
//Output: "100"
// Example 2: 
// Input: a = "1010", b = "1011"
//Output: "10101"
// 
// 
// Constraints: 
//
// 
// 1 <= a.length, b.length <= 10⁴ 
// a and b consist only of '0' or '1' characters. 
// Each string does not contain leading zeros except for the zero itself. 
// 
// Related Topics Math String Bit Manipulation Simulation 👍 3516 👎 417

package leetcode.editor.en;

/**
  * id：67
  * title：Add Binary
  * author: Ives.He
  * date：2021-10-14 12:35:50
  * for TEST copy:
  * import leetcode.editor.en.P67_AddBinary .Solution;
  * P67_AddBinary_Test
  */
public class P67_AddBinary{
  
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int l = a.length()-1;
        int r = b.length()-1;
        int plus = 0;
        while (l>=0 || r >= 0) {
            if(l>=0) plus += a.charAt(l--) - '0';
            if(r>=0) plus += b.charAt(r--) - '0';
            sb.append(plus%2);
            plus/=2;
        }
        if(plus!=0) sb.append(plus);
        return sb.reverse().toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)


}
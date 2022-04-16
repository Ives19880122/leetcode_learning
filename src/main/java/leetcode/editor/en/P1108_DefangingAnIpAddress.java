//Given a valid (IPv4) IP address, return a defanged version of that IP address.
// 
//
// A defanged IP address replaces every period "." with "[.]". 
//
// 
// Example 1: 
// Input: address = "1.1.1.1"
//Output: "1[.]1[.]1[.]1"
// Example 2: 
// Input: address = "255.100.50.0"
//Output: "255[.]100[.]50[.]0"
// 
// 
// Constraints: 
//
// 
// The given address is a valid IPv4 address. 
// Related Topics String 👍 1072 👎 1457
    
package leetcode.editor.en;
/** 
 * id: 1108
 * title: Defanging an IP Address
 * author: Ives.He 
 * date: 2022-04-17 00:14:59
 * for TEST copy:
 * import leetcode.editor.en.P1108_DefangingAnIpAddress .Solution;
 * P1108_DefangingAnIpAddress_Test
 */
public class P1108_DefangingAnIpAddress{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
//Given an integer n, return true if it is a power of two. Otherwise, return 
//false. 
//
// An integer n is a power of two, if there exists an integer x such that n == 2
//ˣ. 
//
// 
// Example 1: 
//
// 
//Input: n = 1
//Output: true
//Explanation: 2⁰ = 1
// 
//
// Example 2: 
//
// 
//Input: n = 16
//Output: true
//Explanation: 2⁴ = 16
// 
//
// Example 3: 
//
// 
//Input: n = 3
//Output: false
// 
//
// 
// Constraints: 
//
// 
// -2³¹ <= n <= 2³¹ - 1 
// 
//
// 
//Follow up: Could you solve it without loops/recursion? Related Topics Math 
//Bit Manipulation Recursion 👍 4086 👎 317
    
package leetcode.editor.en;
/** 
 * id: 231
 * title: Power of Two
 * author: Ives.He 
 * date: 2022-09-18 11:21:46
 * for TEST copy:
 * import leetcode.editor.en.P231_PowerOfTwo .Solution;
 * P231_PowerOfTwo_Test
 */
public class P231_PowerOfTwo{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<0) return false;
        return Integer.toBinaryString(n).replace("0","").length()==1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
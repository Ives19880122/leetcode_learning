//Given an integer num, repeatedly add all its digits until the result has only 
//one digit, and return it. 
//
// 
// Example 1: 
//
// 
//Input: num = 38
//Output: 2
//Explanation: The process is
//38 --> 3 + 8 --> 11
//11 --> 1 + 1 --> 2 
//Since 2 has only one digit, return it.
// 
//
// Example 2: 
//
// 
//Input: num = 0
//Output: 0
// 
//
// 
// Constraints: 
//
// 
// 0 <= num <= 2³¹ - 1 
// 
//
// 
// Follow up: Could you do it without any loop/recursion in O(1) runtime? 
// Related Topics Math Simulation Number Theory 👍 2417 👎 1644
    
package leetcode.editor.en;
/** 
 * id: 258
 * title: Add Digits
 * author: Ives.He 
 * date: 2022-04-23 12:08:32
 * for TEST copy:
 * import leetcode.editor.en.P258_AddDigits .Solution;
 * P258_AddDigits_Test
 */
public class P258_AddDigits{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int addDigits(int num) {
        // 參考wiki Digit sum 公式撰寫
        int k = (int) Math.log10(num)+1;
        int result = 0;
        for(int i =0; i<k; i++){
            result += (num % (int)Math.pow(10,i+1) - num % (int)Math.pow(10,i))
                    / (int)Math.pow(10,i);
        }
        if(result>9) result = addDigits(result);
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
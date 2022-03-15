//Given a signed 32-bit integer x, return x with its digits reversed. If 
//reversing x causes the value to go outside the signed 32-bit integer range [-2³¹, 2³¹ -
// 1], then return 0. 
//
// Assume the environment does not allow you to store 64-bit integers (signed 
//or unsigned). 
//
// 
// Example 1: 
// Input: x = 123
//Output: 321
// Example 2: 
// Input: x = -123
//Output: -321
// Example 3: 
// Input: x = 120
//Output: 21
// Example 4: 
// Input: x = 0
//Output: 0
// 
// 
// Constraints: 
//
// 
// -2³¹ <= x <= 2³¹ - 1 
// 
// Related Topics Math 👍 5744 👎 8596
    
package leetcode.editor.en;
/** 
 * @author  Ives.He 
 * @date    2021-10-03 23:23:48 
 */
public class P7_ReverseInteger {
    public static void main(String[] args) {
        Solution solution = new P7_ReverseInteger().new Solution();
    }    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int reverse(int x) {
        int result = x;
        try{
            if(x<0){
                result = x*-1;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(result).reverse();
            result = Integer.parseInt(sb.toString());
            if(x<0){
                result *= -1;
            }
        }catch (NumberFormatException e){
            result = 0;
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
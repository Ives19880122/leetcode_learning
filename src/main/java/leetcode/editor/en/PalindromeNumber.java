//Given an integer x, return true if x is palindrome integer. 
//
// An integer is a palindrome when it reads the same backward as forward. For 
//example, 121 is palindrome while 123 is not. 
//
// 
// Example 1: 
//
// 
//Input: x = 121
//Output: true
// 
//
// Example 2: 
//
// 
//Input: x = -121
//Output: false
//Explanation: From left to right, it reads -121. From right to left, it 
//becomes 121-. Therefore it is not a palindrome.
// 
//
// Example 3: 
//
// 
//Input: x = 10
//Output: false
//Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
// 
//
// Example 4: 
//
// 
//Input: x = -101
//Output: false
// 
//
// 
// Constraints: 
//
// 
// -2³¹ <= x <= 2³¹ - 1 
// 
//
// 
//Follow up: Could you solve it without converting the integer to a string? 
//Related Topics Math 👍 4090 👎 1870
    
package leetcode.editor.en;
/** 
 * @author  Ives.He 
 * @date    2021-10-04 00:17:58 
 */
public class PalindromeNumber{    
    public static void main(String[] args) {
        Solution solution = new PalindromeNumber().new Solution();    
    }    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPalindrome(int x) {
        boolean result = false;
        try{
            int tmp = x;
            if(x<0){
                throw new NumberFormatException();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(tmp).reverse();
            tmp = Integer.parseInt(sb.toString());
            if(x==tmp){
                result = true;
            }
        }catch (NumberFormatException e){
            result = false;
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
//Given an integer number n, return the difference between the product of its 
//digits and the sum of its digits.
// 
// Example 1: 
//
// 
//Input: n = 234
//Output: 15 
//Explanation: 
//Product of digits = 2 * 3 * 4 = 24 
//Sum of digits = 2 + 3 + 4 = 9 
//Result = 24 - 9 = 15
// 
//
// Example 2: 
//
// 
//Input: n = 4421
//Output: 21
//Explanation: 
//Product of digits = 4 * 4 * 2 * 1 = 32 
//Sum of digits = 4 + 4 + 2 + 1 = 11 
//Result = 32 - 11 = 21
// 
//
// 
// Constraints: 
//
// 
// 1 <= n <= 10^5 
// 
// Related Topics Math 👍 1561 👎 198
    
package leetcode.editor.en;
/** 
 * id: 1281
 * title: Subtract the Product and Sum of Digits of an Integer
 * author: Ives.He 
 * date: 2022-09-20 22:49:38
 * for TEST copy:
 * import leetcode.editor.en.P1281_SubtractTheProductAndSumOfDigitsOfAnInteger .Solution;
 * P1281_SubtractTheProductAndSumOfDigitsOfAnInteger_Test
 */
public class P1281_SubtractTheProductAndSumOfDigitsOfAnInteger{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int subtractProductAndSum(int n) {
        int pro = 1;
        int sum = 0;
        while(n!=0){
            int tmp = n%10;
            pro *= tmp;
            sum += tmp;
            n /= 10;
        }
        return pro - sum;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
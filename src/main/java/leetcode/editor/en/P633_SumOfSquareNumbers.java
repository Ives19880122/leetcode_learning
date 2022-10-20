//Given a non-negative integer c, decide whether there're two integers a and b 
//such that a² + b² = c. 
//
// 
// Example 1: 
//
// 
//Input: c = 5
//Output: true
//Explanation: 1 * 1 + 2 * 2 = 5
// 
//
// Example 2: 
//
// 
//Input: c = 3
//Output: false
// 
//
// 
// Constraints: 
//
// 
// 0 <= c <= 2³¹ - 1 
// 
//
// Related Topics Math Two Pointers Binary Search 👍 1791 👎 496
    
package leetcode.editor.en;
/** 
 * id: 633
 * title: Sum of Square Numbers
 * author: Ives.He 
 * date: 2022-10-20 23:49:49
 * for TEST copy:
 * import leetcode.editor.en.P633_SumOfSquareNumbers .Solution;
 * P633_SumOfSquareNumbers_Test
 */
public class P633_SumOfSquareNumbers{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean judgeSquareSum(int c) {
        long l = 0;
        long r = (long)Math.sqrt(c);
        while(l<=r){
            if(c>l*l+r*r) l++;
            else if(c<l*l+r*r) r--;
            else return true;
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
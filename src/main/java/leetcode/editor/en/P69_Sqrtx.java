//Given a non-negative integer x, compute and return the square root of x. 
//
// Since the return type is an integer, the decimal digits are truncated, and 
//only the integer part of the result is returned. 
//
// Note: You are not allowed to use any built-in exponent function or operator, 
//such as pow(x, 0.5) or x ** 0.5. 
//
// 
// Example 1: 
//
// 
//Input: x = 4
//Output: 2
// 
//
// Example 2: 
//
// 
//Input: x = 8
//Output: 2
//Explanation: The square root of 8 is 2.82842..., and since the decimal part 
//is truncated, 2 is returned. 
//
// 
// Constraints: 
//
// 
// 0 <= x <= 2³¹ - 1 
// 
// Related Topics Math Binary Search 👍 2657 👎 2695

package leetcode.editor.en;
/**
  * id：69
  * title：Sqrt(x)
  * author: Ives.He
  * date：2021-10-15 12:40:50
  * for TEST copy:
  * import leetcode.editor.en.P69_Sqrtx .Solution;
  * P69_Sqrtx_Test
  */
public class P69_Sqrtx{
  
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int mySqrt(int x) {
        // 換成double避免溢位
        double target = x;
        double idx = 0;
        while(idx<=target){
            if(idx*idx == target){
                return (int)idx;
            }else if(idx*idx < target){
                idx += 1;
            }else if(idx*idx > target){
                return (int)idx-1;
            }
        }
        return (int)idx;
    }
}
//leetcode submit region end(Prohibit modification and deletion)


}
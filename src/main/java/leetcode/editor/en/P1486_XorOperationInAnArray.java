//You are given an integer n and an integer start. 
//
// Define an array nums where nums[i] = start + 2 * i (0-indexed) and n == nums.
//length. 
//
// Return the bitwise XOR of all elements of nums. 
//
// 
// Example 1: 
//
// 
//Input: n = 5, start = 0
//Output: 8
//Explanation: Array nums is equal to [0, 2, 4, 6, 8] where (0 ^ 2 ^ 4 ^ 6 ^ 8) 
//= 8.
//Where "^" corresponds to bitwise XOR operator.
// 
//
// Example 2: 
//
// 
//Input: n = 4, start = 3
//Output: 8
//Explanation: Array nums is equal to [3, 5, 7, 9] where (3 ^ 5 ^ 7 ^ 9) = 8.
// 
//
// 
// Constraints: 
//
// 
// 1 <= n <= 1000 
// 0 <= start <= 1000 
// n == nums.length 
// 
// Related Topics Math Bit Manipulation 👍 792 👎 281

package leetcode.editor.en;
/**
  * id：1486
  * title：XOR Operation in an Array
  * author: Ives.He
  * date：2022-04-13 13:29:50
  * for TEST copy:
  * import leetcode.editor.en.P1486_XorOperationInAnArray .Solution;
  * P1486_XorOperationInAnArray_Test
  */
public class P1486_XorOperationInAnArray{
  
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int xorOperation(int n, int start) {
        int result = start;
        int idx = 1;
        while(idx<n){
            result ^= start + 2*idx;
            idx++;
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)


}
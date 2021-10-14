//You are given a large integer represented as an integer array digits, where 
//each digits[i] is the iᵗʰ digit of the integer. The digits are ordered from most 
//significant to least significant in left-to-right order. The large integer does 
//not contain any leading 0's. 
//
// Increment the large integer by one and return the resulting array of digits. 
//
//
// 
// Example 1: 
//
// 
//Input: digits = [1,2,3]
//Output: [1,2,4]
//Explanation: The array represents the integer 123.
//Incrementing by one gives 123 + 1 = 124.
//Thus, the result should be [1,2,4].
// 
//
// Example 2: 
//
// 
//Input: digits = [4,3,2,1]
//Output: [4,3,2,2]
//Explanation: The array represents the integer 4321.
//Incrementing by one gives 4321 + 1 = 4322.
//Thus, the result should be [4,3,2,2].
// 
//
// Example 3: 
//
// 
//Input: digits = [0]
//Output: [1]
//Explanation: The array represents the integer 0.
//Incrementing by one gives 0 + 1 = 1.
//Thus, the result should be [1].
// 
//
// Example 4: 
//
// 
//Input: digits = [9]
//Output: [1,0]
//Explanation: The array represents the integer 9.
//Incrementing by one gives 9 + 1 = 10.
//Thus, the result should be [1,0].
// 
//
// 
// Constraints: 
//
// 
// 1 <= digits.length <= 100 
// 0 <= digits[i] <= 9 
// digits does not contain any leading 0's. 
// 
// Related Topics Array Math 👍 3015 👎 3688

package leetcode.editor.en;

import java.util.Stack;

/**
  * id：66
  * title：Plus One
  * author: Ives.He
  * date：2021-10-14 12:35:54
  * for TEST copy:
  * import leetcode.editor.en.P66_PlusOne .Solution;
  * P66_PlusOne_Test
  */
public class P66_PlusOne{
  
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] plusOne(int[] digits) {
        // stack收集 雙迴圈
        Stack<Integer> dp = new Stack<>();
        int r = digits.length-1;
        int plus = 1;
        while (r>=0){
            int tmp = digits[r] + plus;
            dp.push(tmp%10);
            plus = tmp/10;
            if(r==0 && plus >0){
                dp.push(plus);
            }
            r--;
        }
        digits = new int[dp.size()];
        r = 0;
        while(!dp.isEmpty()){
            digits[r] = dp.pop();
            r++;
        }
        return digits;
    }
}
//leetcode submit region end(Prohibit modification and deletion)


}
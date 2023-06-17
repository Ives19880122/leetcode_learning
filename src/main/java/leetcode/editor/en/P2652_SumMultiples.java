//Given a positive integer n, find the sum of all integers in the range [1, n] 
//inclusive that are divisible by 3, 5, or 7. 
//
// Return an integer denoting the sum of all numbers in the given range 
//satisfying the constraint. 
//
// 
// Example 1: 
//
// 
//Input: n = 7
//Output: 21
//Explanation: Numbers in the range [1, 7] that are divisible by 3, 5, or 7 are 
//3, 5, 6, 7. The sum of these numbers is 21.
// 
//
// Example 2: 
//
// 
//Input: n = 10
//Output: 40
//Explanation: Numbers in the range [1, 10] that are divisible by 3, 5, or 7 
//are 3, 5, 6, 7, 9, 10. The sum of these numbers is 40.
// 
//
// Example 3: 
//
// 
//Input: n = 9
//Output: 30
//Explanation: Numbers in the range [1, 9] that are divisible by 3, 5, or 7 are 
//3, 5, 6, 7, 9. The sum of these numbers is 30.
// 
//
// 
// Constraints: 
//
// 
// 1 <= n <= 10³ 
// 
//
// Related Topics Array Math Number Theory 👍 247 👎 17
    
package leetcode.editor.en;
/** 
 * id: 2652
 * title: Sum Multiples
 * author: Ives.He 
 * date: 2023-06-17 11:11:30
 * for TEST copy:
 * import leetcode.editor.en.P2652_SumMultiples .Solution;
 * P2652_SumMultiples_Test
 */
public class P2652_SumMultiples{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int sumOfMultiples(int n) {
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(i%3==0||i%5==0||i%7==0){
                sum+=i;
            }
        }
        return sum;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
//Given two non-negative integers low and high. Return the count of odd numbers 
//between low and high (inclusive). 
//
// 
// Example 1: 
//
// 
//Input: low = 3, high = 7
//Output: 3
//Explanation: The odd numbers between 3 and 7 are [3,5,7]. 
//
// Example 2: 
//
// 
//Input: low = 8, high = 10
//Output: 1
//Explanation: The odd numbers between 8 and 10 are [9]. 
//
// 
// Constraints: 
//
// 
// 0 <= low <= high <= 10^9 
// Related Topics Math 👍 1034 👎 77
    
package leetcode.editor.en;
/** 
 * id: 1523
 * title: Count Odd Numbers in an Interval Range
 * author: Ives.He 
 * date: 2022-09-19 23:17:45
 * for TEST copy:
 * import leetcode.editor.en.P1523_CountOddNumbersInAnIntervalRange .Solution;
 * P1523_CountOddNumbersInAnIntervalRange_Test
 */
public class P1523_CountOddNumbersInAnIntervalRange{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countOdds(int low, int high) {
        int range = high - low + 1;
        if(range%2==0) return range/2;
        else{
            return (high%2==0) ? (range)/2  : (range+1)/2;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
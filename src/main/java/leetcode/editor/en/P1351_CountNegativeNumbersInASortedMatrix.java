//Given a m x n matrix grid which is sorted in non-increasing order both row-
//wise and column-wise, return the number of negative numbers in grid. 
//
// 
// Example 1: 
//
// 
//Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
//Output: 8
//Explanation: There are 8 negatives number in the matrix.
// 
//
// Example 2: 
//
// 
//Input: grid = [[3,2],[1,0]]
//Output: 0
// 
//
// 
// Constraints: 
//
// 
// m == grid.length 
// n == grid[i].length 
// 1 <= m, n <= 100 
// -100 <= grid[i][j] <= 100 
// 
//
// 
//Follow up: Could you find an 
//O(n + m) solution?
//
// Related Topics Array Binary Search Matrix 👍 2766 👎 83
    
package leetcode.editor.en;

import java.util.Arrays;

/**
 * id: 1351
 * title: Count Negative Numbers in a Sorted Matrix
 * author: Ives.He 
 * date: 2022-10-20 22:05:09
 * for TEST copy:
 * import leetcode.editor.en.P1351_CountNegativeNumbersInASortedMatrix .Solution;
 * P1351_CountNegativeNumbersInASortedMatrix_Test
 */
public class P1351_CountNegativeNumbersInASortedMatrix{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        int len = grid[0].length;
        for (int i = 0; i < grid.length; i++) {
            int l = 0;
            int r = len-1;
            while(l<=r){
                int m = l + (r-l)/2;
                if(grid[i][m]>=0) l= m+1;
                else r = m-1;
            }
            int c = len - (r+1);
            count += c;
        }
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
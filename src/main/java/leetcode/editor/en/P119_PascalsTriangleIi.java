//Given an integer rowIndex, return the rowIndexᵗʰ (0-indexed) row of the 
//Pascal's triangle. 
//
// In Pascal's triangle, each number is the sum of the two numbers directly 
//above it as shown: 
//
// 
// Example 1: 
// Input: rowIndex = 3
//Output: [1,3,3,1]
// Example 2: 
// Input: rowIndex = 0
//Output: [1]
// Example 3: 
// Input: rowIndex = 1
//Output: [1,1]
// 
// 
// Constraints: 
//
// 
// 0 <= rowIndex <= 33 
// 
//
// 
// Follow up: Could you optimize your algorithm to use only O(rowIndex) extra 
//space? 
// Related Topics Array Dynamic Programming 👍 3127 👎 279
    
package leetcode.editor.en;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * id: 119
 * title: Pascal's Triangle II
 * author: Ives.He 
 * date: 2022-09-15 23:43:13
 * for TEST copy:
 * import leetcode.editor.en.P119_PascalsTriangleIi .Solution;
 * P119_PascalsTriangleIi_Test
 */
public class P119_PascalsTriangleIi{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> getRow(int rowIndex) {
        int [][] dp = new int[rowIndex+1][rowIndex+1];
        dp[0][0] = 1;
        for(int i=1; i<=rowIndex; i++){
            for(int j=0; j<=rowIndex; j++){
                if(i==j) dp[i][j]=1;
                else if(j==0) dp[i][j]=1;
                else dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
            }
        }
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<dp[rowIndex].length; i++){
            result.add(dp[rowIndex][i]);
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
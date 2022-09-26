//Given a square matrix mat, return the sum of the matrix diagonals. 
//
// Only include the sum of all the elements on the primary diagonal and all the 
//elements on the secondary diagonal that are not part of the primary diagonal. 
//
// 
// Example 1: 
// 
// 
//Input: mat = [[1,2,3],
//              [4,5,6],
//              [7,8,9]]
//Output: 25
//Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
//Notice that element mat[1][1] = 5 is counted only once.
// 
//
// Example 2: 
//
// 
//Input: mat = [[1,1,1,1],
//              [1,1,1,1],
//              [1,1,1,1],
//              [1,1,1,1]]
//Output: 8
// 
//
// Example 3: 
//
// 
//Input: mat = [[5]]
//Output: 5
// 
//
// 
// Constraints: 
//
// 
// n == mat.length == mat[i].length 
// 1 <= n <= 100 
// 1 <= mat[i][j] <= 100 
// 
//
// Related Topics Array Matrix 👍 1556 👎 23
    
package leetcode.editor.en;
/** 
 * id: 1572
 * title: Matrix Diagonal Sum
 * author: Ives.He 
 * date: 2022-09-26 23:12:20
 * for TEST copy:
 * import leetcode.editor.en.P1572_MatrixDiagonalSum .Solution;
 * P1572_MatrixDiagonalSum_Test
 */
public class P1572_MatrixDiagonalSum{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int diagonalSum(int[][] mat) {
        if(mat.length==1) return mat[0][0];
        int len = mat.length;
        int x = 0;
        int y = 0;
        int yn = len-1;
        int sum = 0;
        while (x<len){
            if(y==yn){
                sum += mat[x][y++];
                yn--;
            }
            else sum += mat[x][y++] + mat[x][yn--];
            x++;
        }
        return sum;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
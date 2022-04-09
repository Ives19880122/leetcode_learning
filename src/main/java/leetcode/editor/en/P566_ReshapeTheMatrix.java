//In MATLAB, there is a handy function called reshape which can reshape an m x 
//n matrix into a new one with a different size r x c keeping its original data. 
//
// You are given an m x n matrix mat and two integers r and c representing the 
//number of rows and the number of columns of the wanted reshaped matrix. 
//
// The reshaped matrix should be filled with all the elements of the original 
//matrix in the same row-traversing order as they were. 
//
// If the reshape operation with given parameters is possible and legal, output 
//the new reshaped matrix; Otherwise, output the original matrix. 
//
// 
// Example 1: 
//
// 
//Input: mat = [[1,2],[3,4]], r = 1, c = 4
//Output: [[1,2,3,4]]
// 
//
// Example 2: 
//
// 
//Input: mat = [[1,2],[3,4]], r = 2, c = 4
//Output: [[1,2],[3,4]]
// 
//
// 
// Constraints: 
//
// 
// m == mat.length 
// n == mat[i].length 
// 1 <= m, n <= 100 
// -1000 <= mat[i][j] <= 1000 
// 1 <= r, c <= 300 
// 
// Related Topics Array Matrix Simulation 👍 2127 👎 242
    
package leetcode.editor.en;
/** 
 * id: 566
 * title: Reshape the Matrix
 * author: Ives.He 
 * date: 2022-04-09 14:30:05
 * for TEST copy:
 * import leetcode.editor.en.P566_ReshapeTheMatrix .Solution;
 * P566_ReshapeTheMatrix_Test
 */
public class P566_ReshapeTheMatrix{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length*mat[0].length != r*c)return mat;
        int[][] result = new int[r][c];
        int idxr = 0;
        int idxc = 0;
        int oc = mat[0].length;
        for(int i = 0; i<r; i++){
            for(int j =0; j<c; j++){
                result[i][j]=mat[idxr][idxc++];
                if(idxc==oc){
                    idxc=0;
                    idxr++;
                }
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
//Write an efficient algorithm that searches for a value target in an m x n 
//integer matrix matrix. This matrix has the following properties: 
//
// 
// Integers in each row are sorted from left to right. 
// The first integer of each row is greater than the last integer of the 
//previous row. 
// 
//
// 
// Example 1: 
//
// 
//Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
//Output: true
// 
//
// Example 2: 
//
// 
//Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
//Output: false
// 
//
// 
// Constraints: 
//
// 
// m == matrix.length 
// n == matrix[i].length 
// 1 <= m, n <= 100 
// -10⁴ <= matrix[i][j], target <= 10⁴ 
// 
// Related Topics Array Binary Search Matrix 👍 7137 👎 262
    
package leetcode.editor.en;
/** 
 * id: 74
 * title: Search a 2D Matrix
 * author: Ives.He 
 * date: 2022-04-09 16:15:31
 * for TEST copy:
 * import leetcode.editor.en.P74_SearchA2dMatrix .Solution;
 * P74_SearchA2dMatrix_Test
 */
public class P74_SearchA2dMatrix{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int cols = matrix[0].length;
        int rows = matrix.length;
        // 超過matrix範圍區間則回傳false
        if(matrix[0][0]>target || matrix[rows-1][cols-1]<target)return false;
        int ref = -1;
        while(rows>0){
            if(matrix[rows-1][cols-1]>=target && matrix[rows-1][0]<=target) {
                ref=rows-1;
                break;
            }
            rows--;
        }
        // 找到某列範圍內才執行
        if(ref!=-1){
            int idx = 0;
            while(idx<=cols){
                // 左右夾擊,如果碰到target回傳true
                if(target==matrix[ref][idx]||target==matrix[ref][cols-1]) return true;
                idx++;
                cols--;
            }
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
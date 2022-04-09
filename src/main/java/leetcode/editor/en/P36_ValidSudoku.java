//Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be 
//validated according to the following rules: 
//
// 
// Each row must contain the digits 1-9 without repetition. 
// Each column must contain the digits 1-9 without repetition. 
// Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 
//without repetition. 
// 
//
// Note: 
//
// 
// A Sudoku board (partially filled) could be valid but is not necessarily 
//solvable. 
// Only the filled cells need to be validated according to the mentioned rules. 
//
// 
//
// 
// Example 1: 
//
// 
//Input: board = 
//[["5","3",".",".","7",".",".",".","."]
//,["6",".",".","1","9","5",".",".","."]
//,[".","9","8",".",".",".",".","6","."]
//,["8",".",".",".","6",".",".",".","3"]
//,["4",".",".","8",".","3",".",".","1"]
//,["7",".",".",".","2",".",".",".","6"]
//,[".","6",".",".",".",".","2","8","."]
//,[".",".",".","4","1","9",".",".","5"]
//,[".",".",".",".","8",".",".","7","9"]]
//Output: true
// 
//
// Example 2: 
//
// 
//Input: board = 
//[["8","3",".",".","7",".",".",".","."]
//,["6",".",".","1","9","5",".",".","."]
//,[".","9","8",".",".",".",".","6","."]
//,["8",".",".",".","6",".",".",".","3"]
//,["4",".",".","8",".","3",".",".","1"]
//,["7",".",".",".","2",".",".",".","6"]
//,[".","6",".",".",".",".","2","8","."]
//,[".",".",".","4","1","9",".",".","5"]
//,[".",".",".",".","8",".",".","7","9"]]
//Output: false
//Explanation: Same as Example 1, except with the 5 in the top left corner 
//being modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is 
//invalid.
// 
//
// 
// Constraints: 
//
// 
// board.length == 9 
// board[i].length == 9 
// board[i][j] is a digit 1-9 or '.'. 
// 
// Related Topics Array Hash Table Matrix 👍 4802 👎 693
    
package leetcode.editor.en;
/** 
 * id: 36
 * title: Valid Sudoku
 * author: Ives.He 
 * date: 2022-04-09 16:55:16
 * for TEST copy:
 * import leetcode.editor.en.P36_ValidSudoku .Solution;
 * P36_ValidSudoku_Test
 */
public class P36_ValidSudoku{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i<9; i++){
          // 列驗證
          if(valid(board[i])) return false;
          char[] cow = new char[9];
          // 收集行資料
          for(int j = 0; j <9; j++){
              cow[j] = board[j][i];

              // 3x3驗證
              if(i%3==0&&j%3==0){
                  char[] unit = matrixTo1D(board,i,j);
                  if(valid(unit)) return false;
              }
          }
          // 行驗證
          if(valid(cow)) return false;
        }
        return true;
    }
    // 轉置矩陣
    private char[] matrixTo1D(char[][] unit, int row, int col){
        char[] nums = new char[9];
        int idx = 0;
        for(int i = row; i<row+3; i++){
            for(int j = col; j<col+3; j++){
                nums[idx++]=unit[i][j];
            }
        }
        return nums;
    }
    // 驗證,注意未輸入資料是. 要過濾掉
    private boolean valid(char[] arr){
        char[] nums = new char[9];
        for(char num : arr){
            if(num !='.') {
                nums[num -'1']++;
                if(nums[num-'1']>1)
                    return true;
            }
        }
        return false;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}
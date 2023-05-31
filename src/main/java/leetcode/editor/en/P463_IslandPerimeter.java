//You are given row x col grid representing a map where grid[i][j] = 1 
//represents land and grid[i][j] = 0 represents water. 
//
// Grid cells are connected horizontally/vertically (not diagonally). The grid 
//is completely surrounded by water, and there is exactly one island (i.e., one or 
//more connected land cells). 
//
// The island doesn't have "lakes", meaning the water inside isn't connected to 
//the water around the island. One cell is a square with side length 1. The grid 
//is rectangular, width and height don't exceed 100. Determine the perimeter of 
//the island. 
//
// 
// Example 1: 
// 
// 
//Input: grid = [[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]
//Output: 16
//Explanation: The perimeter is the 16 yellow stripes in the image above.
// 
//
// Example 2: 
//
// 
//Input: grid = [[1]]
//Output: 4
// 
//
// Example 3: 
//
// 
//Input: grid = [[1,0]]
//Output: 4
// 
//
// 
// Constraints: 
//
// 
// row == grid.length 
// col == grid[i].length 
// 1 <= row, col <= 100 
// grid[i][j] is 0 or 1. 
// There is exactly one island in grid. 
// 
//
// Related Topics Array Depth-First Search Breadth-First Search Matrix 👍 5665 ?
//? 276
    
package leetcode.editor.en;
/** 
 * id: 463
 * title: Island Perimeter
 * author: Ives.He 
 * date: 2023-05-31 23:30:24
 * for TEST copy:
 * import leetcode.editor.en.P463_IslandPerimeter .Solution;
 * P463_IslandPerimeter_Test
 */
public class P463_IslandPerimeter{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        private int result = 0;
        private int rowMax = 0;
        private int colMax = 0;

        public int islandPerimeter(int[][] grid) {
            this.rowMax = grid.length-1;
            this.colMax = grid[0].length-1;
            int[][] viewed = new int[grid.length][grid[0].length];
            // from start 0,0
            for(int i =0; i<grid.length; i++){
                for(int j=0; j<grid[0].length; j++){
                    if(viewed[i][j]!=0) continue;
                    viewed[i][j] = 1;
                    helper(i,j,grid);
                }
            }
            // from end grid.length-1, grid.length-1
            for(int i =rowMax; i>0; i--){
                for(int j=colMax; j>0; j--){
                    if(viewed[i][j]!=0) continue;
                    viewed[i][j] = 1;
                    helper(i,j,grid);
                }
            }
            return this.result;
        }

        private void helper(int i,int j, int[][]grid){
            if(grid[i][j]==0) return;
            if(isCorner(i,j)){
                if(this.rowMax==0&&this.colMax==0) this.result+=2;
                else if(this.rowMax==0||this.colMax==0)this.result += 1;
                this.result+=2;
            }
            else if(isEdge(i,j)) {
                if(this.rowMax==0 || this.colMax==0) this.result+=1;
                this.result +=1;
            }
            if(isNextEmpty(i+1,j,grid)) this.result +=1;
            if(isNextEmpty(i-1,j,grid)) this.result +=1;
            if(isNextEmpty(i,j+1,grid)) this.result +=1;
            if(isNextEmpty(i,j-1,grid)) this.result +=1;
        }

        private boolean isCorner(int row, int col){
            return (row==0 && col==0) || (row==0 && col==this.colMax) ||
                    (row==this.rowMax && col==0) || (row==this.rowMax && col==this.colMax);
        }

        private boolean isEdge(int row, int col){
            return row==0 || row == this.rowMax || col == 0 || col == this.colMax;
        }

        private boolean isNextEmpty(int rowN, int colN, int[][]grid){
            if(isOverRange(rowN,colN)||grid[rowN][colN]==1) return false;
            return true;
        }

        private boolean isOverRange(int row, int col){
            return row<0 || row > rowMax || col<0 || col> colMax;
        }
}
//leetcode submit region end(Prohibit modification and deletion)

}
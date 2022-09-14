//You are given an m x n binary matrix grid. An island is a group of 1's (
//representing land) connected 4-directionally (horizontal or vertical.) You may assume 
//all four edges of the grid are surrounded by water. 
//
// The area of an island is the number of cells with a value 1 in the island. 
//
// Return the maximum area of an island in grid. If there is no island, return 0
//. 
//
// 
// Example 1: 
//
// 
//Input: grid = [[0,0,1,0,0,0,0,1,0,0,0,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,1,1,
//0,1,0,0,0,0,0,0,0,0],[0,1,0,0,1,1,0,0,1,0,1,0,0],[0,1,0,0,1,1,0,0,1,1,1,0,0],[0,
//0,0,0,0,0,0,0,0,0,1,0,0],[0,0,0,0,0,0,0,1,1,1,0,0,0],[0,0,0,0,0,0,0,1,1,0,0,0,0]
//]
//Output: 6
//Explanation: The answer is not 11, because the island must be connected 4-
//directionally.
// 
//
// Example 2: 
//
// 
//Input: grid = [[0,0,0,0,0,0,0,0]]
//Output: 0
// 
//
// 
// Constraints: 
//
// 
// m == grid.length 
// n == grid[i].length 
// 1 <= m, n <= 50 
// grid[i][j] is either 0 or 1. 
// 
// Related Topics Array Depth-First Search Breadth-First Search Union Find 
//Matrix 👍 7875 👎 176
    
package leetcode.editor.en;
/** 
 * id: 695
 * title: Max Area of Island
 * author: Ives.He 
 * date: 2022-09-15 00:11:09
 * for TEST copy:
 * import leetcode.editor.en.P695_MaxAreaOfIsland .Solution;
 * P695_MaxAreaOfIsland_Test
 */
public class P695_MaxAreaOfIsland{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        public int maxAreaOfIsland(int[][] grid) {
            int result = 0;
            for(int i = 0; i<grid.length; i++){
                for(int j=0; j<grid[0].length; j++){
                    if(grid[i][j]==1)
                        result = Math.max(result,floodFill(grid,i,j));
                }
            }
            return result;
        }
        private int floodFill(int[][] image, int sr, int sc) {
            int size = 1;
            int origin = image[sr][sc];
            image[sr][sc] = 2;        // change color
            if(origin!=2){            // never traversal
                if(sr+1 >= 0 && sr+1 < image.length && 1 == image[sr+1][sc]) size += floodFill(image,sr+1,sc);     // down
                if(sr-1 >= 0 && sr-1 < image.length && 1 == image[sr-1][sc]) size += floodFill(image,sr-1,sc);     // up
                if(sc+1 >= 0 && sc+1 < image[0].length && 1 == image[sr][sc+1]) size += floodFill(image,sr,sc+1);  // right
                if(sc-1 >= 0 && sc-1 < image[0].length && 1 == image[sr][sc-1]) size += floodFill(image,sr,sc-1);  // left
            }
            return size;
        }
}
//leetcode submit region end(Prohibit modification and deletion)

}
//You are given an m x n grid where each cell can have one of three values: 
//
// 
// 0 representing an empty cell, 
// 1 representing a fresh orange, or 
// 2 representing a rotten orange. 
// 
//
// Every minute, any fresh orange that is 4-directionally adjacent to a rotten 
//orange becomes rotten. 
//
// Return the minimum number of minutes that must elapse until no cell has a 
//fresh orange. If this is impossible, return -1. 
//
// 
// Example 1: 
//
// 
//Input: grid = [[2,1,1],[1,1,0],[0,1,1]]
//Output: 4
// 
//
// Example 2: 
//
// 
//Input: grid = [[2,1,1],[0,1,1],[1,0,1]]
//Output: -1
//Explanation: The orange in the bottom left corner (row 2, column 0) is never 
//rotten, because rotting only happens 4-directionally.
// 
//
// Example 3: 
//
// 
//Input: grid = [[0,2]]
//Output: 0
//Explanation: Since there are already no fresh oranges at minute 0, the answer 
//is just 0.
// 
//
// 
// Constraints: 
//
// 
// m == grid.length 
// n == grid[i].length 
// 1 <= m, n <= 10 
// grid[i][j] is 0, 1, or 2. 
// 
// Related Topics Array Breadth-First Search Matrix 👍 8305 👎 304
    
package leetcode.editor.en;

import java.util.LinkedList;
import java.util.Queue;

/**
 * id: 994
 * title: Rotting Oranges
 * author: Ives.He 
 * date: 2022-09-17 00:48:04
 * for TEST copy:
 * import leetcode.editor.en.P994_RottingOranges .Solution;
 * P994_RottingOranges_Test
 */
public class P994_RottingOranges{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int orangesRotting(int[][] grid) {
        int[][] dirs = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        int rotten = 0;
        int count = 0;
        int m = grid.length;
        int n = grid[0].length;
        Queue<Integer[]> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(grid[i][j]==2){
                    queue.add(new Integer[]{i,j});
                    rotten++;
                }
                if(grid[i][j]!=0) count++;
            }
        }
        int cost = 0;
        if(rotten==count) return cost;
        // BFS
        while(!queue.isEmpty()){
            int size = queue.size();
            cost++;
            while (size>0){
                Integer[] root = queue.poll();
                for(int[] dir: dirs){
                    int x = root[0] + dir[0];
                    int y = root[1] + dir[1];
                    if(x>=0 && y>=0 && x<m && y<n && grid[x][y]==1){
                        queue.add(new Integer[]{x,y});
                        grid[x][y]=2;
                        rotten++;
                    }
                }
                size--;
            }
            if(rotten==count) return cost;
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
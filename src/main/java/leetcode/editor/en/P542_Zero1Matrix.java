//Given an m x n binary matrix mat, return the distance of the nearest 0 for 
//each cell. 
//
// The distance between two adjacent cells is 1. 
//
// 
// Example 1: 
//
// 
//Input: mat = [[0,0,0],[0,1,0],[0,0,0]]
//Output: [[0,0,0],[0,1,0],[0,0,0]]
// 
//
// Example 2: 
//
// 
//Input: mat = [[0,0,0],[0,1,0],[1,1,1]]
//Output: [[0,0,0],[0,1,0],[1,2,1]]
// 
//
// 
// Constraints: 
//
// 
// m == mat.length 
// n == mat[i].length 
// 1 <= m, n <= 10⁴ 
// 1 <= m * n <= 10⁴ 
// mat[i][j] is either 0 or 1. 
// There is at least one 0 in mat. 
// 
// Related Topics Array Dynamic Programming Breadth-First Search Matrix 👍 5622 
//👎 280
    
package leetcode.editor.en;

import java.util.LinkedList;
import java.util.Queue;

/**
 * id: 542
 * title: 01 Matrix
 * author: Ives.He 
 * date: 2022-09-16 22:49:04
 * for TEST copy:
 * import leetcode.editor.en.P542_Zero1Matrix .Solution;
 * P542_Zero1Matrix_Test
 */
public class P542_Zero1Matrix{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        Queue<Integer[]> que = new LinkedList<>();
        int m = mat.length;
        int n = mat[0].length;
        boolean[][] isVisited = new boolean[m][n];
        int[][] res = new int[m][n];
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length;j++){
                if(mat[i][j]==0) {
                    que.add(new Integer[]{i, j});
                    isVisited[i][j]=true;
                }
            }
        }
        // BFS 找最短距離
        int cost = 0;
        while(!que.isEmpty()){
            int size = que.size();
            while(size>0){
                Integer[] parent = que.poll();
                int r = parent[0];
                int c = parent[1];
                if(mat[r][c]==1) res[r][c] = cost;
                if(canMoveTo(isVisited,r+1,c)) addToQue(isVisited,r+1,c,que);
                if(canMoveTo(isVisited,r-1,c)) addToQue(isVisited,r-1,c,que);
                if(canMoveTo(isVisited,r,c+1)) addToQue(isVisited,r,c+1,que);
                if(canMoveTo(isVisited,r,c-1)) addToQue(isVisited,r,c-1,que);
                size--;
            }
            cost++;
        }
        return res;
    }
    private boolean canMoveTo(boolean[][]isVisited, int r, int c){
        return r>=0 && r<isVisited.length && c>=0 && c<isVisited[0].length && !isVisited[r][c];
    }
    private void addToQue(boolean[][]isVisited, int r, int c, Queue<Integer[]> que){
        que.add(new Integer[]{r,c});
        isVisited[r][c] = true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
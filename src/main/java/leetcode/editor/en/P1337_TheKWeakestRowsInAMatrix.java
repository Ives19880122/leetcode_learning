//You are given an m x n binary matrix mat of 1's (representing soldiers) and 0
//'s (representing civilians). The soldiers are positioned in front of the 
//civilians. That is, all the 1's will appear to the left of all the 0's in each row. 
//
// A row i is weaker than a row j if one of the following is true: 
//
// 
// The number of soldiers in row i is less than the number of soldiers in row j.
// 
// Both rows have the same number of soldiers and i < j. 
// 
//
// Return the indices of the k weakest rows in the matrix ordered from weakest 
//to strongest. 
//
// 
// Example 1: 
//
// 
//Input: mat = 
//[[1,1,0,0,0],
// [1,1,1,1,0],
// [1,0,0,0,0],
// [1,1,0,0,0],
// [1,1,1,1,1]], 
//k = 3
//Output: [2,0,3]
//Explanation: 
//The number of soldiers in each row is: 
//- Row 0: 2 
//- Row 1: 4 
//- Row 2: 1 
//- Row 3: 2 
//- Row 4: 5 
//The rows ordered from weakest to strongest are [2,0,3,1,4].
// 
//
// Example 2: 
//
// 
//Input: mat = 
//[[1,0,0,0],
// [1,1,1,1],
// [1,0,0,0],
// [1,0,0,0]], 
//k = 2
//Output: [0,2]
//Explanation: 
//The number of soldiers in each row is: 
//- Row 0: 1 
//- Row 1: 4 
//- Row 2: 1 
//- Row 3: 1 
//The rows ordered from weakest to strongest are [0,2,3,1].
// 
//
// 
// Constraints: 
//
// 
// m == mat.length 
// n == mat[i].length 
// 2 <= n, m <= 100 
// 1 <= k <= m 
// matrix[i][j] is either 0 or 1. 
// 
//
// Related Topics Array Binary Search Sorting Heap (Priority Queue) Matrix 👍 28
//38 👎 163
    
package leetcode.editor.en;

import java.util.Arrays;

/**
 * id: 1337
 * title: The K Weakest Rows in a Matrix
 * author: Ives.He 
 * date: 2022-10-20 22:31:12
 * for TEST copy:
 * import leetcode.editor.en.P1337_TheKWeakestRowsInAMatrix .Solution;
 * P1337_TheKWeakestRowsInAMatrix_Test
 */
public class P1337_TheKWeakestRowsInAMatrix{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int len = mat[0].length;
        for (int i = 0; i < mat.length; i++) {
            Arrays.sort(mat[i]);
            int l = 0;
            int r = len-1;
            // 找1的count數
            while(l<=r){
                int m = l + (r-l)/2;
                if(mat[i][m]>0) r = m-1;
                else l=m+1;
            }
            int count = len - l;
            // 重複利用mat陣列暫存count數與原始index位置
            mat[i][0] = count;
            mat[i][1] = i;
        }
        // 使用count數排序
        Arrays.sort(mat,(a,b)->a[0]-b[0]);
        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {
            result[i] = mat[i][1];
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
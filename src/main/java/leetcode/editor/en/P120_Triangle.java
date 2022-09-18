//Given a triangle array, return the minimum path sum from top to bottom. 
//
// For each step, you may move to an adjacent number of the row below. More 
//formally, if you are on index i on the current row, you may move to either index i 
//or index i + 1 on the next row. 
//
// 
// Example 1: 
//
// 
//Input: triangle = [[2],[3,4],[6,5,7],[4,1,8,3]]
//Output: 11
//Explanation: The triangle looks like:
//   2
//  3 4
// 6 5 7
//4 1 8 3
//The minimum path sum from top to bottom is 2 + 3 + 5 + 1 = 11 (underlined 
//above).
// 
//
// Example 2: 
//
// 
//Input: triangle = [[-10]]
//Output: -10
// 
//
// 
// Constraints: 
//
// 
// 1 <= triangle.length <= 200 
// triangle[0].length == 1 
// triangle[i].length == triangle[i - 1].length + 1 
// -10⁴ <= triangle[i][j] <= 10⁴ 
// 
//
// 
//Follow up: Could you do this using only O(n) extra space, where n is the 
//total number of rows in the triangle? Related Topics Array Dynamic Programming 👍 689
//6 👎 440
    
package leetcode.editor.en;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * id: 120
 * title: Triangle
 * author: Ives.He 
 * date: 2022-09-17 13:07:24
 * for TEST copy:
 * import leetcode.editor.en.P120_Triangle .Solution;
 * P120_Triangle_Test
 */
public class P120_Triangle{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    int result = Integer.MAX_VALUE;
    public int minimumTotal(List<List<Integer>> triangle) {
        // 由下而上
        for(int i = triangle.size()-2; i>=0; i--){
            for(int j = 0; j<triangle.get(i).size();j++){
               triangle.get(i).set(j, triangle.get(i).get(j) + Math.min(triangle.get(i+1).get(j),triangle.get(i+1).get(j+1)));
            }
        }
        return triangle.get(0).get(0);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
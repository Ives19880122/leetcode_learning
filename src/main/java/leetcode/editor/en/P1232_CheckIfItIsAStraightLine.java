//You are given an array coordinates, coordinates[i] = [x, y], where [x, y] 
//represents the coordinate of a point. Check if these points make a straight line in 
//the XY plane. 
//
// 
//
// 
// Example 1: 
//
// 
//
// 
//Input: coordinates = [[1,2],[2,3],[3,4],[4,5],[5,6],[6,7]]
//Output: true
// 
//
// Example 2: 
//
// 
//
// 
//Input: coordinates = [[1,1],[2,2],[3,4],[4,5],[5,6],[7,7]]
//Output: false
// 
//
// 
// Constraints: 
//
// 
// 2 <= coordinates.length <= 1000 
// coordinates[i].length == 2 
// -10^4 <= coordinates[i][0], coordinates[i][1] <= 10^4 
// coordinates contains no duplicate point. 
// 
//
// Related Topics Array Math Geometry 👍 1077 👎 161
    
package leetcode.editor.en;
/** 
 * id: 1232
 * title: Check If It Is a Straight Line
 * author: Ives.He 
 * date: 2022-09-24 10:37:37
 * for TEST copy:
 * import leetcode.editor.en.P1232_CheckIfItIsAStraightLine .Solution;
 * P1232_CheckIfItIsAStraightLine_Test
 */
public class P1232_CheckIfItIsAStraightLine{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        /**
         * 斜率相同為同一直線 (y1-y0)/(x1-x0) = (yi-y0)/(xi-x0)
         * 避免分母為0 => (y1-y0)*(xi-x0) = (yi-y0)*(x1-x0)
         */
        int x0 = coordinates[0][0];
        int y0 = coordinates[0][1];
        int x1 = coordinates[1][0];
        int y1 = coordinates[1][1];
        for (int[] point: coordinates) {
            if((y1-y0)*(point[0]-x0)!=(point[1]-y0)*(x1-x0)) return false;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
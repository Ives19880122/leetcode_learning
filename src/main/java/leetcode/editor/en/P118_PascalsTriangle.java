//Given an integer numRows, return the first numRows of Pascal's triangle. 
//
// In Pascal's triangle, each number is the sum of the two numbers directly 
//above it as shown: 
//
// 
// Example 1: 
// Input: numRows = 5
//Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
// Example 2: 
// Input: numRows = 1
//Output: [[1]]
// 
// 
// Constraints: 
//
// 
// 1 <= numRows <= 30 
// 
// Related Topics Array Dynamic Programming 👍 5392 👎 204
    
package leetcode.editor.en;

import java.util.ArrayList;
import java.util.List;

/**
 * id: 118
 * title: Pascal's Triangle
 * author: Ives.He 
 * date: 2022-04-09 15:14:58
 * for TEST copy:
 * import leetcode.editor.en.P118_PascalsTriangle .Solution;
 * P118_PascalsTriangle_Test
 */
public class P118_PascalsTriangle{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> r = new ArrayList<>();
        // 參考調整 雙迴圈
        for(int i=0; i<numRows;i++){
            List<Integer> tmp = new ArrayList<>();
            for(int j=0;j<=i;j++){
                // 左右端點
                if(j==0||j==i){
                    tmp.add(1);
                // 巴斯卡三角形疊加區域
                }else{
                    tmp.add(r.get(i-1).get(j-1)+r.get(i-1).get(j));
                }
            }
            r.add(tmp);
        }
        return r;
    }
//    private void helper(List<List<Integer>> r , int level){
//        List<Integer> ll = r.get(level);
//        if(level==0) {
//            ll.add(1);
//        }else{
//            ll.add(1);
//            // 巴斯卡三角形疊加
//            Iterator<Integer> prev = r.get(level-1).iterator();
//            int sum = prev.next();
//            while(prev.hasNext()){
//                int tmp = prev.next();
//                ll.add(sum+tmp);
//                sum = tmp;
//            }
//            ll.add(1);
//        }
//    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
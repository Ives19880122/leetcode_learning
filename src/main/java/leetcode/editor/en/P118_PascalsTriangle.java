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
import java.util.Iterator;
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
        int i =0;
        List<List<Integer>> r = new ArrayList<>();
        while(i<numRows){
            r.add(new ArrayList<>());
            helper(r,i+1);
            i++;
        }
        return r;
    }
    private void helper(List<List<Integer>> r , int level){
        List<Integer> ll = r.get(level-1);
        if(level==1) {
            ll.add(1);
        }else if(level==2){
            ll.add(1);
            ll.add(1);
        }else{
            ll.add(1);
            List<Integer> b = r.get(level-2);
            Iterator<Integer> itt = b.iterator();
            int sum = itt.next();
            while(itt.hasNext()){
                int tmp = itt.next();
                ll.add(sum+tmp);
                sum = tmp;
            }
            ll.add(1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
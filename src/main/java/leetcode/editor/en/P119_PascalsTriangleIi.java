//Given an integer rowIndex, return the rowIndexᵗʰ (0-indexed) row of the 
//Pascal's triangle. 
//
// In Pascal's triangle, each number is the sum of the two numbers directly 
//above it as shown: 
//
// 
// Example 1: 
// Input: rowIndex = 3
//Output: [1,3,3,1]
// Example 2: 
// Input: rowIndex = 0
//Output: [1]
// Example 3: 
// Input: rowIndex = 1
//Output: [1,1]
// 
// 
// Constraints: 
//
// 
// 0 <= rowIndex <= 33 
// 
//
// 
// Follow up: Could you optimize your algorithm to use only O(rowIndex) extra 
//space? 
// Related Topics Array Dynamic Programming 👍 3127 👎 279
    
package leetcode.editor.en;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * id: 119
 * title: Pascal's Triangle II
 * author: Ives.He 
 * date: 2022-09-15 23:43:13
 * for TEST copy:
 * import leetcode.editor.en.P119_PascalsTriangleIi .Solution;
 * P119_PascalsTriangleIi_Test
 */
public class P119_PascalsTriangleIi{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex==0) return new ArrayList<>(Arrays.asList(1));
        if(rowIndex==1) return new ArrayList<>(Arrays.asList(1,1));
        List<Integer> pre = getRow(rowIndex-1);
        while(--rowIndex>0){
            pre.add(pre.remove(0)+pre.get(0));
        }
        pre.add(1);     // tail
        return pre;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
//You are given an array of strings names, and an array heights that consists 
//of distinct positive integers. Both arrays are of length n. 
//
// For each index i, names[i] and heights[i] denote the name and height of the 
//iᵗʰ person. 
//
// Return names sorted in descending order by the people's heights. 
//
// 
// Example 1: 
//
// 
//Input: names = ["Mary","John","Emma"], heights = [180,165,170]
//Output: ["Mary","Emma","John"]
//Explanation: Mary is the tallest, followed by Emma and John.
// 
//
// Example 2: 
//
// 
//Input: names = ["Alice","Bob","Bob"], heights = [155,185,150]
//Output: ["Bob","Alice","Bob"]
//Explanation: The first Bob is the tallest, followed by Alice and the second 
//Bob.
// 
//
// 
// Constraints: 
//
// 
// n == names.length == heights.length 
// 1 <= n <= 10³ 
// 1 <= names[i].length <= 20 
// 1 <= heights[i] <= 10⁵ 
// names[i] consists of lower and upper case English letters. 
// All the values of heights are distinct. 
// 
//
// Related Topics Array Hash Table String Sorting 👍 217 👎 3
    
package leetcode.editor.en;

import java.util.Arrays;

/**
 * id: 2418
 * title: Sort the People
 * author: Ives.He 
 * date: 2022-09-30 23:51:37
 * for TEST copy:
 * import leetcode.editor.en.P2418_SortThePeople .Solution;
 * P2418_SortThePeople_Test
 */
public class P2418_SortThePeople{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        if(names.length==1) return names;
        Object [][] data = new Object[names.length][2];
        for (int i = 0; i < data.length; i++) {
            data[i][0] = heights[i];
            data[i][1] = names[i];
        }
        Arrays.sort(data, (Object[] a, Object[] b) -> (Integer) b[0]- (Integer) a[0]);
        for (int i = 0; i < names.length; i++) {
            names[i] = (String)data[i][1];
        }
        return names;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
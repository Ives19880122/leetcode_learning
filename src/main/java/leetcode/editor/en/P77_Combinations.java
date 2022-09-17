//Given two integers n and k, return all possible combinations of k numbers 
//chosen from the range [1, n]. 
//
// You may return the answer in any order. 
//
// 
// Example 1: 
//
// 
//Input: n = 4, k = 2
//Output: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
//Explanation: There are 4 choose 2 = 6 total combinations.
//Note that combinations are unordered, i.e., [1,2] and [2,1] are considered to 
//be the same combination.
// 
//
// Example 2: 
//
// 
//Input: n = 1, k = 1
//Output: [[1]]
//Explanation: There is 1 choose 1 = 1 total combination.
// 
//
// 
// Constraints: 
//
// 
// 1 <= n <= 20 
// 1 <= k <= n 
// 
// Related Topics Backtracking 👍 5031 👎 163
    
package leetcode.editor.en;

import java.util.LinkedList;
import java.util.List;

/**
 * id: 77
 * title: Combinations
 * author: Ives.He 
 * date: 2022-09-17 23:59:43
 * for TEST copy:
 * import leetcode.editor.en.P77_Combinations .Solution;
 * P77_Combinations_Test
 */
public class P77_Combinations{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    private List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> combine(int n, int k) {
        if(n<=0||k<=0) return res;
        backtrack(n,k,1,new LinkedList<>());
        return res;
    }
    private void backtrack(int n, int k, int start, LinkedList<Integer> track){
        if(k==track.size()){
            res.add(new LinkedList<>(track));
            return;
        }
        for (int i = start; i <= n ; i++) {
            if(track.contains(i)) continue;
            if(!track.isEmpty()&&track.peekLast()>i) continue;
            track.add(i);                       // 加入元素
            backtrack(n,k,start+1,track);  // 執行backtrack
            track.removeLast();                 // 移除選擇
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
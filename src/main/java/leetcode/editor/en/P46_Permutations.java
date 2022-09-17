//Given an array nums of distinct integers, return all the possible 
//permutations. You can return the answer in any order. 
//
// 
// Example 1: 
// Input: nums = [1,2,3]
//Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
// Example 2: 
// Input: nums = [0,1]
//Output: [[0,1],[1,0]]
// Example 3: 
// Input: nums = [1]
//Output: [[1]]
// 
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 6 
// -10 <= nums[i] <= 10 
// All the integers of nums are unique. 
// 
// Related Topics Array Backtracking 👍 12919 👎 219
    
package leetcode.editor.en;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * id: 46
 * title: Permutations
 * author: Ives.He 
 * date: 2022-09-17 23:17:32
 * for TEST copy:
 * import leetcode.editor.en.P46_Permutations .Solution;
 * P46_Permutations_Test
 */
public class P46_Permutations{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    List<List<Integer>> result = new LinkedList<>();
    public List<List<Integer>> permute(int[] nums) {
        backTrack(nums,new LinkedList<>());
        return result;
    }
    private void backTrack(int[] nums, LinkedList<Integer> track){
        if(nums.length==track.size()){              // 已走到端點
            result.add(new LinkedList<>(track));    // 建立新的避免被取消選擇影響
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(track.contains(nums[i])) continue;   // 跳過已選擇的資料
            track.add(nums[i]);                     // 選擇元素
            backTrack(nums,track);                  // 往下一輪選擇
            track.removeLast();                     // 取消選擇
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
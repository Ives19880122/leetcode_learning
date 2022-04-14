//You are given a 0-indexed integer array nums and a target element target. 
//
// A target index is an index i such that nums[i] == target. 
//
// Return a list of the target indices of nums after sorting nums in non-
//decreasing order. If there are no target indices, return an empty list. The returned 
//list must be sorted in increasing order. 
//
// 
// Example 1: 
//
// 
//Input: nums = [1,2,5,2,3], target = 2
//Output: [1,2]
//Explanation: After sorting, nums is [1,2,2,3,5].
//The indices where nums[i] == 2 are 1 and 2.
// 
//
// Example 2: 
//
// 
//Input: nums = [1,2,5,2,3], target = 3
//Output: [3]
//Explanation: After sorting, nums is [1,2,2,3,5].
//The index where nums[i] == 3 is 3.
// 
//
// Example 3: 
//
// 
//Input: nums = [1,2,5,2,3], target = 5
//Output: [4]
//Explanation: After sorting, nums is [1,2,2,3,5].
//The index where nums[i] == 5 is 4.
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 100 
// 1 <= nums[i], target <= 100 
// 
// Related Topics Array Binary Search Sorting 👍 563 👎 29
    
package leetcode.editor.en;

import java.util.ArrayList;
import java.util.List;

/**
 * id: 2089
 * title: Find Target Indices After Sorting Array
 * author: Ives.He 
 * date: 2022-04-14 21:05:27
 * for TEST copy:
 * import leetcode.editor.en.P2089_FindTargetIndicesAfterSortingArray .Solution;
 * P2089_FindTargetIndicesAfterSortingArray_Test
 */
public class P2089_FindTargetIndicesAfterSortingArray{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> list = new ArrayList<>(nums.length);
        // 參考答案, 不sort改寫
        int freq = 0;
        int idx = 0;
        // 判定找到幾個target,以及最小的idx位置
        for(int num : nums){
            if(num==target) freq++;
            if(num<target) idx++;
        }
        for(int i = 0; i<freq; i++){
            list.add(idx++);
        }
        return list;
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}
//Given an integer array nums and an integer k, return the k most frequent 
//elements. You may return the answer in any order. 
//
// 
// Example 1: 
// Input: nums = [1,1,1,2,2,3], k = 2
//Output: [1,2]
// Example 2: 
// Input: nums = [1], k = 1
//Output: [1]
// 
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 10⁵ 
// k is in the range [1, the number of unique elements in the array]. 
// It is guaranteed that the answer is unique. 
// 
//
// 
// Follow up: Your algorithm's time complexity must be better than O(n log n), 
//where n is the array's size. 
// Related Topics Array Hash Table Divide and Conquer Sorting Heap (Priority 
//Queue) Bucket Sort Counting Quickselect 👍 7972 👎 345
    
package leetcode.editor.en;

import java.util.*;
import java.util.Map.Entry;
/**
 * id: 347
 * title: Top K Frequent Elements
 * author: Ives.He 
 * date: 2022-04-09 11:18:26
 * for TEST copy:
 * import leetcode.editor.en.P347_TopKFrequentElements .Solution;
 * P347_TopKFrequentElements_Test
 */
public class P347_TopKFrequentElements{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // 想法:map裝載後,使用stream排序回傳array
        Map<Integer,Integer> map = new HashMap<>();
        for(int val : nums){
            map.compute(val,(key,v)-> v!=null ? v+1:1);
        }
        return map.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .mapToInt(d->d.getKey())
                .limit(k)
                .toArray();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
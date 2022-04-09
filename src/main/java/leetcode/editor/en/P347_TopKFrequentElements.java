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
        // 參考:map裝載後,搭配PriorityQueue使用
        Map<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer,Integer>> que = new PriorityQueue<>(k, Comparator.comparingInt(Map.Entry::getValue));
        for(int val : nums){
            map.compute(val,(key,v)-> v!=null ? v+1:1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            que.add(entry);
            if(que.size()>k){
                que.poll();
            }
        }
        return que.stream().mapToInt(Map.Entry::getKey).toArray();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
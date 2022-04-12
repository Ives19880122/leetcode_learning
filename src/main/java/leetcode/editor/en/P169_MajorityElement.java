//Given an array nums of size n, return the majority element. 
//
// The majority element is the element that appears more than ⌊n / 2⌋ times. 
//You may assume that the majority element always exists in the array. 
//
// 
// Example 1: 
// Input: nums = [3,2,3]
//Output: 3
// Example 2: 
// Input: nums = [2,2,1,1,1,2,2]
//Output: 2
// 
// 
// Constraints: 
//
// 
// n == nums.length 
// 1 <= n <= 5 * 10⁴ 
// -10⁹ <= nums[i] <= 10⁹ 
// 
//
// 
//Follow-up: Could you solve the problem in linear time and in O(1) space? 
//Related Topics Array Hash Table Divide and Conquer Sorting Counting 👍 9283 👎 333
    
package leetcode.editor.en;

import java.util.HashMap;

/**
 * id: 169
 * title: Majority Element
 * author: Ives.He 
 * date: 2022-04-13 01:21:09
 * for TEST copy:
 * import leetcode.editor.en.P169_MajorityElement .Solution;
 * P169_MajorityElement_Test
 */
public class P169_MajorityElement{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int majorityElement(int[] nums) {
        int result = nums[0];
        HashMap<Integer,Integer> map = new HashMap(nums.length/2);
        for(int i =0 ; i< nums.length; i++){
            map.compute(nums[i],(k,v)-> v== null ? 1: ++v);
            if(map.getOrDefault(result,0)<map.get(nums[i]))
                result = nums[i];
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
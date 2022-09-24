//The next greater element of some element x in an array is the first greater 
//element that is to the right of x in the same array. 
//
// You are given two distinct 0-indexed integer arrays nums1 and nums2, where 
//nums1 is a subset of nums2. 
//
// For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[
//j] and determine the next greater element of nums2[j] in nums2. If there is no 
//next greater element, then the answer for this query is -1. 
//
// Return an array ans of length nums1.length such that ans[i] is the next 
//greater element as described above. 
//
// 
// Example 1: 
//
// 
//Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
//Output: [-1,3,-1]
//Explanation: The next greater element for each value of nums1 is as follows:
//- 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so 
//the answer is -1.
//- 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
//- 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so 
//the answer is -1.
// 
//
// Example 2: 
//
// 
//Input: nums1 = [2,4], nums2 = [1,2,3,4]
//Output: [3,-1]
//Explanation: The next greater element for each value of nums1 is as follows:
//- 2 is underlined in nums2 = [1,2,3,4]. The next greater element is 3.
//- 4 is underlined in nums2 = [1,2,3,4]. There is no next greater element, so 
//the answer is -1.
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums1.length <= nums2.length <= 1000 
// 0 <= nums1[i], nums2[i] <= 10⁴ 
// All integers in nums1 and nums2 are unique. 
// All the integers of nums1 also appear in nums2. 
// 
//
// 
//Follow up: Could you find an 
//O(nums1.length + nums2.length) solution?
//
// Related Topics Array Hash Table Stack Monotonic Stack 👍 4356 👎 263
    
package leetcode.editor.en;

import java.util.Arrays;
import java.util.Stack;

/**
 * id: 496
 * title: Next Greater Element I
 * author: Ives.He 
 * date: 2022-09-24 09:24:03
 * for TEST copy:
 * import leetcode.editor.en.P496_NextGreaterElementI .Solution;
 * P496_NextGreaterElementI_Test
 */
public class P496_NextGreaterElementI{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    private int idx = 0;
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        if(idx == nums1.length) return nums1;
        int target = 0;
        for (int i = 0; i < nums2.length ; i++) {
            if(nums1[idx]==nums2[i]) target = i+1;
        }
        int next = -1;
        for (int i = target; i < nums2.length; i++) {
            if(nums2[i]>nums1[idx]) {
                next = nums2[i];
                break;
            }
        }
        nums1[idx] = next;
        idx++;
        return nextGreaterElement(nums1,nums2);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
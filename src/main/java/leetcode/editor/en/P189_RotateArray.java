//Given an array, rotate the array to the right by k steps, where k is non-
//negative. 
//
// 
// Example 1: 
//
// 
//Input: nums = [1,2,3,4,5,6,7], k = 3
//Output: [5,6,7,1,2,3,4]
//Explanation:
//rotate 1 steps to the right: [7,1,2,3,4,5,6]
//rotate 2 steps to the right: [6,7,1,2,3,4,5]
//rotate 3 steps to the right: [5,6,7,1,2,3,4]
// 
//
// Example 2: 
//
// 
//Input: nums = [-1,-100,3,99], k = 2
//Output: [3,99,-1,-100]
//Explanation: 
//rotate 1 steps to the right: [99,-1,-100,3]
//rotate 2 steps to the right: [3,99,-1,-100]
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 10⁵ 
// -2³¹ <= nums[i] <= 2³¹ - 1 
// 0 <= k <= 10⁵ 
// 
//
// 
// Follow up: 
//
// 
// Try to come up with as many solutions as you can. There are at least three 
//different ways to solve this problem. 
// Could you do it in-place with O(1) extra space? 
// 
// Related Topics Array Math Two Pointers 👍 11161 👎 1397
    
package leetcode.editor.en;
/** 
 * id: 189
 * title: Rotate Array
 * author: Ives.He 
 * date: 2022-09-11 11:32:44
 * for TEST copy:
 * import leetcode.editor.en.P189_RotateArray .Solution;
 * P189_RotateArray_Test
 */
public class P189_RotateArray {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         * 	------>---> origin
         * 	<---<------ reverse 1
         * 	---><------ reverse 2
         * 	--->------> reverse 3
         * @param nums
         * @param k
         */
        public void rotate(int[] nums, int k) {
            k %= nums.length;
            reverse(nums, 0, nums.length - 1);
            reverse(nums, 0, k - 1);
            reverse(nums, k, nums.length - 1);
        }

        private void reverse(int[] nums, int start, int end) {
            while (start < end) {
                int tmp = nums[end];
                nums[end] = nums[start];
                nums[start] = tmp;
                start++;
                end--;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
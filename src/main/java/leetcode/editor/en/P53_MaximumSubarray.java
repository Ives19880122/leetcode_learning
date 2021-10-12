//Given an integer array nums, find the contiguous subarray (containing at 
//least one number) which has the largest sum and return its sum. 
//
// A subarray is a contiguous part of an array. 
//
// 
// Example 1: 
//
// 
//Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//Output: 6
//Explanation: [4,-1,2,1] has the largest sum = 6.
// 
//
// Example 2: 
//
// 
//Input: nums = [1]
//Output: 1
// 
//
// Example 3: 
//
// 
//Input: nums = [5,4,-1,7,8]
//Output: 23
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 10⁵ 
// -10⁴ <= nums[i] <= 10⁴ 
// 
//
// 
// Follow up: If you have figured out the O(n) solution, try coding another 
//solution using the divide and conquer approach, which is more subtle. 
// Related Topics Array Divide and Conquer Dynamic Programming 👍 15076 👎 705

package leetcode.editor.en;
/**
  * id：53
  * title：Maximum Subarray
  * author: Ives.He
  * date：2021-10-08 13:23:04
  * for TEST copy:
  * import leetcode.editor.en.P53_MaximumSubarray.Solution;
  * P53_MaximumSubarray_Test
  */
public class P53_MaximumSubarray{
  
  //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        if(nums.length == 1){
            return max;
        }
        for(int o = 0; o<nums.length; o++){
            int tmp = 0;
            for( int i = o; i<nums.length; i++){
                tmp += nums[i];
                if(tmp > max) max = tmp;
            }
        }
        return max;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
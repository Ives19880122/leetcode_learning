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
    int maxSum = Integer.MIN_VALUE;
    public int maxSubArray(int[] nums) {
        // 參考改寫2 遞迴 從最上方一路到底
        recurse(nums,nums.length-1);
        return maxSum;
    }
    public int recurse(int[] nums, int pos){
        if(pos == 0){
            maxSum = Math.max(maxSum,nums[0]);
            return nums[0];
        }
        int sum = Math.max(nums[pos],nums[pos]+recurse(nums,pos-1));
        maxSum = Math.max(maxSum,sum);
        return sum;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
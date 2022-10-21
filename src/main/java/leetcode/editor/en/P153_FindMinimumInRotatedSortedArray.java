//Suppose an array of length n sorted in ascending order is rotated between 1 
//and n times. For example, the array nums = [0,1,2,4,5,6,7] might become: 
//
// 
// [4,5,6,7,0,1,2] if it was rotated 4 times. 
// [0,1,2,4,5,6,7] if it was rotated 7 times. 
// 
//
// Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results 
//in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]]. 
//
// Given the sorted rotated array nums of unique elements, return the minimum 
//element of this array. 
//
// You must write an algorithm that runs in O(log n) time. 
//
// 
// Example 1: 
//
// 
//Input: nums = [3,4,5,1,2]
//Output: 1
//Explanation: The original array was [1,2,3,4,5] rotated 3 times.
// 
//
// Example 2: 
//
// 
//Input: nums = [4,5,6,7,0,1,2]
//Output: 0
//Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 
//times.
// 
//
// Example 3: 
//
// 
//Input: nums = [11,13,15,17]
//Output: 11
//Explanation: The original array was [11,13,15,17] and it was rotated 4 times. 
//
// 
//
// 
// Constraints: 
//
// 
// n == nums.length 
// 1 <= n <= 5000 
// -5000 <= nums[i] <= 5000 
// All the integers of nums are unique. 
// nums is sorted and rotated between 1 and n times. 
// 
//
// Related Topics Array Binary Search 👍 8757 👎 435
    
package leetcode.editor.en;

import java.util.Arrays;

/**
 * id: 153
 * title: Find Minimum in Rotated Sorted Array
 * author: Ives.He 
 * date: 2022-10-22 00:23:09
 * for TEST copy:
 * import leetcode.editor.en.P153_FindMinimumInRotatedSortedArray .Solution;
 * P153_FindMinimumInRotatedSortedArray_Test
 */
public class P153_FindMinimumInRotatedSortedArray{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;
            if (mid > 0 && nums[mid] < nums[mid - 1]) {
                return nums[mid];
            }
            if (nums[start] <= nums[mid] && nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return nums[start];
    }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
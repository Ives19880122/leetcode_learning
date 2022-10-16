//Given an array of integers nums sorted in non-decreasing order, find the 
//starting and ending position of a given target value. 
//
// If target is not found in the array, return [-1, -1]. 
//
// You must write an algorithm with O(log n) runtime complexity. 
//
// 
// Example 1: 
// Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]
// 
// Example 2: 
// Input: nums = [5,7,7,8,8,10], target = 6
//Output: [-1,-1]
// 
// Example 3: 
// Input: nums = [], target = 0
//Output: [-1,-1]
// 
// 
// Constraints: 
//
// 
// 0 <= nums.length <= 10⁵ 
// -10⁹ <= nums[i] <= 10⁹ 
// nums is a non-decreasing array. 
// -10⁹ <= target <= 10⁹ 
// 
//
// Related Topics Array Binary Search 👍 14293 👎 352
    
package leetcode.editor.en;
/** 
 * id: 34
 * title: Find First and Last Position of Element in Sorted Array
 * author: Ives.He 
 * date: 2022-10-16 15:48:45
 * for TEST copy:
 * import leetcode.editor.en.P34_FindFirstAndLastPositionOfElementInSortedArray .Solution;
 * P34_FindFirstAndLastPositionOfElementInSortedArray_Test
 */
public class P34_FindFirstAndLastPositionOfElementInSortedArray{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] range = new int[2];
        range[0] = findFirst(nums,target);
        range[1] = findLast(nums,target);
        return range;
    }

    private int findFirst(int [] nums, int target){
        int idx = -1;
        int l = 0;
        int r = nums.length-1;
        while (l<=r){
            int m = l + (r-l)/2;
            // 優先從尾端向左逼近<<<
            if(nums[m]>=target) r=m-1;
            else l=m+1;
            if(nums[m]==target) idx = m;
        }
        return idx;
    }

    private int findLast(int[] nums, int target){
        int idx = -1;
        int l = 0;
        int r = nums.length-1;
        while (l<=r){
            int m = l + (r-l)/2;
            // 優先從頭端向右逼近>>>
            if(nums[m]<=target) l=m+1;
            else r=m-1;
            if(nums[m]==target) idx = m;
        }
        return idx;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
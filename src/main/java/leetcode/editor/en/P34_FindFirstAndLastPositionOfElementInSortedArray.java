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
        int [] result = {-1,-1};
        int l = 0;
        int r = nums.length-1;
        while (l<=r){
            if (nums[l] == target && nums[r]==target) {
                result[0]=l;
                result[1]=r;
                break;
            }else if(l==r){
                break;
            }
            int m = l + (r-l)/2;
            if(nums[m]==target){
                if(nums[l]!=target) l++;
                if(nums[r]!=target) r--;
            }
            else if(nums[m]<target) l=m+1;
            else if(nums[m]>target) r=m-1;
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
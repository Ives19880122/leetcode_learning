//There is an integer array nums sorted in ascending order (with distinct 
//values). 
//
// Prior to being passed to your function, nums is possibly rotated at an 
//unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k]
//, nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For 
//example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0
//,1,2]. 
//
// Given the array nums after the possible rotation and an integer target, 
//return the index of target if it is in nums, or -1 if it is not in nums. 
//
// You must write an algorithm with O(log n) runtime complexity. 
//
// 
// Example 1: 
// Input: nums = [4,5,6,7,0,1,2], target = 0
//Output: 4
// 
// Example 2: 
// Input: nums = [4,5,6,7,0,1,2], target = 3
//Output: -1
// 
// Example 3: 
// Input: nums = [1], target = 0
//Output: -1
// 
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 5000 
// -10⁴ <= nums[i] <= 10⁴ 
// All values of nums are unique. 
// nums is an ascending array that is possibly rotated. 
// -10⁴ <= target <= 10⁴ 
// 
//
// Related Topics Array Binary Search 👍 18147 👎 1079
    
package leetcode.editor.en;

import java.util.Arrays;

/**
 * id: 33
 * title: Search in Rotated Sorted Array
 * author: Ives.He 
 * date: 2022-10-21 22:51:27
 * for TEST copy:
 * import leetcode.editor.en.P33_SearchInRotatedSortedArray .Solution;
 * P33_SearchInRotatedSortedArray_Test
 */
public class P33_SearchInRotatedSortedArray{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int search(int[] nums, int target) {
        if(target==nums[0]) return 0;
        // 紀錄rotate位置
        int pivot = nums[0];
        Arrays.sort(nums);
        // 搜尋pivot inx
        int k = binarySearch(nums, 0, nums.length-1, pivot);
        int res = -1;
        // 決定左右半邊依據 右: target > pivot, 左: target< pivot
        if(target>pivot){
            // 搜尋target 右半區
            res = binarySearch(nums,k,nums.length-1,target);
            if(res!=-1) return res - k;
        }else{
            // 搜尋target 左半區
            res = binarySearch(nums,0,k-1,target);
            if(res!=-1) return res + (nums.length-k);
        }
        // 找不到回傳 -1
        return res;
    }

    public int binarySearch(int[] nums, int start, int end, int target){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) end = mid-1;
            else if(nums[mid]<target) start = mid+1;
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
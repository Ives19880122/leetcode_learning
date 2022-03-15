//Given an integer array nums sorted in non-decreasing order, remove the 
//duplicates in-place such that each unique element appears only once. The relative 
//order of the elements should be kept the same. 
//
// Since it is impossible to change the length of the array in some languages, 
//you must instead have the result be placed in the first part of the array nums. 
//More formally, if there are k elements after removing the duplicates, then the 
//first k elements of nums should hold the final result. It does not matter what 
//you leave beyond the first k elements. 
//
// Return k after placing the final result in the first k slots of nums. 
//
// Do not allocate extra space for another array. You must do this by modifying 
//the input array in-place with O(1) extra memory. 
//
// Custom Judge: 
//
// The judge will test your solution with the following code: 
//
// 
//int[] nums = [...]; // Input array
//int[] expectedNums = [...]; // The expected answer with correct length
//
//int k = removeDuplicates(nums); // Calls your implementation
//
//assert k == expectedNums.length;
//for (int i = 0; i < k; i++) {
//    assert nums[i] == expectedNums[i];
//}
// 
//
// If all assertions pass, then your solution will be accepted. 
//
// 
// Example 1: 
//
// 
//Input: nums = [1,1,2]
//Output: 2, nums = [1,2,_]
//Explanation: Your function should return k = 2, with the first two elements 
//of nums being 1 and 2 respectively.
//It does not matter what you leave beyond the returned k (hence they are 
//underscores).
// 
//
// Example 2: 
//
// 
//Input: nums = [0,0,1,1,1,2,2,3,3,4]
//Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
//Explanation: Your function should return k = 5, with the first five elements 
//of nums being 0, 1, 2, 3, and 4 respectively.
//It does not matter what you leave beyond the returned k (hence they are 
//underscores).
// 
//
// 
// Constraints: 
//
// 
// 0 <= nums.length <= 3 * 10⁴ 
// -100 <= nums[i] <= 100 
// nums is sorted in non-decreasing order. 
// 
// Related Topics Array Two Pointers 👍 4874 👎 8215
    
package leetcode.editor.en;
/** 
 * @author  Ives.He 
 * @date    2021-10-04 22:14:42 
 */
public class P26_RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Solution solution = new P26_RemoveDuplicatesFromSortedArray().new Solution();
    }    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int removeDuplicates(int[] nums) {
         // 參考寫法
        int n = nums.length;
        if(n<=1){
            return 1;
        }
        int left = 0;
        int right = 1;
        while(right <= n-1){
            // 如果相等時,往右移一格
            if (nums[right] == nums[left]) {
                right++;
            // 不相等表示,left可以新增一位數,並把左右idx往前移動
            }else{
                nums[left+1] = nums[right];
                right++;
                left++;
            }
        }
        // idx+1才是真正的長度個數
        return left+1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
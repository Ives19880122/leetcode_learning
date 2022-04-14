//Given an array of integers nums which is sorted in ascending order, and an 
//integer target, write a function to search target in nums. If target exists, then 
//return its index. Otherwise, return -1. 
//
// You must write an algorithm with O(log n) runtime complexity. 
//
// 
// Example 1: 
//
// 
//Input: nums = [-1,0,3,5,9,12], target = 9
//Output: 4
//Explanation: 9 exists in nums and its index is 4
// 
//
// Example 2: 
//
// 
//Input: nums = [-1,0,3,5,9,12], target = 2
//Output: -1
//Explanation: 2 does not exist in nums so return -1
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 10⁴ 
// -10⁴ < nums[i], target < 10⁴ 
// All the integers in nums are unique. 
// nums is sorted in ascending order. 
// 
// Related Topics Array Binary Search 👍 4498 👎 106
    
package leetcode.editor.en;
/** 
 * id: 704
 * title: Binary Search
 * author: Ives.He 
 * date: 2022-04-14 18:34:41
 * for TEST copy:
 * import leetcode.editor.en.P704_BinarySearch .Solution;
 * P704_BinarySearch_Test
 */
public class P704_BinarySearch{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length;
        int idx = (l+r)/2;
        // 紀錄before idx,如果重複出現,表示已經走到邊界了
        int prev = 0;
        while(true){
            if(target==nums[idx])return idx;
            if(target>nums[idx]){
                l = idx;
            }else{
                r = idx;
            }
            // 判斷是否踩到邊界
            if(prev==idx) break;
            // 抽換紀錄前一次idx
            prev = idx;
            // 更新idx
            idx = (l+r)/2;
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
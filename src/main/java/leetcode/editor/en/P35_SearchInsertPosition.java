//Given a sorted array of distinct integers and a target value, return the
//index if the target is found. If not, return the index where it would be if it were
//inserted in order.
//
// You must write an algorithm with O(log n) runtime complexity.
//
//
// Example 1:
// Input: nums = [1,3,5,6], target = 5
//Output: 2
// Example 2:
// Input: nums = [1,3,5,6], target = 2
//Output: 1
// Example 3:
// Input: nums = [1,3,5,6], target = 7
//Output: 4
// Example 4:
// Input: nums = [1,3,5,6], target = 0
//Output: 0
// Example 5:
// Input: nums = [1], target = 0
//Output: 0
//
//
// Constraints:
//
//
// 1 <= nums.length <= 10⁴
// -10⁴ <= nums[i] <= 10⁴
// nums contains distinct values sorted in ascending order.
// -10⁴ <= target <= 10⁴
//
// Related Topics Array Binary Search 👍 4927 👎 323

package leetcode.editor.en;
/**
  * id：35
  * title：Search Insert Position
  * author: Ives.He
  * date：2021-10-06 12:26:54
*/
public class P35_SearchInsertPosition {
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int searchInsert(int[] nums, int target) {
        int step = 0;
        int end = nums.length;
        if (nums[end-1]<target){
            step = end;
        }else{
            while(step<end){
                if(nums[step]<target){
                    step += 1;
                }else if(nums[step] >= target){
                    break;
                }
            }
        }
        return step;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

} 
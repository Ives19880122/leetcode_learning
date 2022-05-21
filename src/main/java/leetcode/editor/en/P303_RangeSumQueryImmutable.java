//Given an integer array nums, handle multiple queries of the following type: 
//
// 
// Calculate the sum of the elements of nums between indices left and right 
//inclusive where left <= right. 
// 
//
// Implement the NumArray class: 
//
// 
// NumArray(int[] nums) Initializes the object with the integer array nums. 
// int sumRange(int left, int right) Returns the sum of the elements of nums 
//between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + 
//nums[right]). 
// 
//
// 
// Example 1: 
//
// 
//Input
//["NumArray", "sumRange", "sumRange", "sumRange"]
//[[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
//Output
//[null, 1, -1, -3]
//
//Explanation
//NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
//numArray.sumRange(0, 2); // return (-2) + 0 + 3 = 1
//numArray.sumRange(2, 5); // return 3 + (-5) + 2 + (-1) = -1
//numArray.sumRange(0, 5); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 10⁴ 
// -10⁵ <= nums[i] <= 10⁵ 
// 0 <= left <= right < nums.length 
// At most 10⁴ calls will be made to sumRange. 
// 
// Related Topics Array Design Prefix Sum 👍 1971 👎 1657
    
package leetcode.editor.en;
/** 
 * id: 303
 * title: Range Sum Query - Immutable
 * author: Ives.He 
 * date: 2022-05-21 08:33:13
 * for TEST copy:
 * import leetcode.editor.en.P303_RangeSumQueryImmutable .Solution;
 * P303_RangeSumQueryImmutable_Test
 */
public class P303_RangeSumQueryImmutable{
    //leetcode submit region begin(Prohibit modification and deletion)
class NumArray {

    private int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        int sum = 0;
        while (right > left) {
            sum += nums[left++] + nums[right--];
        }
        if (left == right) {
            sum += nums[left];
        }
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */
//leetcode submit region end(Prohibit modification and deletion)

}
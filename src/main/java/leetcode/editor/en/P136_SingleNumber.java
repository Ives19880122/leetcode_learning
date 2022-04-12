//Given a non-empty array of integers nums, every element appears twice except 
//for one. Find that single one. 
//
// You must implement a solution with a linear runtime complexity and use only 
//constant extra space. 
//
// 
// Example 1: 
// Input: nums = [2,2,1]
//Output: 1
// Example 2: 
// Input: nums = [4,1,2,1,2]
//Output: 4
// Example 3: 
// Input: nums = [1]
//Output: 1
// 
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 3 * 10⁴ 
// -3 * 10⁴ <= nums[i] <= 3 * 10⁴ 
// Each element in the array appears twice except for one element which appears 
//only once. 
// 
// Related Topics Array Bit Manipulation 👍 9540 👎 340
    
package leetcode.editor.en;

import java.util.HashMap;
import java.util.Map;

/**
 * id: 136
 * title: Single Number
 * author: Ives.He 
 * date: 2022-04-13 00:38:13
 * for TEST copy:
 * import leetcode.editor.en.P136_SingleNumber .Solution;
 * P136_SingleNumber_Test
 */
public class P136_SingleNumber{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int singleNumber(int[] nums) {
        // 參考解 改用XOR相消資料,最後剩下就是結果
        int result = nums[0];
        for(int i = 1; i<nums.length; i++){
            result = result ^ nums[i];
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
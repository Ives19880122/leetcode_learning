//You are given an array nums of non-negative integers. nums is considered 
//special if there exists a number x such that there are exactly x numbers in nums 
//that are greater than or equal to x. 
//
// Notice that x does not have to be an element in nums. 
//
// Return x if the array is special, otherwise, return -1. It can be proven 
//that if nums is special, the value for x is unique. 
//
// 
// Example 1: 
//
// 
//Input: nums = [3,5]
//Output: 2
//Explanation: There are 2 values (3 and 5) that are greater than or equal to 2.
//
// 
//
// Example 2: 
//
// 
//Input: nums = [0,0]
//Output: -1
//Explanation: No numbers fit the criteria for x.
//If x = 0, there should be 0 numbers >= x, but there are 2.
//If x = 1, there should be 1 number >= x, but there are 0.
//If x = 2, there should be 2 numbers >= x, but there are 0.
//x cannot be greater since there are only 2 numbers in nums.
// 
//
// Example 3: 
//
// 
//Input: nums = [0,4,3,0,4]
//Output: 3
//Explanation: There are 3 values that are greater than or equal to 3.
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 100 
// 0 <= nums[i] <= 1000 
// 
//
// Related Topics Array Binary Search Sorting 👍 1089 👎 173
    
package leetcode.editor.en;

import java.util.Arrays;

/**
 * id: 1608
 * title: Special Array With X Elements Greater Than or Equal X
 * author: Ives.He 
 * date: 2022-10-16 14:46:45
 * for TEST copy:
 * import leetcode.editor.en.P1608_SpecialArrayWithXElementsGreaterThanOrEqualX .Solution;
 * P1608_SpecialArrayWithXElementsGreaterThanOrEqualX_Test
 */
public class P1608_SpecialArrayWithXElementsGreaterThanOrEqualX{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        for(int i = 0; i <= nums[len-1]; i++){
            int l = 0, r = len-1;
            while(l < r){
                int m = l + (r - l) / 2;
                if(nums[m] >= i) r = m;
                else l = m+1;
            }
            if((len - l) == i) return i;
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
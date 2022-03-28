//Given an integer array nums, return true if any value appears at least twice 
//in the array, and return false if every element is distinct. 
//
// 
// Example 1: 
// Input: nums = [1,2,3,1]
//Output: true
// Example 2: 
// Input: nums = [1,2,3,4]
//Output: false
// Example 3: 
// Input: nums = [1,1,1,3,3,4,3,2,4,2]
//Output: true
// 
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 10⁵ 
// -10⁹ <= nums[i] <= 10⁹ 
// 
// Related Topics Array Hash Table Sorting 👍 2783 👎 891
    
package leetcode.editor.en;

import java.util.HashSet;
import java.util.Set;

/**
 * id: 217
 * title: Contains Duplicate
 * author: Ives.He 
 * date: 2021-10-31 21:18:11
 * for TEST copy:
 * import leetcode.editor.en.P217_ContainsDuplicate .Solution;
 * P217_ContainsDuplicate_Test
 */
public class P217_ContainsDuplicate{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int i = 0;
        Set<Integer> tmp = new HashSet<>();
        while(i<nums.length){
            if(tmp.contains(nums[i])){
                return true;
            }
            tmp.add(nums[i]);
            i++;
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
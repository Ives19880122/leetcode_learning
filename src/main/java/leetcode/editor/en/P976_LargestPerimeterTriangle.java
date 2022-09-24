//Given an integer array nums, return the largest perimeter of a triangle with 
//a non-zero area, formed from three of these lengths. If it is impossible to form 
//any triangle of a non-zero area, return 0. 
//
// 
// Example 1: 
//
// 
//Input: nums = [2,1,2]
//Output: 5
// 
//
// Example 2: 
//
// 
//Input: nums = [1,2,1]
//Output: 0
// 
//
// 
// Constraints: 
//
// 
// 3 <= nums.length <= 10⁴ 
// 1 <= nums[i] <= 10⁶ 
// 
//
// Related Topics Array Math Greedy Sorting 👍 1380 👎 205
    
package leetcode.editor.en;

import java.util.Arrays;

/**
 * id: 976
 * title: Largest Perimeter Triangle
 * author: Ives.He 
 * date: 2022-09-24 10:27:52
 * for TEST copy:
 * import leetcode.editor.en.P976_LargestPerimeterTriangle .Solution;
 * P976_LargestPerimeterTriangle_Test
 */
public class P976_LargestPerimeterTriangle{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int largestPerimeter(int[] nums) {
        int l = 1;
        int r = l+1;
        int result = 0;
        Arrays.sort(nums);
        while(l != nums.length-1){
            int x = nums[l-1];
            int y = nums[l];
            int z = nums[r];
            // a + b > c 三角形定理
            if(x+y>z && y+z>x && x+z>y) result = Math.max(x+y+z,result);
            r++;
            if(r==nums.length){
                l++;
                r=l+1;
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
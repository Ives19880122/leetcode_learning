//There is a function signFunc(x) that returns: 
//
// 
// 1 if x is positive. 
// -1 if x is negative. 
// 0 if x is equal to 0. 
// 
//
// You are given an integer array nums. Let product be the product of all 
//values in the array nums. 
//
// Return signFunc(product). 
//
// 
// Example 1: 
//
// 
//Input: nums = [-1,-2,-3,-4,3,2,1]
//Output: 1
//Explanation: The product of all values in the array is 144, and signFunc(144) 
//= 1
// 
//
// Example 2: 
//
// 
//Input: nums = [1,5,0,2,-3]
//Output: 0
//Explanation: The product of all values in the array is 0, and signFunc(0) = 0
// 
//
// Example 3: 
//
// 
//Input: nums = [-1,1,-1,1,-1]
//Output: -1
//Explanation: The product of all values in the array is -1, and signFunc(-1) = 
//-1
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 1000 
// -100 <= nums[i] <= 100 
// 
//
// Related Topics Array Math 👍 747 👎 100
    
package leetcode.editor.en;
/** 
 * id: 1822
 * title: Sign of the Product of an Array
 * author: Ives.He 
 * date: 2022-09-24 10:33:02
 * for TEST copy:
 * import leetcode.editor.en.P1822_SignOfTheProductOfAnArray .Solution;
 * P1822_SignOfTheProductOfAnArray_Test
 */
public class P1822_SignOfTheProductOfAnArray{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int arraySign(int[] nums) {
        int product = 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0) return 0;
            if(nums[i]>0) product *= 1;
            if(nums[i]<0) product *= -1;
        }
        return product;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
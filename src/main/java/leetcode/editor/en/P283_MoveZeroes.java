//Given an integer array nums, move all 0's to the end of it while maintaining 
//the relative order of the non-zero elements. 
//
// Note that you must do this in-place without making a copy of the array. 
//
// 
// Example 1: 
// Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]
// Example 2: 
// Input: nums = [0]
//Output: [0]
// 
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 10⁴ 
// -2³¹ <= nums[i] <= 2³¹ - 1 
// 
//
// 
//Follow up: Could you minimize the total number of operations done? Related 
//Topics Array Two Pointers 👍 10903 👎 265
    
package leetcode.editor.en;
/** 
 * id: 283
 * title: Move Zeroes
 * author: Ives.He 
 * date: 2022-09-11 11:54:10
 * for TEST copy:
 * import leetcode.editor.en.P283_MoveZeroes .Solution;
 * P283_MoveZeroes_Test
 */
public class P283_MoveZeroes {
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        /**
         *  把0向右推, 縮小array可活動範圍,直到長度為0
         * 	ooooo
         * 	oooox
         * 	oooxx
         * 	ooxxx
         * 	oxxxx
         * 	xxxxx
         * @param nums
         */
        public void moveZeroes(int[] nums) {
            int r = 0;
            int len = nums.length;
            while(0<len){
                if(r==len-1){
                    len--;
                    r=0;
                }else{
                    if(nums[r]==0){
                        nums[r] = nums[r+1];
                        nums[r+1] = 0;
                    }
                    r++;
                }
            }
        }
    }
    //leetcode submit region end(Prohibit modification and deletion)

}
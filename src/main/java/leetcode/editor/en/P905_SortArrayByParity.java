//Given an integer array nums, move all the even integers at the beginning of 
//the array followed by all the odd integers. 
//
// Return any array that satisfies this condition. 
//
// 
// Example 1: 
//
// 
//Input: nums = [3,1,2,4]
//Output: [2,4,3,1]
//Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be 
//accepted.
// 
//
// Example 2: 
//
// 
//Input: nums = [0]
//Output: [0]
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length <= 5000 
// 0 <= nums[i] <= 5000 
// 
// Related Topics Array Two Pointers Sorting 👍 2774 👎 112
    
package leetcode.editor.en;
/** 
 * id: 905
 * title: Sort Array By Parity
 * author: Ives.He 
 * date: 2022-05-02 11:19:00
 * for TEST copy:
 * import leetcode.editor.en.P905_SortArrayByParity .Solution;
 * P905_SortArrayByParity_Test
 */
public class P905_SortArrayByParity{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int slow=0;
        int fast= 0;
        // 參考雙指標做法
        while(fast< nums.length){
            if(nums[fast]%2==0){
                int tmp = nums[slow];
                nums[slow]=nums[fast];
                nums[fast]=tmp;
                slow++;
            }
            fast++;
        }
        return nums;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
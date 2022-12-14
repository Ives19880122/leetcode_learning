//Given the array nums, for each nums[i] find out how many numbers in the array 
//are smaller than it. That is, for each nums[i] you have to count the number of 
//valid j's such that j != i and nums[j] < nums[i]. 
//
// Return the answer in an array. 
//
// 
// Example 1: 
//
// 
//Input: nums = [8,1,2,2,3]
//Output: [4,0,1,1,3]
//Explanation: 
//For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3). 
//For nums[1]=1 does not exist any smaller number than it.
//For nums[2]=2 there exist one smaller number than it (1). 
//For nums[3]=2 there exist one smaller number than it (1). 
//For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
// 
//
// Example 2: 
//
// 
//Input: nums = [6,5,4,8]
//Output: [2,1,0,3]
// 
//
// Example 3: 
//
// 
//Input: nums = [7,7,7,7]
//Output: [0,0,0,0]
// 
//
// 
// Constraints: 
//
// 
// 2 <= nums.length <= 500 
// 0 <= nums[i] <= 100 
// 
// Related Topics Array Hash Table Sorting Counting 👍 3039 👎 62
    
package leetcode.editor.en;
/** 
 * id: 1365
 * title: How Many Numbers Are Smaller Than the Current Number
 * author: Ives.He 
 * date: 2022-04-17 00:53:13
 * for TEST copy:
 * import leetcode.editor.en.P1365_HowManyNumbersAreSmallerThanTheCurrentNumber .Solution;
 * P1365_HowManyNumbersAreSmallerThanTheCurrentNumber_Test
 */
public class P1365_HowManyNumbersAreSmallerThanTheCurrentNumber{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // 邊界範圍是 0 ~ 100
        int[] count = new int[102];
        // 建立索引資料
        for(int num : nums) count[num+1]++;
        // 索引調整,計算數目
        for(int i=0; i<101; i++) count[i+1] += count[i];
        // 更新nums
        for(int i=0; i< nums.length; i++) nums[i] = count[nums[i]];
        return nums;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
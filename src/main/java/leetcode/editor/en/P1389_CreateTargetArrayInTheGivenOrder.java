//Given two arrays of integers nums and index. Your task is to create target 
//array under the following rules: 
//
// 
// Initially target array is empty. 
// From left to right read nums[i] and index[i], insert at index index[i] the 
//value nums[i] in target array. 
// Repeat the previous step until there are no elements to read in nums and 
//index. 
// 
//
// Return the target array. 
//
// It is guaranteed that the insertion operations will be valid. 
//
// 
// Example 1: 
//
// 
//Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
//Output: [0,4,1,3,2]
//Explanation:
//nums       index     target
//0            0        [0]
//1            1        [0,1]
//2            2        [0,1,2]
//3            2        [0,1,3,2]
//4            1        [0,4,1,3,2]
// 
//
// Example 2: 
//
// 
//Input: nums = [1,2,3,4,0], index = [0,1,2,3,0]
//Output: [0,1,2,3,4]
//Explanation:
//nums       index     target
//1            0        [1]
//2            1        [1,2]
//3            2        [1,2,3]
//4            3        [1,2,3,4]
//0            0        [0,1,2,3,4]
// 
//
// Example 3: 
//
// 
//Input: nums = [1], index = [0]
//Output: [1]
// 
//
// 
// Constraints: 
//
// 
// 1 <= nums.length, index.length <= 100 
// nums.length == index.length 
// 0 <= nums[i] <= 100 
// 0 <= index[i] <= i 
// 
//
// Related Topics Array Simulation 👍 1667 👎 1637
    
package leetcode.editor.en;
/** 
 * id: 1389
 * title: Create Target Array in the Given Order
 * author: Ives.He 
 * date: 2023-06-03 16:39:20
 * for TEST copy:
 * import leetcode.editor.en.P1389_CreateTargetArrayInTheGivenOrder .Solution;
 * P1389_CreateTargetArrayInTheGivenOrder_Test
 */
public class P1389_CreateTargetArrayInTheGivenOrder{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
        public int[] createTargetArray(int[] nums, int[] index) {
            int[] target = new int[]{nums[0]};
            for(int i = 1; i<nums.length; i++){
                target = insert(target,nums[i],index[i]);
            }
            return target;
        }
        private int[] insert(int[] arr, int num, int idx){
            int[] n = new int[arr.length+1];
            for(int i =0; i<idx;i++){
                n[i] = arr[i];
            }
            n[idx] = num;
            for(int i = idx+1; i<n.length;i++){
                n[i] = arr[i-1];
            }
            return n;
        }
}
//leetcode submit region end(Prohibit modification and deletion)

}
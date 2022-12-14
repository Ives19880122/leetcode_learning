//Given an array of positive integers arr, return the sum of all possible odd-
//length subarrays of arr. 
//
// A subarray is a contiguous subsequence of the array. 
//
// 
// Example 1: 
//
// 
//Input: arr = [1,4,2,5,3]
//Output: 58
//Explanation: The odd-length subarrays of arr and their sums are:
//[1] = 1
//[4] = 4
//[2] = 2
//[5] = 5
//[3] = 3
//[1,4,2] = 7
//[4,2,5] = 11
//[2,5,3] = 10
//[1,4,2,5,3] = 15
//If we add all these together we get 1 + 4 + 2 + 5 + 3 + 7 + 11 + 10 + 15 = 58 
//
//
// Example 2: 
//
// 
//Input: arr = [1,2]
//Output: 3
//Explanation: There are only 2 subarrays of odd length, [1] and [2]. Their sum 
//is 3. 
//
// Example 3: 
//
// 
//Input: arr = [10,11,12]
//Output: 66
// 
//
// 
// Constraints: 
//
// 
// 1 <= arr.length <= 100 
// 1 <= arr[i] <= 1000 
// 
//
// 
// Follow up: 
//
// Could you solve this problem in O(n) time complexity? 
//
// Related Topics Array Math Prefix Sum ๐ 2521 ๐ 195
    
package leetcode.editor.en;
/** 
 * id: 1588
 * title: Sum of All Odd Length Subarrays
 * author: Ives.He 
 * date: 2022-09-24 11:59:45
 * for TEST copy:
 * import leetcode.editor.en.P1588_SumOfAllOddLengthSubarrays .Solution;
 * P1588_SumOfAllOddLengthSubarrays_Test
 */
public class P1588_SumOfAllOddLengthSubarrays{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int total = 0;
        for (int windowSize = 1; windowSize <= arr.length; windowSize += 2) {
            int windowSum = 0;
            /**
             * ่จ็ฎๆปๅ่ฆ็ช็ๅๅงๅผ
             */
            for (int i = 0; i < windowSize; i++)
                windowSum += arr[i];
            total += windowSum;

            /**
             * ไธๆฌกๆปๅไธ็ญ่ณๆ
             * ้้ๅ่ๅไธ็ญ็ดฏๅ ่ณๆ,ๆๅ่้ปๅๅณ็งปๅ, ๅฐฑไธ็จ้่ค่จ็ฎ็ดฏๅ ๅผ
             */
            for (int i = 1; i + windowSize <= arr.length; i++) {
                windowSum = windowSum - arr[i - 1] + arr[i + windowSize - 1];
                total += windowSum;
            }
        }
        return total;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
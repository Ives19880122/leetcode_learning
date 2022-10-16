//Given an array arr of positive integers sorted in a strictly increasing order,
// and an integer k. 
//
// Return the kᵗʰ positive integer that is missing from this array. 
//
// 
// Example 1: 
//
// 
//Input: arr = [2,3,4,7,11], k = 5
//Output: 9
//Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5
//ᵗʰ missing positive integer is 9.
// 
//
// Example 2: 
//
// 
//Input: arr = [1,2,3,4], k = 2
//Output: 6
//Explanation: The missing positive integers are [5,6,7,...]. The 2ⁿᵈ missing 
//positive integer is 6.
// 
//
// 
// Constraints: 
//
// 
// 1 <= arr.length <= 1000 
// 1 <= arr[i] <= 1000 
// 1 <= k <= 1000 
// arr[i] < arr[j] for 1 <= i < j <= arr.length 
// 
//
// 
// Follow up: 
//
// Could you solve this problem in less than O(n) complexity? 
//
// Related Topics Array Binary Search 👍 3204 👎 228
    
package leetcode.editor.en;
/** 
 * id: 1539
 * title: Kth Missing Positive Number
 * author: Ives.He 
 * date: 2022-10-16 12:21:24
 * for TEST copy:
 * import leetcode.editor.en.P1539_KthMissingPositiveNumber .Solution;
 * P1539_KthMissingPositiveNumber_Test
 */
public class P1539_KthMissingPositiveNumber{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findKthPositive(int[] arr, int k) {
        /**
         * 二分搜尋法 l+k <= target <= r+k
         * 找到中間的target就能逼出答案
         * arr[m]-1-m 表示在m位子上缺漏的個數
         * 1. 如果比k大，就要把右邊界降低
         * 2. 如果比k小，就要把左邊界提高
         * 3. 最終逼近出適當的範圍
         */
        int l = 0;
        int r = arr.length;
        while (l<r){
            int m = l+(r-l)/2;
            if(arr[m]-1-m >= k) r = m; // 大於或等於k的數量，r往左移
            else l = m+1;              // 小於k的數量，l往右移
        }
        return l + k;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
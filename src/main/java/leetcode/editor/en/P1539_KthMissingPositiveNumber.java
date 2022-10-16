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
        if(k<arr[0]) return k;
        k -= arr[0]-1;
        for (int i = 1; i < arr.length; i++) {
            int dic = arr[i] - arr[i-1] - 1;
            if(k-dic<=0) return arr[i-1]+k;
            else k -= dic;
        }
        return arr[arr.length-1] + k;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
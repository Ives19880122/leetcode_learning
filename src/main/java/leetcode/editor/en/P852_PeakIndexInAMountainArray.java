//Let's call an array arr a mountain if the following properties hold: 
//
// 
// arr.length >= 3 
// There exists some i with 0 < i < arr.length - 1 such that:
// 
// arr[0] < arr[1] < ... arr[i-1] < arr[i] 
// arr[i] > arr[i+1] > ... > arr[arr.length - 1] 
// 
// 
// 
//
// Given an integer array arr that is guaranteed to be a mountain, return any i 
//such that arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[
//arr.length - 1]. 
//
// 
// Example 1: 
//
// 
//Input: arr = [0,1,0]
//Output: 1
// 
//
// Example 2: 
//
// 
//Input: arr = [0,2,1,0]
//Output: 1
// 
//
// Example 3: 
//
// 
//Input: arr = [0,10,5,2]
//Output: 1
// 
//
// 
// Constraints: 
//
// 
// 3 <= arr.length <= 10⁴ 
// 0 <= arr[i] <= 10⁶ 
// arr is guaranteed to be a mountain array. 
// 
//
// 
//Follow up: Finding the O(n) is straightforward, could you find an O(log(n)) 
//solution? Related Topics Array Binary Search 👍 2481 👎 1614
    
package leetcode.editor.en;
/** 
 * id: 852
 * title: Peak Index in a Mountain Array
 * author: Ives.He 
 * date: 2022-04-14 20:45:49
 * for TEST copy:
 * import leetcode.editor.en.P852_PeakIndexInAMountainArray .Solution;
 * P852_PeakIndexInAMountainArray_Test
 */
public class P852_PeakIndexInAMountainArray{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l = 0;
        int r = arr.length;
        int idx = (l + r) / 2;
        while(true){
            if(arr[idx]>arr[idx-1]&&arr[idx]>arr[idx+1])return idx;
            if(arr[idx]<arr[idx-1])r=idx;
            if(arr[idx]<arr[idx+1])l=idx;
            idx = (l+r)/2;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
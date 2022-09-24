//A sequence of numbers is called an arithmetic progression if the difference 
//between any two consecutive elements is the same. 
//
// Given an array of numbers arr, return true if the array can be rearranged to 
//form an arithmetic progression. Otherwise, return false. 
//
// 
// Example 1: 
//
// 
//Input: arr = [3,5,1]
//Output: true
//Explanation: We can reorder the elements as [1,3,5] or [5,3,1] with 
//differences 2 and -2 respectively, between each consecutive elements.
// 
//
// Example 2: 
//
// 
//Input: arr = [1,2,4]
//Output: false
//Explanation: There is no way to reorder the elements to obtain an arithmetic 
//progression.
// 
//
// 
// Constraints: 
//
// 
// 2 <= arr.length <= 1000 
// -10⁶ <= arr[i] <= 10⁶ 
// 
//
// Related Topics Array Sorting 👍 833 👎 53
    
package leetcode.editor.en;

import java.util.Arrays;

/**
 * id: 1502
 * title: Can Make Arithmetic Progression From Sequence
 * author: Ives.He 
 * date: 2022-09-24 10:34:23
 * for TEST copy:
 * import leetcode.editor.en.P1502_CanMakeArithmeticProgressionFromSequence .Solution;
 * P1502_CanMakeArithmeticProgressionFromSequence_Test
 */
public class P1502_CanMakeArithmeticProgressionFromSequence{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int l = 0;
        int r = 1;
        int sub = arr[r++]-arr[l++];
        while(r<arr.length){
            if(sub!=(arr[r++]-arr[l++]))return false;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
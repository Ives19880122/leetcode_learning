//Given two integer arrays arr1 and arr2, and the integer d, return the 
//distance value between the two arrays. 
//
// The distance value is defined as the number of elements arr1[i] such that 
//there is not any element arr2[j] where |arr1[i]-arr2[j]| <= d. 
//
// 
// Example 1: 
//
// 
//Input: arr1 = [4,5,8], arr2 = [10,9,1,8], d = 2
//Output: 2
//Explanation: 
//For arr1[0]=4 we have: 
//|4-10|=6 > d=2 
//|4-9|=5 > d=2 
//|4-1|=3 > d=2 
//|4-8|=4 > d=2 
//For arr1[1]=5 we have: 
//|5-10|=5 > d=2 
//|5-9|=4 > d=2 
//|5-1|=4 > d=2 
//|5-8|=3 > d=2
//For arr1[2]=8 we have:
//|8-10|=2 <= d=2
//|8-9|=1 <= d=2
//|8-1|=7 > d=2
//|8-8|=0 <= d=2
// 
//
// Example 2: 
//
// 
//Input: arr1 = [1,4,2,3], arr2 = [-4,-3,6,10,20,30], d = 3
//Output: 2
// 
//
// Example 3: 
//
// 
//Input: arr1 = [2,1,100,3], arr2 = [-5,-2,10,-3,7], d = 6
//Output: 1
// 
//
// 
// Constraints: 
//
// 
// 1 <= arr1.length, arr2.length <= 500 
// -1000 <= arr1[i], arr2[j] <= 1000 
// 0 <= d <= 100 
// 
//
// Related Topics Array Two Pointers Binary Search Sorting 👍 584 👎 2200
    
package leetcode.editor.en;

import java.util.Arrays;

/**
 * id: 1385
 * title: Find the Distance Value Between Two Arrays
 * author: Ives.He 
 * date: 2022-10-15 16:31:05
 * for TEST copy:
 * import leetcode.editor.en.P1385_FindTheDistanceValueBetweenTwoArrays .Solution;
 * P1385_FindTheDistanceValueBetweenTwoArrays_Test
 */
public class P1385_FindTheDistanceValueBetweenTwoArrays{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    /**
     * 參考leetcode討論區解說，寫到這題先給負評，題意描述不清楚，在說火星文
     * Calculate the distance between arr1[i] and arr2[j]
     * and find the number of elements in arr1 where it's distances are NOT LESS THAN or EQUAL TO d.
     * 尋找數量符合大於distance的arr1數量
     */
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        Arrays.sort(arr2);
        for (int num : arr1) {
            if(isInRange(arr2,num-d,num+d)) count++;
        }
        return count;
    }

   private boolean isInRange(int[] arr, int from, int to) {
        int l = 0;
        int r = arr.length-1;
        while(l<=r){
            int m = l + (r-l)/2;
            if(arr[m]>=from && arr[m]<=to) return false;
            else if(arr[m]<from) l = m+1;
            else if(arr[m]>to) r = m-1;
        }
        return true;
   }
}
//leetcode submit region end(Prohibit modification and deletion)

}
//You are given an integer array arr. Sort the integers in the array in 
//ascending order by the number of 1's in their binary representation and in case of two 
//or more integers have the same number of 1's you have to sort them in ascending 
//order. 
//
// Return the array after sorting it. 
//
// 
// Example 1: 
//
// 
//Input: arr = [0,1,2,3,4,5,6,7,8]
//Output: [0,1,2,4,8,3,5,6,7]
//Explantion: [0] is the only integer with 0 bits.
//[1,2,4,8] all have 1 bit.
//[3,5,6] have 2 bits.
//[7] has 3 bits.
//The sorted array by bits is [0,1,2,4,8,3,5,6,7]
// 
//
// Example 2: 
//
// 
//Input: arr = [1024,512,256,128,64,32,16,8,4,2,1]
//Output: [1,2,4,8,16,32,64,128,256,512,1024]
//Explantion: All integers have 1 bit in the binary representation, you should 
//just sort them in ascending order.
// 
//
// 
// Constraints: 
//
// 
// 1 <= arr.length <= 500 
// 0 <= arr[i] <= 10⁴ 
// 
//
// Related Topics Array Bit Manipulation Sorting Counting 👍 1287 👎 56
    
package leetcode.editor.en;

import java.util.Arrays;
import java.util.Comparator;

/**
 * id: 1356
 * title: Sort Integers by The Number of 1 Bits
 * author: Ives.He 
 * date: 2022-09-29 22:48:19
 * for TEST copy:
 * import leetcode.editor.en.P1356_SortIntegersByTheNumberOf1Bits .Solution;
 * P1356_SortIntegersByTheNumberOf1Bits_Test
 */
public class P1356_SortIntegersByTheNumberOf1Bits{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] sortByBits(int[] arr) {
        int[][] counts = new int [arr.length][2];
        // 放到暫存區內
        for (int i = 0; i < arr.length; i++) {
            counts[i][0] = arr[i];
            counts[i][1] = getBitCount(arr[i]);
        }
        Arrays.sort(counts,(int[] a, int[] b)-> {
           if(a[1]!=b[1]){  // 如果count數不同時,比較count數較大的
               return a[1] - b[1];
           }else{           // 如果count數相同時,比較原先的數字
               return a[0] - b[0];
           }
        });
        for (int i = 0; i < counts.length; i++) {
            arr[i] = counts[i][0];
        }
        return arr;
    }
    private int getBitCount(int d){
        int count = 0;
        while(d!=0){
            count += d&1;
            d >>= 1;
        }
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
//There is a hidden integer array arr that consists of n non-negative integers. 
//
//
// It was encoded into another integer array encoded of length n - 1, such that 
//encoded[i] = arr[i] XOR arr[i + 1]. For example, if arr = [1,0,2,1], then 
//encoded = [1,2,3]. 
//
// You are given the encoded array. You are also given an integer first, that 
//is the first element of arr, i.e. arr[0]. 
//
// Return the original array arr. It can be proved that the answer exists and 
//is unique. 
//
// 
// Example 1: 
//
// 
//Input: encoded = [1,2,3], first = 1
//Output: [1,0,2,1]
//Explanation: If arr = [1,0,2,1], then first = 1 and encoded = [1 XOR 0, 0 XOR 
//2, 2 XOR 1] = [1,2,3]
// 
//
// Example 2: 
//
// 
//Input: encoded = [6,2,7,3], first = 4
//Output: [4,2,0,7,4]
// 
//
// 
// Constraints: 
//
// 
// 2 <= n <= 10⁴ 
// encoded.length == n - 1 
// 0 <= encoded[i] <= 10⁵ 
// 0 <= first <= 10⁵ 
// 
//
// Related Topics Array Bit Manipulation 👍 1337 👎 196
    
package leetcode.editor.en;
/** 
 * id: 1720
 * title: Decode XORed Array
 * author: Ives.He 
 * date: 2023-06-03 16:58:04
 * for TEST copy:
 * import leetcode.editor.en.P1720_DecodeXoredArray .Solution;
 * P1720_DecodeXoredArray_Test
 */
public class P1720_DecodeXoredArray{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] decode(int[] encoded, int first) {
        /* xor 交換律
         * A ^ B = C
         * A ^ B ^ A = C ^ A
         * B = C ^ A
         */
        int[] result = new int[encoded.length+1];
        result[0] = first;
        for(int i = 1; i<result.length;i++){
            result[i] = encoded[i-1] ^ result[i-1];
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
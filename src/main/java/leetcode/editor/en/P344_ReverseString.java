//Write a function that reverses a string. The input string is given as an 
//array of characters s. 
//
// 
// Example 1: 
// Input: s = ["h","e","l","l","o"]
//Output: ["o","l","l","e","h"]
// Example 2: 
// Input: s = ["H","a","n","n","a","h"]
//Output: ["h","a","n","n","a","H"]
// 
// 
// Constraints: 
//
// 
// 1 <= s.length <= 10⁵ 
// s[i] is a printable ascii character. 
// 
//
// 
// Follow up: Do not allocate extra space for another array. You must do this 
//by modifying the input array in-place with O(1) extra memory. 
// Related Topics Two Pointers String Recursion 👍 3229 👎 844
    
package leetcode.editor.en;
/** 
 * id: 344
 * title: Reverse String
 * author: Ives.He 
 * date: 2021-10-30 20:49:39
 * for TEST copy:
 * import leetcode.editor.en.P344_ReverseString.Solution;
 * P344_ReverseString_Test
 */
public class P344_ReverseString{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void reverseString(char[] s) {
        helper(s,0,s.length-1);
    }
    void helper(char[]s,int start,int end){
        if(start<end){
            // 資料備份
            char tmp = s[start];
            // 頭尾轉換資料
            s[start] = s[end];
            s[end] = tmp;
            // 遞迴
            helper(s,start+1,end-1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
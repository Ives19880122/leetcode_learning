//Given a positive integer num, write a function which returns True if num is a 
//perfect square else False. 
//
// Follow up: Do not use any built-in library function such as sqrt. 
//
// 
// Example 1: 
// Input: num = 16
//Output: true
// 
// Example 2: 
// Input: num = 14
//Output: false
// 
// 
// Constraints: 
//
// 
// 1 <= num <= 2^31 - 1 
// 
//
// Related Topics Math Binary Search ð 2914 ð 253
    
package leetcode.editor.en;
/** 
 * id: 367
 * title: Valid Perfect Square
 * author: Ives.He 
 * date: 2022-10-14 00:38:34
 * for TEST copy:
 * import leetcode.editor.en.P367_ValidPerfectSquare .Solution;
 * P367_ValidPerfectSquare_Test
 */
public class P367_ValidPerfectSquare{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1) return true;
        int max_sqrt = 46341;                     // 2ç31æ¬¡æ¹éæ ¹è,intæå¤§éå¶
        int left = 0;                             // å·¦å´ç¨0ç¶ä½éç
        int right = num>max_sqrt? max_sqrt : num; // ç¢ºå®è¼¸å¥å¼çå³å´éç
        while(left<=right){
            int mid = left+ (right-left)/2;
            if(left*left==num||right*right==num||mid*mid==num) return true;
            else if(mid*mid>num) right = mid;
            else if(mid*mid<num) left = mid;
            left++;
            right--;
        }
        return false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
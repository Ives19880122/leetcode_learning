//A phrase is a palindrome if, after converting all uppercase letters into 
//lowercase letters and removing all non-alphanumeric characters, it reads the same 
//forward and backward. Alphanumeric characters include letters and numbers. 
//
// Given a string s, return true if it is a palindrome, or false otherwise. 
//
// 
// Example 1: 
//
// 
//Input: s = "A man, a plan, a canal: Panama"
//Output: true
//Explanation: "amanaplanacanalpanama" is a palindrome.
// 
//
// Example 2: 
//
// 
//Input: s = "race a car"
//Output: false
//Explanation: "raceacar" is not a palindrome.
// 
//
// Example 3: 
//
// 
//Input: s = " "
//Output: true
//Explanation: s is an empty string "" after removing non-alphanumeric 
//characters.
//Since an empty string reads the same forward and backward, it is a palindrome.
//
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 2 * 10⁵ 
// s consists only of printable ASCII characters. 
// 
// Related Topics Two Pointers String 👍 4815 👎 5961
    
package leetcode.editor.en;
/** 
 * id: 125
 * title: Valid Palindrome
 * author: Ives.He 
 * date: 2022-09-17 10:22:59
 * for TEST copy:
 * import leetcode.editor.en.P125_ValidPalindrome .Solution;
 * P125_ValidPalindrome_Test
 */
public class P125_ValidPalindrome{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isPalindrome(String s) {
        String n = s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        int l = 0;
        int r = n.length()-1;
        while(l<r){
            if(n.charAt(l)!=n.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
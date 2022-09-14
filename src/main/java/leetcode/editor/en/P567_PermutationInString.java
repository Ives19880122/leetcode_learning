//Given two strings s1 and s2, return true if s2 contains a permutation of s1, 
//or false otherwise. 
//
// In other words, return true if one of s1's permutations is the substring of 
//s2. 
//
// 
// Example 1: 
//
// 
//Input: s1 = "ab", s2 = "eidbaooo"
//Output: true
//Explanation: s2 contains one permutation of s1 ("ba").
// 
//
// Example 2: 
//
// 
//Input: s1 = "ab", s2 = "eidboaoo"
//Output: false
// 
//
// 
// Constraints: 
//
// 
// 1 <= s1.length, s2.length <= 10⁴ 
// s1 and s2 consist of lowercase English letters. 
// 
// Related Topics Hash Table Two Pointers String Sliding Window 👍 7086 👎 232
    
package leetcode.editor.en;

import java.util.Arrays;

/**
 * id: 567
 * title: Permutation in String
 * author: Ives.He 
 * date: 2022-09-11 14:47:04
 * for TEST copy:
 * import leetcode.editor.en.P567_PermutationInString .Solution;
 * P567_PermutationInString_Test
 */
public class P567_PermutationInString{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        if(s1.equals(s2)) return true;
        int[] count1 = new int [26];
        int[] count2 = new int [26];
        int len1 = s1.length();
        int len2 = s2.length();
        // set slide window init
        for (int i=0; i<len1; i++) {
            count1 [s1.charAt(i) - 'a']++;
            count2 [s2.charAt(i) - 'a']++;
        }
        // move slide window (cansel head, add tail)
        for(int i=len1; i<len2; i++){
            if(Arrays.equals(count1,count2)) return true;
            count2 [s2.charAt(i) - 'a']++;
            count2 [s2.charAt(i-len1) - 'a' ]--;
        }
        // final check array equals
        return Arrays.equals(count1,count2) ? true : false;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
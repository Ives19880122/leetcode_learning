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
        int[] table = new int [26];
        int len = s1.length();
        // set record table
        for (char c : s1.toCharArray()) {
            table [c - 'a'] += 1;
        }
        char[] arr = s2.toCharArray();
        int start = 0;
        int end = s2.length() - 1;
        while(start <= end){
            int[] ref = new int[26];
            if(start+len <= arr.length){
                for(int i=start; i<start+len; i++){
                    ref [arr[i]-'a'] += 1;
                }
                if(isSame(table,ref)) return true;
            }
            ref = new int[26];
            if(end-len>=0){
                for(int i=end; i>end-len; i--){
                    ref [arr[i]-'a'] += 1;
                }
                if(isSame(table,ref)) return true;
            }
            start++;
            end--;
        }
        return false;
    }
    private boolean isSame(int[]o, int[]r){
        for(int i=0; i< o.length; i++){
            if(o[i]!=r[i]) return false;
        }
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
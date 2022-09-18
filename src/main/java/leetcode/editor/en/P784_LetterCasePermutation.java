//Given a string s, you can transform every letter individually to be lowercase 
//or uppercase to create another string. 
//
// Return a list of all possible strings we could create. Return the output in 
//any order. 
//
// 
// Example 1: 
//
// 
//Input: s = "a1b2"
//Output: ["a1b2","a1B2","A1b2","A1B2"]
// 
//
// Example 2: 
//
// 
//Input: s = "3z4"
//Output: ["3z4","3Z4"]
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 12 
// s consists of lowercase English letters, uppercase English letters, and 
//digits. 
// 
// Related Topics String Backtracking Bit Manipulation 👍 3769 👎 149
    
package leetcode.editor.en;

import java.util.*;

/**
 * id: 784
 * title: Letter Case Permutation
 * author: Ives.He 
 * date: 2022-09-18 02:05:03
 * for TEST copy:
 * import leetcode.editor.en.P784_LetterCasePermutation .Solution;
 * P784_LetterCasePermutation_Test
 */
public class P784_LetterCasePermutation{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    private List<String> result = new ArrayList<>();
    public List<String> letterCasePermutation(String s) {
        backtrack(s.toCharArray(),0, new StringBuilder());
        return result;
    }
    private void backtrack(char[] s , int idx, StringBuilder track){
        if(s.length == track.length()){
            result.add(track.toString());
            return;
        }
        char c = s[idx];
        if(Character.isLetter(c)){
            // 小寫處理
            c = Character.toLowerCase(c);
            StringBuilder d1 = new StringBuilder(track.toString());
            d1.append(c);
            backtrack(s,idx+1, d1);
            // 大寫處理
            c = Character.toUpperCase(c);
            StringBuilder d2 = new StringBuilder(track.toString());
            d2.append(c);
            backtrack(s,idx+1 ,d2);
        } else{
            track.append(c);
            backtrack(s,idx+1, track);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
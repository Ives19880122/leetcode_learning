//Given a string s, find the length of the longest substring without repeating 
//characters. 
//
// 
// Example 1: 
//
// 
//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.
// 
//
// Example 2: 
//
// 
//Input: s = "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.
// 
//
// Example 3: 
//
// 
//Input: s = "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3.
//Notice that the answer must be a substring, "pwke" is a subsequence and not a 
//substring.
// 
//
// 
// Constraints: 
//
// 
// 0 <= s.length <= 5 * 10⁴ 
// s consists of English letters, digits, symbols and spaces. 
// 
// Related Topics Hash Table String Sliding Window 👍 28452 👎 1216
    
package leetcode.editor.en;

import java.util.HashMap;
import java.util.HashSet;

/**
 * id: 3
 * title: Longest Substring Without Repeating Characters
 * author: Ives.He 
 * date: 2022-09-11 12:45:27
 * for TEST copy:
 * import leetcode.editor.en.P3_LongestSubstringWithoutRepeatingCharacters .Solution;
 * P3_LongestSubstringWithoutRepeatingCharacters_Test
 */
public class P3_LongestSubstringWithoutRepeatingCharacters{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        HashSet<Character> set = new HashSet<>();
        char[] chars = s.toCharArray();
        int start = 0;
        int idx = start;
        int end = chars.length;
        while(idx<end) {
            // 遇到重複時,把起始位置+1,重新掃描idx(窗格滑動)
            if(set.contains(chars[idx])) {
                result = Math.max(result, set.size());
                set.clear();
                start++;
                idx=start;
            }
            set.add(chars[idx]);
            idx++;
        }
        return Math.max(result, set.size());
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
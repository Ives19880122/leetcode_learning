//The DNA sequence is composed of a series of nucleotides abbreviated as 'A', 
//'C', 'G', and 'T'. 
//
// 
// For example, "ACGAATTCCG" is a DNA sequence. 
// 
//
// When studying DNA, it is useful to identify repeated sequences within the 
//DNA. 
//
// Given a string s that represents a DNA sequence, return all the 10-letter-
//long sequences (substrings) that occur more than once in a DNA molecule. You may 
//return the answer in any order. 
//
// 
// Example 1: 
// Input: s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT"
//Output: ["AAAAACCCCC","CCCCCAAAAA"]
// Example 2: 
// Input: s = "AAAAAAAAAAAAA"
//Output: ["AAAAAAAAAA"]
// 
// 
// Constraints: 
//
// 
// 1 <= s.length <= 10⁵ 
// s[i] is either 'A', 'C', 'G', or 'T'. 
// 
// Related Topics Hash Table String Bit Manipulation Sliding Window Rolling 
//Hash Hash Function 👍 1959 👎 406
    
package leetcode.editor.en;

import java.util.*;

/**
 * id: 187
 * title: Repeated DNA Sequences
 * author: Ives.He 
 * date: 2022-04-26 23:51:22
 * for TEST copy:
 * import leetcode.editor.en.P187_RepeatedDnaSequences .Solution;
 * P187_RepeatedDnaSequences_Test
 */
public class P187_RepeatedDnaSequences{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> map = new HashSet<>();
        Set<String> set = new HashSet<>();
        for(int i = 0; i <= s.length()-10; i++){
            String key = s.substring(i,i+10);
            if(!set.add(key)){
                map.add(key);
            }
        }
        return new ArrayList<>(map);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
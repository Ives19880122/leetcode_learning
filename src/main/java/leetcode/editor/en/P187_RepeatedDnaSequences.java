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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

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
        List<String> list = new ArrayList<>();
        if(s.length()<=10) return list;
        int start = 0;
        int end = 10;
        HashMap<String,Integer> map = new HashMap<>();
        // 調整操作
        while(end<=s.length()){
            String key = s.substring(start++,end++);
            if(!map.containsKey(key)){
                map.put(key,1);
            }else if(map.get(key)==1){
                map.put(key,2);
                list.add(key);
            }
        }
        return list;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
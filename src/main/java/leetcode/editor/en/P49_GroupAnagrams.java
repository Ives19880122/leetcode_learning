//Given an array of strings strs, group the anagrams together. You can return 
//the answer in any order. 
//
// An Anagram is a word or phrase formed by rearranging the letters of a 
//different word or phrase, typically using all the original letters exactly once. 
//
// 
// Example 1: 
// Input: strs = ["eat","tea","tan","ate","nat","bat"]
//Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
// 
// Example 2: 
// Input: strs = [""]
//Output: [[""]]
// 
// Example 3: 
// Input: strs = ["a"]
//Output: [["a"]]
// 
// 
// Constraints: 
//
// 
// 1 <= strs.length <= 10⁴ 
// 0 <= strs[i].length <= 100 
// strs[i] consists of lowercase English letters. 
// 
//
// Related Topics Array Hash Table String Sorting 👍 11909 👎 369
    
package leetcode.editor.en;

import java.util.*;

/**
 * id: 49
 * title: Group Anagrams
 * author: Ives.He 
 * date: 2022-10-03 22:34:23
 * for TEST copy:
 * import leetcode.editor.en.P49_GroupAnagrams .Solution;
 * P49_GroupAnagrams_Test
 */
public class P49_GroupAnagrams{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,Integer> dic = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        for (String s : strs) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String tmp = String.valueOf(c);
            if(!dic.containsKey(tmp)) {
                dic.put(tmp,result.size());
                List<String> data = new ArrayList<>();
                result.add(data);
            }
            result.get(dic.get(tmp)).add(s);
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
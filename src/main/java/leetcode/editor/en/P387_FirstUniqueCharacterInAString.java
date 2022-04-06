//Given a string s, find the first non-repeating character in it and return its 
//index. If it does not exist, return -1. 
//
// 
// Example 1: 
// Input: s = "leetcode"
//Output: 0
// Example 2: 
// Input: s = "loveleetcode"
//Output: 2
// Example 3: 
// Input: s = "aabb"
//Output: -1
// 
// 
// Constraints: 
//
// 
// 1 <= s.length <= 10⁵ 
// s consists of only lowercase English letters. 
// 
// Related Topics Hash Table String Queue Counting 👍 4798 👎 191
    
package leetcode.editor.en;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * id: 387
 * title: First Unique Character in a String
 * author: Ives.He 
 * date: 2022-04-06 22:30:51
 * for TEST copy:
 * import leetcode.editor.en.P387_FirstUniqueCharacterInAString .Solution;
 * P387_FirstUniqueCharacterInAString_Test
 */
public class P387_FirstUniqueCharacterInAString{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int firstUniqChar(String s) {
        char [] chars = s.toCharArray();
        int result = -1;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < chars.length; i++){
            map.compute(chars[i],(k,v)->v==null?  1 : v+1 );
        }
        for(int i = 0; i<chars.length; i++){
            if(map.get(chars[i])==1){
                return i;
            }
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
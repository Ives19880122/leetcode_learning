//Write a function to find the longest common prefix string amongst an array of 
//strings. 
//
// If there is no common prefix, return an empty string "". 
//
// 
// Example 1: 
//
// 
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
// 
//
// Example 2: 
//
// 
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.
// 
//
// 
// Constraints: 
//
// 
// 1 <= strs.length <= 200 
// 0 <= strs[i].length <= 200 
// strs[i] consists of only lower-case English letters. 
// 
// Related Topics String 👍 5574 👎 2517
    
package leetcode.editor.en;

import java.util.Arrays;

/**
 * @author  Ives.He 
 * @date    2021-10-05 00:24:48 
 */
public class P14_LongestCommonPrefix {
    public static void main(String[] args) {
        Solution solution = new P14_LongestCommonPrefix().new Solution();
    }    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1){
            return strs[0];
        }
        Arrays.sort(strs);
        int tmp = 0;
        boolean check = true;
        while( check && tmp < strs[0].length()){
           char ref = strs[0].charAt(tmp);
           for(int i= 1; i<strs.length; i++){
                if(ref != strs[i].charAt(tmp)){
                    check = false;
                    break;
                }
           }
           if(check){
               tmp++;
           }
        }
        return tmp>0 ? strs[0].substring(0,tmp):"";
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
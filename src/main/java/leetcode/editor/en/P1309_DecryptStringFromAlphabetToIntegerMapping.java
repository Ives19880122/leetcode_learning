//You are given a string s formed by digits and '#'. We want to map s to 
//English lowercase characters as follows: 
//
// 
// Characters ('a' to 'i') are represented by ('1' to '9') respectively. 
// Characters ('j' to 'z') are represented by ('10#' to '26#') respectively. 
// 
//
// Return the string formed after mapping. 
//
// The test cases are generated so that a unique mapping will always exist. 
//
// 
// Example 1: 
//
// 
//Input: s = "10#11#12"
//Output: "jkab"
//Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
// 
//
// Example 2: 
//
// 
//Input: s = "1326#"
//Output: "acz"
// 
//
// 
// Constraints: 
//
// 
// 1 <= s.length <= 1000 
// s consists of digits and the '#' letter. 
// s will be a valid string such that mapping is always possible. 
// 
//
// Related Topics String 👍 1156 👎 83
    
package leetcode.editor.en;
/** 
 * id: 1309
 * title: Decrypt String from Alphabet to Integer Mapping
 * author: Ives.He 
 * date: 2022-09-27 22:53:53
 * for TEST copy:
 * import leetcode.editor.en.P1309_DecryptStringFromAlphabetToIntegerMapping .Solution;
 * P1309_DecryptStringFromAlphabetToIntegerMapping_Test
 */
public class P1309_DecryptStringFromAlphabetToIntegerMapping{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String freqAlphabets(String s) {
        int idx = s.length()-1;
        StringBuffer sb = new StringBuffer();
        while(idx>-1){
            if(s.charAt(idx)=='#'){
                sb.insert(0,(char)( Integer.valueOf(s.charAt(idx-2)+1-'1') * 10 + Integer.valueOf(s.charAt(idx-1)+1-'1') - 1 + 'a'));
                idx -= 3;
            }else{
                sb.insert(0,(char)(Integer.valueOf(s.charAt(idx)+1-'1')-1+'a'));
                idx--;
            }
        }
        return sb.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
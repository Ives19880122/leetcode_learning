//Implement strStr(). 
//
// Return the index of the first occurrence of needle in haystack, or -1 if 
//needle is not part of haystack. 
//
// Clarification: 
//
// What should we return when needle is an empty string? This is a great 
//question to ask during an interview. 
//
// For the purpose of this problem, we will return 0 when needle is an empty 
//string. This is consistent to C's strstr() and Java's indexOf(). 
//
// 
// Example 1: 
// Input: haystack = "hello", needle = "ll"
//Output: 2
// Example 2: 
// Input: haystack = "aaaaa", needle = "bba"
//Output: -1
// Example 3: 
// Input: haystack = "", needle = ""
//Output: 0
// 
// 
// Constraints: 
//
// 
// 0 <= haystack.length, needle.length <= 5 * 10⁴ 
// haystack and needle consist of only lower-case English characters. 
// 
// Related Topics Two Pointers String String Matching 👍 3006 👎 2835
    
package leetcode.editor.en;
/** 
 * id: 28
 * title: Implement strStr()
 * author: Ives.He 
 * date: 2021-10-07 22:51:57
 * import leetcode.editor.en.P28_ImplementStrstr.Solution;
 */
public class P28_ImplementStrstr{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int strStr(String haystack, String needle) {
        int len = needle.length();
        if(len==0) return len;
        if(!haystack.contains(needle)) return -1;
        char[] h = haystack.toCharArray();
        char[] n = needle.toCharArray();
        int idx =0;
        while(idx+len<=h.length){
            int tmp = 0;
            while(tmp<len && h[idx+tmp]== n[tmp]){
                tmp++;
            }
            if(tmp==len)return idx;
            idx++;
        }
        return -1;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
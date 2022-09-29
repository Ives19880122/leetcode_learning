//In an alien language, surprisingly, they also use English lowercase letters, 
//but possibly in a different order. The order of the alphabet is some permutation 
//of lowercase letters. 
//
// Given a sequence of words written in the alien language, and the order of 
//the alphabet, return true if and only if the given words are sorted 
//lexicographically in this alien language. 
//
// 
// Example 1: 
//
// 
//Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
//Output: true
//Explanation: As 'h' comes before 'l' in this language, then the sequence is 
//sorted.
// 
//
// Example 2: 
//
// 
//Input: words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
//Output: false
//Explanation: As 'd' comes after 'l' in this language, then words[0] > words[1]
//, hence the sequence is unsorted.
// 
//
// Example 3: 
//
// 
//Input: words = ["apple","app"], order = "abcdefghijklmnopqrstuvwxyz"
//Output: false
//Explanation: The first three characters "app" match, and the second string is 
//shorter (in size.) According to lexicographical rules "apple" > "app", because 
//'l' > '∅', where '∅' is defined as the blank character which is less than any 
//other character (More info).
// 
//
// 
// Constraints: 
//
// 
// 1 <= words.length <= 100 
// 1 <= words[i].length <= 20 
// order.length == 26 
// All characters in words[i] and order are English lowercase letters. 
// 
//
// Related Topics Array Hash Table String 👍 3099 👎 987
    
package leetcode.editor.en;
/** 
 * id: 953
 * title: Verifying an Alien Dictionary
 * author: Ives.He 
 * date: 2022-09-29 22:53:43
 * for TEST copy:
 * import leetcode.editor.en.P953_VerifyingAnAlienDictionary .Solution;
 * P953_VerifyingAnAlienDictionary_Test
 */
public class P953_VerifyingAnAlienDictionary{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    int[] dic = new int[26];
    public boolean isAlienSorted(String[] words, String order) {
        for (int i = 0; i < order.length(); i++) {
            dic[order.charAt(i)-'a'] = i+1;
        }
        for (int i = 1; i < words.length; i++) {
            if(checkOrder(words[i-1],words[i])){
                return false;
            }
        }
        return true;
    }
    private boolean checkOrder(String s1, String s2){
        int m = s1.length();
        int n = s2.length();
        for (int i = 0; i < m && i < n; i++) {
            if(s1.charAt(i) != s2.charAt(i))
                return dic[s1.charAt(i)-'a'] > dic[s2.charAt(i)-'a'];
        }
        return m > n;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
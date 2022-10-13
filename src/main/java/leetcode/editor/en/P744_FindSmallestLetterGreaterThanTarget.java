//You are given an array of characters letters that is sorted in non-decreasing 
//order, and a character target. There are at least two different characters in 
//letters. 
//
// Return the smallest character in letters that is lexicographically greater 
//than target. If such a character does not exist, return the first character in 
//letters. 
//
// 
// Example 1: 
//
// 
//Input: letters = ["c","f","j"], target = "a"
//Output: "c"
//Explanation: The smallest character that is lexicogrpahically greater than 
//'a' in letters is 'c'.
// 
//
// Example 2: 
//
// 
//Input: letters = ["c","f","j"], target = "c"
//Output: "f"
//Explanation: The smallest character that is lexicogrpahically greater than 
//'c' in letters is 'f'.
// 
//
// Example 3: 
//
// 
//Input: letters = ["x","x","y","y"], target = "z"
//Output: "x"
//Explanation: There are no characters in letters that is lexicographically 
//greater than 'z' so we return letters[0].
// 
//
// 
// Constraints: 
//
// 
// 2 <= letters.length <= 10⁴ 
// letters[i] is a lowercase English letter. 
// letters is sorted in non-decreasing order. 
// letters contains at least two different characters. 
// target is a lowercase English letter. 
// 
//
// Related Topics Array Binary Search 👍 2259 👎 1898
    
package leetcode.editor.en;
/** 
 * id: 744
 * title: Find Smallest Letter Greater Than Target
 * author: Ives.He 
 * date: 2022-10-13 23:58:27
 * for TEST copy:
 * import leetcode.editor.en.P744_FindSmallestLetterGreaterThanTarget .Solution;
 * P744_FindSmallestLetterGreaterThanTarget_Test
 */
public class P744_FindSmallestLetterGreaterThanTarget{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int[] dic = new int[26];
        for (char letter: letters) dic[letter -'a']++;
        while(true){
            target++;
            if(target>'z') target = 'a';
            if(dic[target-'a']>0) return target;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
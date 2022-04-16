//You're given strings jewels representing the types of stones that are jewels, 
//and stones representing the stones you have. Each character in stones is a type 
//of stone you have. You want to know how many of the stones you have are also 
//jewels. 
//
// Letters are case sensitive, so "a" is considered a different type of stone 
//from "A". 
//
// 
// Example 1: 
// Input: jewels = "aA", stones = "aAAbbbb"
//Output: 3
// Example 2: 
// Input: jewels = "z", stones = "ZZ"
//Output: 0
// 
// 
// Constraints: 
//
// 
// 1 <= jewels.length, stones.length <= 50 
// jewels and stones consist of only English letters. 
// All the characters of jewels are unique. 
// 
// Related Topics Hash Table String 👍 3471 👎 484
    
package leetcode.editor.en;
/** 
 * id: 771
 * title: Jewels and Stones
 * author: Ives.He 
 * date: 2022-04-17 00:42:46
 * for TEST copy:
 * import leetcode.editor.en.P771_JewelsAndStones .Solution;
 * P771_JewelsAndStones_Test
 */
public class P771_JewelsAndStones{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int [] dic = new int [60];
        int result = 0;
        for(char a : jewels.toCharArray()){
            dic[a-'A']++;
        }
        for(char b : stones.toCharArray()){
            if(dic[b-'A']>0) result++;
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
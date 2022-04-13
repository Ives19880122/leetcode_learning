//Given a string columnTitle that represents the column title as appear in an 
//Excel sheet, return its corresponding column number. 
//
// For example: 
//
// 
//A -> 1
//B -> 2
//C -> 3
//...
//Z -> 26
//AA -> 27
//AB -> 28 
//...
// 
//
// 
// Example 1: 
//
// 
//Input: columnTitle = "A"
//Output: 1
// 
//
// Example 2: 
//
// 
//Input: columnTitle = "AB"
//Output: 28
// 
//
// Example 3: 
//
// 
//Input: columnTitle = "ZY"
//Output: 701
// 
//
// 
// Constraints: 
//
// 
// 1 <= columnTitle.length <= 7 
// columnTitle consists only of uppercase English letters. 
// columnTitle is in the range ["A", "FXSHRXW"]. 
// 
// Related Topics Math String 👍 3219 👎 269
    
package leetcode.editor.en;
/** 
 * id: 171
 * title: Excel Sheet Column Number
 * author: Ives.He 
 * date: 2022-04-14 00:12:47
 * for TEST copy:
 * import leetcode.editor.en.P171_ExcelSheetColumnNumber .Solution;
 * P171_ExcelSheetColumnNumber_Test
 */
public class P171_ExcelSheetColumnNumber{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int titleToNumber(String columnTitle) {
        char arr [] = columnTitle.toCharArray();
        int result = 0;
        for(int i = 0; i<arr.length; i++){
            result += (arr[i] - 'A' + 1) * (int)Math.pow(26,arr.length-1-i);
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
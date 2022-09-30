//Given an integer columnNumber, return its corresponding column title as it 
//appears in an Excel sheet. 
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
//Input: columnNumber = 1
//Output: "A"
// 
//
// Example 2: 
//
// 
//Input: columnNumber = 28
//Output: "AB"
// 
//
// Example 3: 
//
// 
//Input: columnNumber = 701
//Output: "ZY"
// 
//
// 
// Constraints: 
//
// 
// 1 <= columnNumber <= 2³¹ - 1 
// 
//
// Related Topics Math String 👍 3203 👎 468
    
package leetcode.editor.en;
/** 
 * id: 168
 * title: Excel Sheet Column Title
 * author: Ives.He 
 * date: 2022-10-01 02:27:49
 * for TEST copy:
 * import leetcode.editor.en.P168_ExcelSheetColumnTitle .Solution;
 * P168_ExcelSheetColumnTitle_Test
 */
public class P168_ExcelSheetColumnTitle{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String convertToTitle(int columnNumber) {
        if(columnNumber==0) return "";
        if(columnNumber%26 == 0) return convertToTitle(columnNumber/26 - 1) + "Z";
        return convertToTitle(columnNumber/26) + (char)(columnNumber % 26 - 1 + 'A');
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
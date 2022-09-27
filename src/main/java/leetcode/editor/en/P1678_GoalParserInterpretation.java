//You own a Goal Parser that can interpret a string command. The command 
//consists of an alphabet of "G", "()" and/or "(al)" in some order. The Goal Parser will 
//interpret "G" as the string "G", "()" as the string "o", and "(al)" as the 
//string "al". The interpreted strings are then concatenated in the original order. 
//
// Given the string command, return the Goal Parser's interpretation of command.
// 
//
// 
// Example 1: 
//
// 
//Input: command = "G()(al)"
//Output: "Goal"
//Explanation: The Goal Parser interprets the command as follows:
//G -> G
//() -> o
//(al) -> al
//The final concatenated result is "Goal".
// 
//
// Example 2: 
//
// 
//Input: command = "G()()()()(al)"
//Output: "Gooooal"
// 
//
// Example 3: 
//
// 
//Input: command = "(al)G(al)()()G"
//Output: "alGalooG"
// 
//
// 
// Constraints: 
//
// 
// 1 <= command.length <= 100 
// command consists of "G", "()", and/or "(al)" in some order. 
// 
//
// Related Topics String 👍 951 👎 71
    
package leetcode.editor.en;
/** 
 * id: 1678
 * title: Goal Parser Interpretation
 * author: Ives.He 
 * date: 2022-09-27 22:48:15
 * for TEST copy:
 * import leetcode.editor.en.P1678_GoalParserInterpretation .Solution;
 * P1678_GoalParserInterpretation_Test
 */
public class P1678_GoalParserInterpretation{
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String interpret(String command) {
        return command.replace("()","o").replace("(al)","al");
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
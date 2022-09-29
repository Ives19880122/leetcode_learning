//Given head which is a reference node to a singly-linked list. The value of 
//each node in the linked list is either 0 or 1. The linked list holds the binary 
//representation of a number. 
//
// Return the decimal value of the number in the linked list. 
//
// The most significant bit is at the head of the linked list. 
//
// 
// Example 1: 
// 
// 
//Input: head = [1,0,1]
//Output: 5
//Explanation: (101) in base 2 = (5) in base 10
// 
//
// Example 2: 
//
// 
//Input: head = [0]
//Output: 0
// 
//
// 
// Constraints: 
//
// 
// The Linked List is not empty. 
// Number of nodes will not exceed 30. 
// Each node's value is either 0 or 1. 
// 
//
// Related Topics Linked List Math 👍 3085 👎 140
    
package leetcode.editor.en;

import leetcode.util.ListNode;

/**
 * id: 1290
 * title: Convert Binary Number in a Linked List to Integer
 * author: Ives.He 
 * date: 2022-09-29 23:32:11
 * for TEST copy:
 * import leetcode.editor.en.P1290_ConvertBinaryNumberInALinkedListToInteger .Solution;
 * P1290_ConvertBinaryNumberInALinkedListToInteger_Test
 */
public class P1290_ConvertBinaryNumberInALinkedListToInteger{
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    private StringBuffer sb = new StringBuffer();
    public int getDecimalValue(ListNode head) {
        helper(head);
        return Integer.parseInt(sb.toString(),2);
    }
    private void helper(ListNode node){
        if(node==null) return;
        sb.append(node.val);
        helper(node.next);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
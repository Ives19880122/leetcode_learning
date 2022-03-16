//Given the head of a linked list and an integer val, remove all the nodes of 
//the linked list that has Node.val == val, and return the new head. 
//
// 
// Example 1: 
//
// 
//Input: head = [1,2,6,3,4,5,6], val = 6
//Output: [1,2,3,4,5]
// 
//
// Example 2: 
//
// 
//Input: head = [], val = 1
//Output: []
// 
//
// Example 3: 
//
// 
//Input: head = [7,7,7,7], val = 7
//Output: []
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the list is in the range [0, 10⁴]. 
// 1 <= Node.val <= 50 
// 0 <= val <= 50 
// 
// Related Topics Linked List Recursion 👍 4626 👎 158
    
package leetcode.editor.en;

import leetcode.util.ListNode;

/**
 * id: 203
 * title: Remove Linked List Elements
 * author: Ives.He 
 * date: 2022-03-16 23:27:11
 * for TEST copy:
 * import leetcode.editor.en.P203_RemoveLinkedListElements .Solution;
 * P203_RemoveLinkedListElements_Test
 */
public class P203_RemoveLinkedListElements{
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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1, head);
        ListNode slow = dummy;
        ListNode fast = head;
        while(fast!=null){
            if(fast.val == val){
                // 清除slow.next
                slow.next = slow.next.next;
            }else{
                slow = slow.next;
            }
            fast = fast.next;
        }
        return dummy.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
//Given the head of a singly linked list, return the middle node of the linked 
//list. 
//
// If there are two middle nodes, return the second middle node. 
//
// 
// Example 1: 
//
// 
//Input: head = [1,2,3,4,5]
//Output: [3,4,5]
//Explanation: The middle node of the list is node 3.
// 
//
// Example 2: 
//
// 
//Input: head = [1,2,3,4,5,6]
//Output: [4,5,6]
//Explanation: Since the list has two middle nodes with values 3 and 4, we 
//return the second one.
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the list is in the range [1, 100]. 
// 1 <= Node.val <= 100 
// 
// Related Topics Linked List Two Pointers 👍 4890 👎 122
    
package leetcode.editor.en;

import leetcode.util.ListNode;

/**
 * id: 876
 * title: Middle of the Linked List
 * author: Ives.He 
 * date: 2022-03-17 22:49:12
 * for TEST copy:
 * import leetcode.editor.en.P876_MiddleOfTheLinkedList .Solution;
 * P876_MiddleOfTheLinkedList_Test
 */
public class P876_MiddleOfTheLinkedList{
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
    public ListNode middleNode(ListNode head) {
        // 作法一:雙指標
        // fast 走到底,確認index
        // slow 走到middle位置
        ListNode fast = head;
        int idx = 0;
        while (fast!=null){
            fast = fast.next;
            idx++;
        }
        int mid = idx/2;
        ListNode slow = head;
        while(mid>0){
            slow = slow.next;
            mid--;
        }
        return slow;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
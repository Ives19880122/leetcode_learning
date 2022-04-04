//You are given the head of a linked list, and an integer k. 
//
// Return the head of the linked list after swapping the values of the kᵗʰ node 
//from the beginning and the kᵗʰ node from the end (the list is 1-indexed). 
//
// 
// Example 1: 
//
// 
//Input: head = [1,2,3,4,5], k = 2
//Output: [1,4,3,2,5]
// 
//
// Example 2: 
//
// 
//Input: head = [7,9,6,6,7,8,3,0,9,5], k = 5
//Output: [7,9,6,6,8,7,3,0,9,5]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the list is n. 
// 1 <= k <= n <= 10⁵ 
// 0 <= Node.val <= 100 
// 
// Related Topics Linked List Two Pointers 👍 2467 👎 90
    
package leetcode.editor.en;

import leetcode.util.ListNode;

/**
 * id: 1721
 * title: Swapping Nodes in a Linked List
 * author: Ives.He 
 * date: 2022-04-05 01:31:41
 * for TEST copy:
 * import leetcode.editor.en.P1721_SwappingNodesInALinkedList .Solution;
 * P1721_SwappingNodesInALinkedList_Test
 */
public class P1721_SwappingNodesInALinkedList{
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
    public ListNode swapNodes(ListNode head, int k) {
        // 快慢指標
        ListNode fast = head;
        ListNode slow = head;
        ListNode start;
        ListNode end;
        // location第k個,是index-1
        while(k>1){
            fast = fast.next;
            k--;
        }
        start = fast;
        // 快指標到底的時候,要判斷next是否為空,不然slow會多跑1
        while(fast!=null&&fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }
        end = slow;
        // 交換結果
        int tmp = start.val;
        start.val = end.val;
        end.val = tmp;
        return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
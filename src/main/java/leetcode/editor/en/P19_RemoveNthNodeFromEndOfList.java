//Given the head of a linked list, remove the nᵗʰ node from the end of the list 
//and return its head. 
//
// 
// Example 1: 
//
// 
//Input: head = [1,2,3,4,5], n = 2
//Output: [1,2,3,5]
// 
//
// Example 2: 
//
// 
//Input: head = [1], n = 1
//Output: []
// 
//
// Example 3: 
//
// 
//Input: head = [1,2], n = 1
//Output: [1]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the list is sz. 
// 1 <= sz <= 30 
// 0 <= Node.val <= 100 
// 1 <= n <= sz 
// 
//
// 
// Follow up: Could you do this in one pass? 
// Related Topics Linked List Two Pointers 👍 9185 👎 435
    
package leetcode.editor.en;

import leetcode.util.ListNode;

/**
 * id: 19
 * title: Remove Nth Node From End of List
 * author: Ives.He 
 * date: 2022-03-15 22:26:08
 * for TEST copy:
 * import leetcode.editor.en.P19_RemoveNthNodeFromEndOfList .Solution;
 * P19_RemoveNthNodeFromEndOfList_Test
 */
public class P19_RemoveNthNodeFromEndOfList{
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 參考網路建議使用快慢指標
        ListNode node = new ListNode(0, head);
        ListNode slow = node;
        ListNode fast = head;
        // 1.讓fast先走n步
        for(int i=0; i<n; i++){
            fast = fast.next;
        }
        // 2.讓fast,slow同時前進,fast為null時踩到終點
        while(fast!=null){
            fast = fast.next;
            slow = slow.next;
        }
        // 3.移除結束位置的資料
        slow.next = slow.next.next;
        return node.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
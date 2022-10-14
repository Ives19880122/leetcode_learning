//You are given the head of a linked list. Delete the middle node, and return 
//the head of the modified linked list. 
//
// The middle node of a linked list of size n is the ⌊n / 2⌋ᵗʰ node from the 
//start using 0-based indexing, where ⌊x⌋ denotes the largest integer less than or 
//equal to x. 
//
// 
// For n = 1, 2, 3, 4, and 5, the middle nodes are 0, 1, 1, 2, and 2, 
//respectively. 
// 
//
// 
// Example 1: 
// 
// 
//Input: head = [1,3,4,7,1,2,6]
//Output: [1,3,4,1,2,6]
//Explanation:
//The above figure represents the given linked list. The indices of the nodes 
//are written below.
//Since n = 7, node 3 with value 7 is the middle node, which is marked in red.
//We return the new list after removing this node. 
// 
//
// Example 2: 
// 
// 
//Input: head = [1,2,3,4]
//Output: [1,2,4]
//Explanation:
//The above figure represents the given linked list.
//For n = 4, node 2 with value 3 is the middle node, which is marked in red.
// 
//
// Example 3: 
// 
// 
//Input: head = [2,1]
//Output: [2]
//Explanation:
//The above figure represents the given linked list.
//For n = 2, node 1 with value 1 is the middle node, which is marked in red.
//Node 0 with value 2 is the only node remaining after removing node 1. 
//
// 
// Constraints: 
//
// 
// The number of nodes in the list is in the range [1, 10⁵]. 
// 1 <= Node.val <= 10⁵ 
// 
//
// Related Topics Linked List Two Pointers 👍 2197 👎 41
    
package leetcode.editor.en;

import leetcode.util.ListNode;

/**
 * id: 2095
 * title: Delete the Middle Node of a Linked List
 * author: Ives.He 
 * date: 2022-10-15 00:43:12
 * for TEST copy:
 * import leetcode.editor.en.P2095_DeleteTheMiddleNodeOfALinkedList .Solution;
 * P2095_DeleteTheMiddleNodeOfALinkedList_Test
 */
public class P2095_DeleteTheMiddleNodeOfALinkedList{
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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null) return null;
        int fast = 0;
        int slow = 0;
        ListNode tmp = head;
        while(tmp!=null){
            tmp = tmp.next;
            fast++;
        }
        int m = fast / 2;
        tmp = head;
        while(slow < m-1){
            tmp = tmp.next;
            slow++;
        }
        tmp.next = tmp.next.next;
        return head;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
//Given the head of a singly linked list, reverse the list, and return the 
//reversed list. 
//
// 
// Example 1: 
//
// 
//Input: head = [1,2,3,4,5]
//Output: [5,4,3,2,1]
// 
//
// Example 2: 
//
// 
//Input: head = [1,2]
//Output: [2,1]
// 
//
// Example 3: 
//
// 
//Input: head = []
//Output: []
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the list is the range [0, 5000]. 
// -5000 <= Node.val <= 5000 
// 
//
// 
// Follow up: A linked list can be reversed either iteratively or recursively. 
//Could you implement both? 
// Related Topics Linked List Recursion 👍 9018 👎 161
    
package leetcode.editor.en;

import leetcode.util.ListNode;

/**
 * id: 206
 * title: Reverse Linked List
 * author: Ives.He 
 * date: 2021-10-31 20:10:33
 * for TEST copy:
 * import leetcode.editor.en.P206_ReverseLinkedList .Solution;
 * P206_ReverseLinkedList_Test
 */
public class P206_ReverseLinkedList{
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
    public ListNode reverseList(ListNode head) {
        // while寫法
        ListNode node = null;
        while(head!=null){
            // 1. 備份後續連結
            ListNode next = head.next;
            // 2. 切離head
            head.next = node;
            // 3. 把head元素變成node的頭
            node = head;
            // 4. 置換head
            head = next;
        }
        return node;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
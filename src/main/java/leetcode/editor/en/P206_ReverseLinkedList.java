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
        // 遞迴研究
        // 要交換, 可以另外overload一個方法
        return reverseList(head,null);
    }

    public ListNode reverseList(ListNode head, ListNode exchanged) {
        // 4. 如果資料為空,表示交換結束
        if(head == null){
            return exchanged;
        }
        // 1. 切掉頭端
        ListNode next = head.next;
        // 2. head與新連結串接
        head.next = exchanged;
        // 3. 遞迴繼續進行交換
        return reverseList(next,head);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
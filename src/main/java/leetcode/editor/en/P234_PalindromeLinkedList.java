//Given the head of a singly linked list, return true if it is a palindrome or 
//false otherwise. 
//
// 
// Example 1: 
// 
// 
//Input: head = [1,2,2,1]
//Output: true
// 
//
// Example 2: 
// 
// 
//Input: head = [1,2]
//Output: false
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the list is in the range [1, 10⁵]. 
// 0 <= Node.val <= 9 
// 
//
// 
//Follow up: Could you do it in 
//O(n) time and 
//O(1) space?
//
// Related Topics Linked List Two Pointers Stack Recursion 👍 14222 👎 780
    
package leetcode.editor.en;

import leetcode.util.ListNode;

/**
 * id: 234
 * title: Palindrome Linked List
 * author: Ives.He 
 * date: 2023-06-18 00:28:13
 * for TEST copy:
 * import leetcode.editor.en.P234_PalindromeLinkedList .Solution;
 * P234_PalindromeLinkedList_Test
 */
public class P234_PalindromeLinkedList{
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
    public boolean isPalindrome(ListNode head) {
        ListNode l = copy(head);
        ListNode r = reverse(head);

        // 相互比較是否Palindrome
        while(l!=null && r!=null){
            if(l.val != r.val) return false;
            l = l.next;
            r = r.next;
        }
        return true;
    }

    // 複製一份
    private ListNode copy(ListNode head){
        ListNode tmp = null;
        ListNode node = null;
        while(head!=null){
            if(node==null) {
                node = new ListNode(head.val);
                tmp = node;
            }
            else {
                node.next = new ListNode(head.val);
                node = node.next;
            }
            head = head.next;
        }
        return tmp;
    }

    // 取得反轉的ListNode
    private ListNode reverse(ListNode head){
        ListNode node = null;
        while(head!=null){
            ListNode tmp = head.next;
            head.next = node;
            node = head;
            head = tmp;
        }
        return node;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
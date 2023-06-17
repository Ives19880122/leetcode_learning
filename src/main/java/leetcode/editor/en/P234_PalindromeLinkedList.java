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
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // 半段資料反轉
        ListNode n = reverse(slow);

        // 相互比較是否Palindrome
        while(head!=null && n!=null){
            if(head.val != n.val) return false;
            head = head.next;
            n = n.next;
        }
        return true;
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
//Given the head of a singly linked list, group all the nodes with odd indices 
//together followed by the nodes with even indices, and return the reordered list. 
//
//
// The first node is considered odd, and the second node is even, and so on. 
//
// Note that the relative order inside both the even and odd groups should 
//remain as it was in the input. 
//
// You must solve the problem in O(1) extra space complexity and O(n) time 
//complexity. 
//
// 
// Example 1: 
//
// 
//Input: head = [1,2,3,4,5]
//Output: [1,3,5,2,4]
// 
//
// Example 2: 
//
// 
//Input: head = [2,1,3,5,6,4,7]
//Output: [2,3,6,7,1,5,4]
// 
//
// 
// Constraints: 
//
// 
// n == number of nodes in the linked list 
// 0 <= n <= 10⁴ 
// -10⁶ <= Node.val <= 10⁶ 
// 
// Related Topics Linked List 👍 5141 👎 383
    
package leetcode.editor.en;

import leetcode.util.ListNode;

/**
 * id: 328
 * title: Odd Even Linked List
 * author: Ives.He 
 * date: 2022-04-07 23:53:39
 * for TEST copy:
 * import leetcode.editor.en.P328_OddEvenLinkedList .Solution;
 * P328_OddEvenLinkedList_Test
 */
public class P328_OddEvenLinkedList{
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
    public ListNode oddEvenList(ListNode head) {
        if(head==null) return null;
        ListNode odd = head;
        ListNode even = head.next;
        // 備份odd開頭,結尾
        ListNode lead = odd;
        ListNode tail = odd;
        // 備份even開頭
        ListNode mid = even;
        while(odd!=null || even != null){
            if(odd!=null){
                if(odd.next!=null){
                    odd.next = odd.next.next;
                }
                // 更新odd結尾現況
                tail = odd;
                odd = odd.next;
            }
            if(even!=null){
                if(even.next!=null){
                    even.next = even.next.next;
                }
                even = even.next;
            }
        }
        tail.next = mid;
        return lead;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
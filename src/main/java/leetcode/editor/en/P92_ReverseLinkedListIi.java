//Given the head of a singly linked list and two integers left and right where 
//left <= right, reverse the nodes of the list from position left to position 
//right, and return the reversed list. 
//
// 
// Example 1: 
//
// 
//Input: head = [1,2,3,4,5], left = 2, right = 4
//Output: [1,4,3,2,5]
// 
//
// Example 2: 
//
// 
//Input: head = [5], left = 1, right = 1
//Output: [5]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the list is n. 
// 1 <= n <= 500 
// -500 <= Node.val <= 500 
// 1 <= left <= right <= n 
// 
//
// 
//Follow up: Could you do it in one pass? Related Topics Linked List 👍 5782 👎 
//273
    
package leetcode.editor.en;

import leetcode.util.ListNode;

/**
 * id: 92
 * title: Reverse Linked List II
 * author: Ives.He 
 * date: 2022-03-19 08:08:27
 * for TEST copy:
 * import leetcode.editor.en.P92_ReverseLinkedListIi .Solution;
 * P92_ReverseLinkedListIi_Test
 */
public class P92_ReverseLinkedListIi{
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        ListNode nHead = dummy;
        ListNode tail = new ListNode(0);
        ListNode nMid = null;
        int pos = 1;
        while(pos<=right){
            ListNode tmp = head;
            head = head.next;
            // head與交換部位運算
            if(pos<left){
                nHead.next = tmp;
                nHead = nHead.next;
            }else{
                tmp.next = nMid;
                nMid = tmp;
            }
            // 記錄位置
            if(pos==left) tail = tmp;
            pos++;
        }
        nHead.next = nMid;
        tail.next = head;
        return dummy.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
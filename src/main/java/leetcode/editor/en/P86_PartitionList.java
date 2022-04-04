//Given the head of a linked list and a value x, partition it such that all 
//nodes less than x come before nodes greater than or equal to x. 
//
// You should preserve the original relative order of the nodes in each of the 
//two partitions. 
//
// 
// Example 1: 
//
// 
//Input: head = [1,4,3,2,5,2], x = 3
//Output: [1,2,2,4,3,5]
// 
//
// Example 2: 
//
// 
//Input: head = [2,1], x = 2
//Output: [1,2]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the list is in the range [0, 200]. 
// -100 <= Node.val <= 100 
// -200 <= x <= 200 
// 
// Related Topics Linked List Two Pointers 👍 3333 👎 469
    
package leetcode.editor.en;

import leetcode.util.ListNode;

/**
 * id: 86
 * title: Partition List
 * author: Ives.He 
 * date: 2022-04-04 12:16:54
 * for TEST copy:
 * import leetcode.editor.en.P86_PartitionList .Solution;
 * P86_PartitionList_Test
 */
public class P86_PartitionList{
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
    public ListNode partition(ListNode head, int x) {
        ListNode l = new ListNode(0);
        ListNode r = new ListNode(0);
        // 暫存頭部起始位置
        ListNode start = l;
        // 暫存尾部起始位置
        ListNode tmp = r;
        while(head != null){
            ListNode next = head.next;
            if(head.val < x){
                // 放到頭部
                l.next = head;
                l = l.next;
            }else{
                // 放到尾部
                r.next = head;
                r = r.next;
            }
            // 置換到下一個節點
            head = next;
        }
        // 最後收尾,頭尾相接
        l.next = tmp.next;
        r.next = null;
        return start.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
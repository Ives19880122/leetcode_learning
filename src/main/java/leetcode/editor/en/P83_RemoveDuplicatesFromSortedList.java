//Given the head of a sorted linked list, delete all duplicates such that each 
//element appears only once. Return the linked list sorted as well. 
//
// 
// Example 1: 
//
// 
//Input: head = [1,1,2]
//Output: [1,2]
// 
//
// Example 2: 
//
// 
//Input: head = [1,1,2,3,3]
//Output: [1,2,3]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the list is in the range [0, 300]. 
// -100 <= Node.val <= 100 
// The list is guaranteed to be sorted in ascending order. 
// 
// Related Topics Linked List 👍 3426 👎 162
    
package leetcode.editor.en;
/** 
 * id: 83
 * title: Remove Duplicates from Sorted List
 * author: Ives.He 
 * date: 2021-10-16 09:21:04
 * for TEST copy:
 * import leetcode.editor.en.P83_RemoveDuplicatesFromSortedList .Solution;
 * P83_RemoveDuplicatesFromSortedList_Test
 */
public class P83_RemoveDuplicatesFromSortedList{
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode tmp = head;
        // 設定邊界值,避免因為重複被最後一步剔除
        ListNode top = new ListNode(101);
        ListNode res = top;
        while(tmp!=null){
            if(res.val!=tmp.val) {
                res.next = new ListNode(tmp.val);
                res = res.next;
            }
            tmp = tmp.next;
        }
        return top.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
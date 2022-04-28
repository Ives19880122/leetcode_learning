//Given the head of a linked list, return the list after sorting it in 
//ascending order. 
//
// 
// Example 1: 
//
// 
//Input: head = [4,2,1,3]
//Output: [1,2,3,4]
// 
//
// Example 2: 
//
// 
//Input: head = [-1,5,3,4,0]
//Output: [-1,0,3,4,5]
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
// The number of nodes in the list is in the range [0, 5 * 10⁴]. 
// -10⁵ <= Node.val <= 10⁵ 
// 
//
// 
// Follow up: Can you sort the linked list in O(n logn) time and O(1) memory (i.
//e. constant space)? 
// Related Topics Linked List Two Pointers Divide and Conquer Sorting Merge 
//Sort 👍 7044 👎 230

package leetcode.editor.en;

import leetcode.util.ListNode;

import java.util.PriorityQueue;

/**
  * id：148
  * title：Sort List
  * author: Ives.He
  * date：2022-04-28 12:59:53
  * for TEST copy:
  * import leetcode.editor.en.P148_SortList .Solution;
  * P148_SortList_Test
  */
public class P148_SortList{
  
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
    public ListNode sortList(ListNode head) {
        PriorityQueue<Integer> que = new PriorityQueue<>();
        while(head!=null){
            que.add(head.val);
            head = head.next;
        }
        head = new ListNode(0);
        ListNode tmp = head;
        while(!que.isEmpty()){
            tmp.next = new ListNode(que.poll());
            tmp = tmp.next;
        }
        return head.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)


}
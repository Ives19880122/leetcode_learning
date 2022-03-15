//Merge two sorted linked lists and return it as a sorted list. The list should 
//be made by splicing together the nodes of the first two lists. 
//
// 
// Example 1: 
//
// 
//Input: l1 = [1,2,4], l2 = [1,3,4]
//Output: [1,1,2,3,4,4]
// 
//
// Example 2: 
//
// 
//Input: l1 = [], l2 = []
//Output: []
// 
//
// Example 3: 
//
// 
//Input: l1 = [], l2 = [0]
//Output: [0]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in both lists is in the range [0, 50]. 
// -100 <= Node.val <= 100 
// Both l1 and l2 are sorted in non-decreasing order. 
// 
// Related Topics Linked List Recursion 👍 8588 👎 873
    
package leetcode.editor.en;

import leetcode.util.ListNode;

/**
 * @author  Ives.He 
 * @date    2021-10-05 23:09:20 
 */
public class P21_MergeTwoSortedLists {
    public static void main(String[] args) {
        Solution solution = new P21_MergeTwoSortedLists().new Solution();
    }    
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode (0);
        ListNode tmp = head;
        while(l1!=null||l2!=null){
            int sum = 0;
            int length = 1;
            if(l1==null){
                sum = l2.val;
                l2 = l2.next;
            } else if(l2==null){
                sum = l1.val;
                l1 = l1.next;
            } else{
                int v1 = l1.val;
                int v2 = l2.val;
                if(v1>v2) {
                    sum = v2;
                    l2 = l2.next;
                }else if(v1<v2){
                    sum = v1;
                    l1 = l1.next;
                }else{
                    sum = v1;
                    length = 2;
                    l1 = l1.next;
                    l2 = l2.next;
                }
            }
            int step = 0;
            while(step < length){
                step ++;
                tmp.next = new ListNode(sum);
                tmp = tmp.next;
            }
        }
        return head.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
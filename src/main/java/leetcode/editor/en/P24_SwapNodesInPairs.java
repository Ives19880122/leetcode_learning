//Given a linked list, swap every two adjacent nodes and return its head. You 
//must solve the problem without modifying the values in the list's nodes (i.e., 
//only nodes themselves may be changed.) 
//
// 
// Example 1: 
//
// 
//Input: head = [1,2,3,4]
//Output: [2,1,4,3]
// 
//
// Example 2: 
//
// 
//Input: head = []
//Output: []
// 
//
// Example 3: 
//
// 
//Input: head = [1]
//Output: [1]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the list is in the range [0, 100]. 
// 0 <= Node.val <= 100 
// 
// Related Topics Linked List Recursion 👍 4816 👎 252
    
package leetcode.editor.en;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * id: 24
 * title: Swap Nodes in Pairs
 * author: Ives.He 
 * date: 2021-10-30 21:43:09
 * for TEST copy:
 * import leetcode.editor.en.P24_SwapNodesInPairs.Solution;
 * P24_SwapNodesInPairs_Test
 */
public class P24_SwapNodesInPairs{
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
    int tmp;
    public ListNode swapPairs(ListNode head) {
        return helper(head,0);
    }
    ListNode helper(ListNode node, int i){
        if(node==null){
            return null;
        }else if(node.next==null){
            if(i%2==1) {
                node.val = tmp;
            }
            return node;
        }else{
            if(i%2==0){
                tmp=node.val;
                node.val=node.next.val;
            }
            if(i%2==1){
                node.val=tmp;
            }
            node.next = helper(node.next,i+1);
            return node;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
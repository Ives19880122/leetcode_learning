//Given the head of a linked list, remove the nᵗʰ node from the end of the list 
//and return its head. 
//
// 
// Example 1: 
//
// 
//Input: head = [1,2,3,4,5], n = 2
//Output: [1,2,3,5]
// 
//
// Example 2: 
//
// 
//Input: head = [1], n = 1
//Output: []
// 
//
// Example 3: 
//
// 
//Input: head = [1,2], n = 1
//Output: [1]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the list is sz. 
// 1 <= sz <= 30 
// 0 <= Node.val <= 100 
// 1 <= n <= sz 
// 
//
// 
// Follow up: Could you do this in one pass? 
// Related Topics Linked List Two Pointers 👍 9185 👎 435
    
package leetcode.editor.en;

import leetcode.util.ListNode;

import java.util.Stack;

/**
 * id: 19
 * title: Remove Nth Node From End of List
 * author: Ives.He 
 * date: 2022-03-15 22:26:08
 * for TEST copy:
 * import leetcode.editor.en.P19_RemoveNthNodeFromEndOfList .Solution;
 * P19_RemoveNthNodeFromEndOfList_Test
 */
public class P19_RemoveNthNodeFromEndOfList{
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // 題目: 移除倒數第n個node
        // 1.遍歷取得所有資料
        // 2.找到倒數n個節點
        // 3.移除
        // 倒數第n個表示ListNode最大長度為n
        // size-n = 0 , size-n = 1 , size-n = 2
        Stack<Integer> stack = new Stack();
        ListNode tmp = head;
        while(tmp!=null){
            stack.push(tmp.val);
            tmp = tmp.next;
        }
        Stack<Integer> stack2 = new Stack();
        int pick = 0;
        // 移除節點
        while (!stack.isEmpty()){
            pick++;
            int d = stack.pop();
            if(pick!=n) stack2.add(d);
        }
        // 重整
        if(stack2.isEmpty()){
            return null;
        }else{
            ListNode node = new ListNode();
            ListNode tm = node;
            while (!stack2.isEmpty()){
                tm.val = stack2.pop();
                if(!stack2.isEmpty()){
                    tm.next = new ListNode();
                    tm = tm.next;
                }
            }
            return node;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
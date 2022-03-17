//Write a function to delete a node in a singly-linked list. You will not be 
//given access to the head of the list, instead you will be given access to the node 
//to be deleted directly. 
//
// It is guaranteed that the node to be deleted is not a tail node in the list. 
//
//
// 
// Example 1: 
//
// 
//Input: head = [4,5,1,9], node = 5
//Output: [4,1,9]
//Explanation: You are given the second node with value 5, the linked list 
//should become 4 -> 1 -> 9 after calling your function.
// 
//
// Example 2: 
//
// 
//Input: head = [4,5,1,9], node = 1
//Output: [4,5,9]
//Explanation: You are given the third node with value 1, the linked list 
//should become 4 -> 5 -> 9 after calling your function.
// 
//
// 
// Constraints: 
//
// 
// The number of the nodes in the given list is in the range [2, 1000]. 
// -1000 <= Node.val <= 1000 
// The value of each node in the list is unique. 
// The node to be deleted is in the list and is not a tail node 
// 
// Related Topics Linked List 👍 4109 👎 11314

package leetcode.editor.en;

import leetcode.util.ListNode;

/**
  * id：237
  * title：Delete Node in a Linked List
  * author: Ives.He
  * date：2022-03-17 12:30:48
  * for TEST copy:
  * import leetcode.editor.en.P237_DeleteNodeInALinkedList .Solution;
  * P237_DeleteNodeInALinkedList_Test
  */
public class P237_DeleteNodeInALinkedList{
  
  //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // 1. 值不重複
        // 2. 不會在尾部節點
        // 3. 至少兩個node
        // 4. 已經是找到index位置,要進行刪除操作(移除參考引用
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
//leetcode submit region end(Prohibit modification and deletion)


}
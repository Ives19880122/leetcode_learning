//Given a binary tree 
//
// 
//struct Node {
//  int val;
//  Node *left;
//  Node *right;
//  Node *next;
//}
// 
//
// Populate each next pointer to point to its next right node. If there is no 
//next right node, the next pointer should be set to NULL. 
//
// Initially, all next pointers are set to NULL. 
//
// 
// Example 1: 
//
// 
//Input: root = [1,2,3,4,5,null,7]
//Output: [1,#,2,3,#,4,5,7,#]
//Explanation: Given the above binary tree (Figure A), your function should 
//populate each next pointer to point to its next right node, just like in Figure B. 
//The serialized output is in level order as connected by the next pointers, with 
//'#' signifying the end of each level.
// 
//
// Example 2: 
//
// 
//Input: root = []
//Output: []
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [0, 6000]. 
// -100 <= Node.val <= 100 
// 
//
// 
// Follow-up: 
//
// 
// You may only use constant extra space. 
// The recursive approach is fine. You may assume implicit stack space does not 
//count as extra space for this problem. 
// 
// Related Topics Tree Depth-First Search Breadth-First Search Binary Tree 👍 29
//71 👎 216
    
package leetcode.editor.en;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 * id: 117
 * title: Populating Next Right Pointers in Each Node II
 * author: Ives.He 
 * date: 2021-10-24 13:31:57
 * for TEST copy:
 * import leetcode.editor.en.P117_PopulatingNextRightPointersInEachNodeIi .Solution;
 * P117_PopulatingNextRightPointersInEachNodeIi_Test
 */
public class P117_PopulatingNextRightPointersInEachNodeIi{
    //leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    Map<Integer, LinkedList<Node>> map = new HashMap<>();
    public Node connect(Node root) {
        if(root!=null){
            connect(root,1);
        }
        return root;
    }
    void connect(Node node,int level){
        if(node!=null){
            LinkedList<Node> list = map.computeIfAbsent(level,k-> new LinkedList<>());
            if(!list.isEmpty()) list.poll().next = node;
            list.offer(node);
            connect(node.left,level+1);
            connect(node.right,level+1);
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
//You are given a perfect binary tree where all leaves are on the same level, 
//and every parent has two children. The binary tree has the following definition: 
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
//Input: root = [1,2,3,4,5,6,7]
//Output: [1,#,2,3,#,4,5,6,7,#]
//Explanation: Given the above perfect binary tree (Figure A), your function 
//should populate each next pointer to point to its next right node, just like in 
//Figure B. The serialized output is in level order as connected by the next 
//pointers, with '#' signifying the end of each level.
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
// The number of nodes in the tree is in the range [0, 2¹² - 1]. 
// -1000 <= Node.val <= 1000 
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
// Related Topics Tree Depth-First Search Breadth-First Search Binary Tree 👍 45
//87 👎 200
    
package leetcode.editor.en;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * id: 116
 * title: Populating Next Right Pointers in Each Node
 * author: Ives.He 
 * date: 2021-10-24 11:40:43
 * for TEST copy:
 * import leetcode.editor.en.P116_PopulatingNextRightPointersInEachNode.Solution;
 * P116_PopulatingNextRightPointersInEachNode_Test
 */
public class P116_PopulatingNextRightPointersInEachNode{
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
    HashMap<Integer, LinkedList<Node>> map = new HashMap<>();
    public Node connect(Node root) {
        if(root!=null){
            levelTravel(root,1);
            connect(root,1);
        }
        return root;
    }

    /**
     * 用於連接節點
     * @param node
     * @param level
     */
    void connect(Node node,int level){
        if(node!=null){
            map.get(level).poll();
            node.next = map.get(level).peek();
            connect(node.left,level+1);
            connect(node.right,level+1);
        }
    }

    /**
     * 先走過一遍紀錄每層節點關係
     * @param node
     * @param level
     */
    void levelTravel(Node node,int level){
        if(node != null){
            if(map.get(level)==null){
                map.put(level,new LinkedList<>());
            }
            map.get(level).offer(node);
            levelTravel(node.left,level+1);
            levelTravel(node.right,level+1);
        }
    }

}
//leetcode submit region end(Prohibit modification and deletion)

}
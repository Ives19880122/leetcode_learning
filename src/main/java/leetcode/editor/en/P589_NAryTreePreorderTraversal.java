//Given the root of an n-ary tree, return the preorder traversal of its nodes' 
//values. 
//
// Nary-Tree input serialization is represented in their level order traversal. 
//Each group of children is separated by the null value (See examples) 
//
// 
// Example 1: 
//
// 
//
// 
//Input: root = [1,null,3,2,4,null,5,6]
//Output: [1,3,5,6,2,4]
// 
//
// Example 2: 
//
// 
//
// 
//Input: root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,
//null,12,null,13,null,null,14]
//Output: [1,2,3,6,7,11,14,4,8,12,5,9,13,10]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [0, 10⁴]. 
// 0 <= Node.val <= 10⁴ 
// The height of the n-ary tree is less than or equal to 1000. 
// 
//
// 
// Follow up: Recursive solution is trivial, could you do it iteratively? 
//
// Related Topics Stack Tree Depth-First Search 👍 2320 👎 107
    
package leetcode.editor.en;

import java.util.ArrayList;
import java.util.List;

/**
 * id: 589
 * title: N-ary Tree Preorder Traversal
 * author: Ives.He 
 * date: 2022-09-24 10:53:25
 * for TEST copy:
 * import leetcode.editor.en.P589_NAryTreePreorderTraversal .Solution;
 * P589_NAryTreePreorderTraversal_Test
 */
public class P589_NAryTreePreorderTraversal{
    //leetcode submit region begin(Prohibit modification and deletion)
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        helper(root,result);
        return result;
    }
    private void helper(Node node, List<Integer>list){
        if(node==null) return;
        list.add(node.val);
        for(Node child : node.children){
            helper(child,list);
        }
    }

}
//leetcode submit region end(Prohibit modification and deletion)

    private class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

}
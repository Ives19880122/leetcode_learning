//Given an n-ary tree, return the level order traversal of its nodes' values. 
//
// Nary-Tree input serialization is represented in their level order traversal, 
//each group of children is separated by the null value (See examples). 
//
// 
// Example 1: 
//
// 
//
// 
//Input: root = [1,null,3,2,4,null,5,6]
//Output: [[1],[3,2,4],[5,6]]
// 
//
// Example 2: 
//
// 
//
// 
//Input: root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,
//null,12,null,13,null,null,14]
//Output: [[1],[2,3,4,5],[6,7,8,9,10],[11,12,13],[14]]
// 
//
// 
// Constraints: 
//
// 
// The height of the n-ary tree is less than or equal to 1000 
// The total number of nodes is between [0, 10⁴] 
// 
//
// Related Topics Tree Breadth-First Search 👍 3382 👎 128
    
package leetcode.editor.en;

import java.util.ArrayList;
import java.util.List;

/**
 * id: 429
 * title: N-ary Tree Level Order Traversal
 * author: Ives.He 
 * date: 2023-06-01 00:30:10
 * for TEST copy:
 * import leetcode.editor.en.P429_NAryTreeLevelOrderTraversal .Solution;
 * P429_NAryTreeLevelOrderTraversal_Test
 */
public class P429_NAryTreeLevelOrderTraversal{
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
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        helper(root,0,result);
        return result;
    }

    public void helper(Node node, int level, List<List<Integer>> list){
        if(node == null) return;
        if(list.size()==level) list.add(new ArrayList<>());
        list.get(level).add(node.val);
        for(Node child : node.children){
            helper(child,level+1,list);
        }
    }
}
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
}
//leetcode submit region end(Prohibit modification and deletion)

}
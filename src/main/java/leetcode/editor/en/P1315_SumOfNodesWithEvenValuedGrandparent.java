//Given the root of a binary tree, return the sum of values of nodes with an 
//even-valued grandparent. If there are no nodes with an even-valued grandparent, 
//return 0. 
//
// A grandparent of a node is the parent of its parent if it exists. 
//
// 
// Example 1: 
// 
// 
//Input: root = [6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]
//Output: 18
//Explanation: The red nodes are the nodes with even-value grandparent while 
//the blue nodes are the even-value grandparents.
// 
//
// Example 2: 
// 
// 
//Input: root = [1]
//Output: 0
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [1, 10⁴]. 
// 1 <= Node.val <= 100 
// 
//
// Related Topics Tree Depth-First Search Breadth-First Search Binary Tree 👍 24
//46 👎 71
    
package leetcode.editor.en;

import leetcode.util.TreeNode;

/**
 * id: 1315
 * title: Sum of Nodes with Even-Valued Grandparent
 * author: Ives.He 
 * date: 2023-06-01 01:50:14
 * for TEST copy:
 * import leetcode.editor.en.P1315_SumOfNodesWithEvenValuedGrandparent .Solution;
 * P1315_SumOfNodesWithEvenValuedGrandparent_Test
 */
public class P1315_SumOfNodesWithEvenValuedGrandparent{
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int result = 0;
    public int sumEvenGrandparent(TreeNode root) {
        helper(root);
        return result;
    }
    /**
     * traversal
     */
    public void helper(TreeNode node){
        if(node == null) return;
        if(node.val%2==0){
            add(node,2);
        }
        helper(node.left);
        helper(node.right);
    }
    /**
     * add when find even grandparent
     */
    public void add(TreeNode node,int target){
        if(node == null) return;
        if(target == 0) this.result += node.val;
        add(node.left,target-1);
        add(node.right,target-1);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
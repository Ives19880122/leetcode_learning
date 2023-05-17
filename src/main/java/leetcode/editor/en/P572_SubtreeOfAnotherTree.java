//Given the roots of two binary trees root and subRoot, return true if there is 
//a subtree of root with the same structure and node values of subRoot and false 
//otherwise. 
//
// A subtree of a binary tree tree is a tree that consists of a node in tree 
//and all of this node's descendants. The tree tree could also be considered as a 
//subtree of itself. 
//
// 
// Example 1: 
// 
// 
//Input: root = [3,4,5,1,2], subRoot = [4,1,2]
//Output: true
// 
//
// Example 2: 
// 
// 
//Input: root = [3,4,5,1,2,null,null,null,null,0], subRoot = [4,1,2]
//Output: false
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the root tree is in the range [1, 2000]. 
// The number of nodes in the subRoot tree is in the range [1, 1000]. 
// -10⁴ <= root.val <= 10⁴ 
// -10⁴ <= subRoot.val <= 10⁴ 
// 
//
// Related Topics Tree Depth-First Search String Matching Binary Tree Hash 
//Function 👍 7126 👎 408
    
package leetcode.editor.en;

import leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * id: 572
 * title: Subtree of Another Tree
 * author: Ives.He 
 * date: 2023-05-18 00:30:44
 * for TEST copy:
 * import leetcode.editor.en.P572_SubtreeOfAnotherTree .Solution;
 * P572_SubtreeOfAnotherTree_Test
 */
public class P572_SubtreeOfAnotherTree{
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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        List<TreeNode> capture = new ArrayList<>();
        // TODO findSubNode
        findSubNode(root,subRoot.val,capture);
        if(capture.isEmpty()) return false;
        // TODO isSameTree
        for(TreeNode node: capture){
            if(isSameTree(node,subRoot)) return true;
        }
        return false;
    }

    private void findSubNode(TreeNode node, int target, List<TreeNode> capture){
        if(node == null) return;
        if(node.val==target) capture.add(node);
        findSubNode(node.left,target,capture);
        findSubNode(node.right,target,capture);
    }

    private boolean isSameTree(TreeNode root, TreeNode subRoot){
        if(root==null && subRoot==null) return true;
        if(!(root!=null && subRoot!=null)) return false;
        return root.val == subRoot.val &&
                isSameTree(root.left,subRoot.left) &&
                isSameTree(root.right,subRoot.right);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
//Given two binary trees original and cloned and given a reference to a node 
//target in the original tree. 
//
// The cloned tree is a copy of the original tree. 
//
// Return a reference to the same node in the cloned tree. 
//
// Note that you are not allowed to change any of the two trees or the target 
//node and the answer must be a reference to a node in the cloned tree. 
//
// 
// Example 1: 
// 
// 
//Input: tree = [7,4,3,null,null,6,19], target = 3
//Output: 3
//Explanation: In all examples the original and cloned trees are shown. The 
//target node is a green node from the original tree. The answer is the yellow node 
//from the cloned tree.
// 
//
// Example 2: 
// 
// 
//Input: tree = [7], target =  7
//Output: 7
// 
//
// Example 3: 
// 
// 
//Input: tree = [8,null,6,null,5,null,4,null,3,null,2,null,1], target = 4
//Output: 4
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [1, 10⁴]. 
// The values of the nodes of the tree are unique. 
// target node is a node from the original tree and is not null. 
// 
//
// 
// Follow up: Could you solve the problem if repeated values on the tree are 
//allowed? 
//
// Related Topics Tree Depth-First Search Breadth-First Search Binary Tree 👍 15
//40 👎 1852
    
package leetcode.editor.en;

import leetcode.util.TreeNode;

/**
 * id: 1379
 * title: Find a Corresponding Node of a Binary Tree in a Clone of That Tree
 * author: Ives.He 
 * date: 2023-05-17 20:46:20
 * for TEST copy:
 * import leetcode.editor.en.P1379_FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree .Solution;
 * P1379_FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree_Test
 */
public class P1379_FindACorrespondingNodeOfABinaryTreeInACloneOfThatTree{
    //leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {

    private TreeNode result = null;

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        helper(original,cloned,target);
        return result;
    }

    private void helper(TreeNode original, TreeNode cloned, TreeNode target){
        if(original == null || result != null) return;
        if(original == target){
            this.result = cloned;
            return;
        }
        helper(original.left,cloned.left,target);
        helper(original.right,cloned.right,target);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
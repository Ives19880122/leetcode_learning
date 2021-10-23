//Given two integer arrays preorder and inorder where preorder is the preorder 
//traversal of a binary tree and inorder is the inorder traversal of the same tree,
// construct and return the binary tree. 
//
// 
// Example 1: 
//
// 
//Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
//Output: [3,9,20,null,null,15,7]
// 
//
// Example 2: 
//
// 
//Input: preorder = [-1], inorder = [-1]
//Output: [-1]
// 
//
// 
// Constraints: 
//
// 
// 1 <= preorder.length <= 3000 
// inorder.length == preorder.length 
// -3000 <= preorder[i], inorder[i] <= 3000 
// preorder and inorder consist of unique values. 
// Each value of inorder also appears in preorder. 
// preorder is guaranteed to be the preorder traversal of the tree. 
// inorder is guaranteed to be the inorder traversal of the tree. 
// 
// Related Topics Array Hash Table Divide and Conquer Tree Binary Tree 👍 6723 ?
//? 170
    
package leetcode.editor.en;

import java.util.*;

/**
 * id: 105
 * title: Construct Binary Tree from Preorder and Inorder Traversal
 * author: Ives.He 
 * date: 2021-10-23 15:06:28
 * for TEST copy:
 * import leetcode.editor.en.P105_ConstructBinaryTreeFromPreorderAndInorderTraversal .Solution;
 * P105_ConstructBinaryTreeFromPreorderAndInorderTraversal_Test
 */
public class P105_ConstructBinaryTreeFromPreorderAndInorderTraversal{
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
    Map<Integer,Integer> map = new HashMap<>();
    int n = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int len = inorder.length;
        for(int i=0; i<len;i++){
            map.put(inorder[i],i);
        }
        return helper(preorder,0,len-1);
    }
    TreeNode helper(int[] preorder, int start, int end){
        if(start>end){
            return null;
        }
        int val = preorder[n++];
        int idx = map.get(val);
        TreeNode node = new TreeNode(val);
        if(start!=end){
            //left
            node.left = helper(preorder,start,idx-1);
            //right
            node.right = helper(preorder,idx+1,end);
        }
        return node;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
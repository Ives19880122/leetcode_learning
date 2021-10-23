//Given two integer arrays inorder and postorder where inorder is the inorder 
//traversal of a binary tree and postorder is the postorder traversal of the same 
//tree, construct and return the binary tree. 
//
// 
// Example 1: 
//
// 
//Input: inorder = [9,3,15,20,7], postorder = [9,15,7,20,3]
//Output: [3,9,20,null,null,15,7]
// 
//
// Example 2: 
//
// 
//Input: inorder = [-1], postorder = [-1]
//Output: [-1]
// 
//
// 
// Constraints: 
//
// 
// 1 <= inorder.length <= 3000 
// postorder.length == inorder.length 
// -3000 <= inorder[i], postorder[i] <= 3000 
// inorder and postorder consist of unique values. 
// Each value of postorder also appears in inorder. 
// inorder is guaranteed to be the inorder traversal of the tree. 
// postorder is guaranteed to be the postorder traversal of the tree. 
// 
// Related Topics Array Hash Table Divide and Conquer Tree Binary Tree 👍 3352 ?
//? 56
    
package leetcode.editor.en;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * id: 106
 * title: Construct Binary Tree from Inorder and Postorder Traversal
 * author: Ives.He 
 * date: 2021-10-23 11:56:48
 * for TEST copy:
 * import leetcode.editor.en.P106_ConstructBinaryTreeFromInorderAndPostorderTraversal .Solution;
 * P106_ConstructBinaryTreeFromInorderAndPostorderTraversal_Test
 */
public class P106_ConstructBinaryTreeFromInorderAndPostorderTraversal{
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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        // 轉換資料格式
        for(int i=0; i<inorder.length; i++){
            stack.push(postorder[i]);
            list.add(inorder[i]);
        }
        return helper(list,stack);
    }
    TreeNode helper(List<Integer> list, Stack<Integer> stack){
        int root = stack.pop();
        int idx = list.indexOf(root);
        // 右樹區域
        List<Integer> r = new ArrayList<>();
        for(int i=idx+1; i<list.size(); i++){
            r.add(list.get(i));
        }
        TreeNode right = r.size()>0 ? helper(r,stack) : null;
        // 左樹區域
        List<Integer> l = new ArrayList<>();
        for(int i=0; i<idx; i++){
            l.add(list.get(i));
        }
        TreeNode left = l.size()>0 ? helper(l,stack) : null;
        return new TreeNode(root, left ,right);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
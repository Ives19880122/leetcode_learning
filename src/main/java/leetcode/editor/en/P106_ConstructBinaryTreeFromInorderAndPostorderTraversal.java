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

import leetcode.util.TreeNode;

import java.util.*;

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
    Map<Integer,Integer> map = new HashMap<>();
    int n;
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int len = inorder.length;
        // 建立索引資料
        for(int i=0; i<len; i++){
            map.put(inorder[i],i);
        }
        n = len-1;
        return helper(inorder,postorder,0,len-1);
    }
    TreeNode helper(int[]inorder,int[]postorder,int start, int end){
        if(start>end){
            return null;
        }
        int val = postorder[n--];
        TreeNode root = new TreeNode(val);
        // 表示還有子節點
        if(start!=end){
            int idx = map.get(val);
            // 右樹區域
            root.right = helper(inorder, postorder,idx+1,end);
            // 左樹區域
            root.left = helper(inorder, postorder,start,idx-1);
        }
        return root;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
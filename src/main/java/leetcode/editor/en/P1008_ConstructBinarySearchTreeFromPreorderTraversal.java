//Given an array of integers preorder, which represents the preorder traversal 
//of a BST (i.e., binary search tree), construct the tree and return its root. 
//
// It is guaranteed that there is always possible to find a binary search tree 
//with the given requirements for the given test cases. 
//
// A binary search tree is a binary tree where for every node, any descendant 
//of Node.left has a value strictly less than Node.val, and any descendant of Node.
//right has a value strictly greater than Node.val. 
//
// A preorder traversal of a binary tree displays the value of the node first, 
//then traverses Node.left, then traverses Node.right. 
//
// 
// Example 1: 
// 
// 
//Input: preorder = [8,5,1,7,10,12]
//Output: [8,5,10,1,7,null,12]
// 
//
// Example 2: 
//
// 
//Input: preorder = [1,3]
//Output: [1,null,3]
// 
//
// 
// Constraints: 
//
// 
// 1 <= preorder.length <= 100 
// 1 <= preorder[i] <= 1000 
// All the values of preorder are unique. 
// 
//
// Related Topics Array Stack Tree Binary Search Tree Monotonic Stack Binary 
//Tree 👍 5248 👎 69
    
package leetcode.editor.en;

import leetcode.util.TreeNode;

import java.util.Arrays;

/**
 * id: 1008
 * title: Construct Binary Search Tree from Preorder Traversal
 * author: Ives.He 
 * date: 2023-06-03 23:20:19
 * for TEST copy:
 * import leetcode.editor.en.P1008_ConstructBinarySearchTreeFromPreorderTraversal .Solution;
 * P1008_ConstructBinarySearchTreeFromPreorderTraversal_Test
 */
public class P1008_ConstructBinarySearchTreeFromPreorderTraversal{
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
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder==null || preorder.length ==0) return null;
        int idx = 0;
        int root = preorder[0];
        for(int p : preorder){
            if(p>root) break;
            idx++;
        }
        TreeNode node = new TreeNode(root);
        node.left = bstFromPreorder(getSubArr(preorder,1,idx));
        node.right = bstFromPreorder(getSubArr(preorder,idx,preorder.length));
        return node;
    }
    /**
     * end not include
     */
    private int[] getSubArr(int [] arr, int start, int end){
        return Arrays.copyOfRange(arr,start,end);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
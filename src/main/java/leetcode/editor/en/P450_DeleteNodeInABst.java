//Given a root node reference of a BST and a key, delete the node with the 
//given key in the BST. Return the root node reference (possibly updated) of the BST. 
//
// Basically, the deletion can be divided into two stages: 
//
// 
// Search for a node to remove. 
// If the node is found, delete the node. 
// 
//
// 
// Example 1: 
//
// 
//Input: root = [5,3,6,2,4,null,7], key = 3
//Output: [5,4,6,2,null,null,7]
//Explanation: Given key to delete is 3. So we find the node with value 3 and 
//delete it.
//One valid answer is [5,4,6,2,null,null,7], shown in the above BST.
//Please notice that another valid answer is [5,2,6,null,4,null,7] and it's 
//also accepted.
//
// 
//
// Example 2: 
//
// 
//Input: root = [5,3,6,2,4,null,7], key = 0
//Output: [5,3,6,2,4,null,7]
//Explanation: The tree does not contain a node with value = 0.
// 
//
// Example 3: 
//
// 
//Input: root = [], key = 0
//Output: []
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [0, 10⁴]. 
// -10⁵ <= Node.val <= 10⁵ 
// Each node has a unique value. 
// root is a valid binary search tree. 
// -10⁵ <= key <= 10⁵ 
// 
//
// 
// Follow up: Could you solve it with time complexity O(height of tree)? 
// Related Topics Tree Binary Search Tree Binary Tree 👍 3874 👎 127
    
package leetcode.editor.en;

import leetcode.util.TreeNode;

/**
 * id: 450
 * title: Delete Node in a BST
 * author: Ives.He 
 * date: 2021-10-27 23:06:23
 * for TEST copy:
 * import leetcode.editor.en.P450_DeleteNodeInABst .Solution;
 * P450_DeleteNodeInABst_Test
 */
public class P450_DeleteNodeInABst{
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
    int tmp;
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root!=null){
            // 往左樹遞迴搜尋
            if(root.val>key)root.left = deleteNode(root.left,key);
            // 往右樹遞迴搜尋
            if(root.val<key)root.right = deleteNode(root.right,key);
            if(root.val==key) {
                if (root.left == null && root.right == null) {
                    // 節點清空
                    return null;
                } else if (root.right == null){
                    // 節點遞補
                    return root.left;
                }else if(root.left==null) {
                    // 節點遞補
                    return root.right;
                }else{
                    // 取得右樹最小值
                    miniValue(root.right);
                    // 取代被刪除的值
                    root.val = tmp;
                    // 移除右樹最小值
                    root.right = deleteNode(root.right,tmp);
                    return root;
                }
            }
        }
        return root;
    }
    void miniValue(TreeNode node){
        while(node!=null){
            tmp = node.val;
            node = node.left;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
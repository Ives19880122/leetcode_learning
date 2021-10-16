//Given the root of a binary tree, return the inorder traversal of its nodes' 
//values. 
//
// 
// Example 1: 
//
// 
//Input: root = [1,null,2,3]
//Output: [1,3,2]
// 
//
// Example 2: 
//
// 
//Input: root = []
//Output: []
// 
//
// Example 3: 
//
// 
//Input: root = [1]
//Output: [1]
// 
//
// Example 4: 
//
// 
//Input: root = [1,2]
//Output: [2,1]
// 
//
// Example 5: 
//
// 
//Input: root = [1,null,2]
//Output: [1,2]
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [0, 100]. 
// -100 <= Node.val <= 100 
// 
//
// 
//Follow up: Recursive solution is trivial, could you do it iteratively? 
//Related Topics Stack Tree Depth-First Search Binary Tree 👍 5933 👎 250
    
package leetcode.editor.en;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * id: 94
 * title: Binary Tree Inorder Traversal
 * author: Ives.He 
 * date: 2021-10-16 14:04:13
 * for TEST copy:
 * import leetcode.editor.en.P94_BinaryTreeInorderTraversal .Solution;
 * P94_BinaryTreeInorderTraversal_Test
 */
public class P94_BinaryTreeInorderTraversal{
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
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> top = new Stack<>();
        TreeNode tmp = root;
        List<Integer> res = new ArrayList<>();
        while(tmp != null || !top.isEmpty()){
            // 最下面節點想跳回根目錄時
            if(tmp == null && !top.isEmpty()){
                tmp = top.pop();    // 取出暫存
                res.add(tmp.val);   // 塞入根節點
                tmp = tmp.right;    // 轉移至右節點
            // 左邊節點存在則一路往下衝
            }else if(tmp.left!=null){
                top.push(tmp);      // 儲存暫存
                tmp = tmp.left;     // 轉移至左節點
            // 右邊節點存在,塞入中間值,轉移至右邊節點
            }else if(tmp.right != null){
                res.add(tmp.val);   // 加入目前的值
                tmp = tmp.right;    // 轉移至右節點
            }else if(tmp.right == null){
                res.add(tmp.val);   // 加入目前的值
                tmp = null;         // 觸發返回上一層
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
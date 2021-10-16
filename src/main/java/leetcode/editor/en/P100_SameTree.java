//Given the roots of two binary trees p and q, write a function to check if 
//they are the same or not. 
//
// Two binary trees are considered the same if they are structurally identical, 
//and the nodes have the same value. 
//
// 
// Example 1: 
//
// 
//Input: p = [1,2,3], q = [1,2,3]
//Output: true
// 
//
// Example 2: 
//
// 
//Input: p = [1,2], q = [1,null,2]
//Output: false
// 
//
// Example 3: 
//
// 
//Input: p = [1,2,1], q = [1,1,2]
//Output: false
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in both trees is in the range [0, 100]. 
// -10⁴ <= Node.val <= 10⁴ 
// 
// Related Topics Tree Depth-First Search Breadth-First Search Binary Tree 👍 41
//76 👎 106
    
package leetcode.editor.en;

import java.util.Stack;

/**
 * id: 100
 * title: Same Tree
 * author: Ives.He 
 * date: 2021-10-16 21:21:12
 * for TEST copy:
 * import leetcode.editor.en.P100_SameTree .Solution;
 * P100_SameTree_Test
 */
public class P100_SameTree{
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        TreeNode l = p;
        Stack<TreeNode> tml = new Stack<>();
        TreeNode r = q;
        Stack<TreeNode> tmr = new Stack<>();
        while(l!=null||r!=null||!tml.empty()||!tmr.isEmpty()){
            if((l==null&&r!=null)||(l!=null&&r==null)||tmr.size()!=tml.size()){
                // 其中之一為空時
                return false;
            }else if(l==null&&r==null&&!tml.empty()&&!tmr.empty()){
                l=tml.pop();
                r=tmr.pop();
            }else if(l.val == r.val){
                tml.push(l.right);
                l = l.left;
                tmr.push(r.right);
                r = r.left;
            }else{
                return false;
            }
        }
        // 若雙方資料為空時
        return true;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
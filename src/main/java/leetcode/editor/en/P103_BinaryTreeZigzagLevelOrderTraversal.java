//Given the root of a binary tree, return the zigzag level order traversal of 
//its nodes' values. (i.e., from left to right, then right to left for the next 
//level and alternate between). 
//
// 
// Example 1: 
// 
// 
//Input: root = [3,9,20,null,null,15,7]
//Output: [[3],[20,9],[15,7]]
// 
//
// Example 2: 
//
// 
//Input: root = [1]
//Output: [[1]]
// 
//
// Example 3: 
//
// 
//Input: root = []
//Output: []
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [0, 2000]. 
// -100 <= Node.val <= 100 
// 
//
// Related Topics Tree Breadth-First Search Binary Tree 👍 9272 👎 243
    
package leetcode.editor.en;

import leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * id: 103
 * title: Binary Tree Zigzag Level Order Traversal
 * author: Ives.He 
 * date: 2023-05-31 21:49:26
 * for TEST copy:
 * import leetcode.editor.en.P103_BinaryTreeZigzagLevelOrderTraversal .Solution;
 * P103_BinaryTreeZigzagLevelOrderTraversal_Test
 */
public class P103_BinaryTreeZigzagLevelOrderTraversal{
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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        helper(root,0,result);
        for(int i = 0; i<result.size(); i++){
            reverse(i,result.get(i));
        }
        return result;
    }

    /**
     * 逐層取得node
     * @param node
     * @param level
     * @param list
     */
    public void helper(TreeNode node, int level, List<List<Integer>> list){
        if(node==null) return;
        if(list.size()==level) list.add(new ArrayList<>());
        int next = level + 1;
        list.get(level).add(node.val);
        helper(node.left,next,list);
        helper(node.right,next,list);
    }

    /**
     * 重排單數層
     * left -> right 轉換 right -> left
     * @param level
     * @param data
     */
    public void reverse(int level, List<Integer> data){
        if(level%2==0) return;
        int l = 0;
        int r = data.size()-1;
        while(l<r){
            int tmp = data.get(l);
            data.set(l,data.get(r));
            data.set(r,tmp);
            l++;
            r--;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
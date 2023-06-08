//Given the root of a binary tree, the value of a target node target, and an 
//integer k, return an array of the values of all nodes that have a distance k from 
//the target node. 
//
// You can return the answer in any order. 
//
// 
// Example 1: 
// 
// 
//Input: root = [3,5,1,6,2,0,8,null,null,7,4], target = 5, k = 2
//Output: [7,4,1]
//Explanation: The nodes that are a distance 2 from the target node (with value 
//5) have values 7, 4, and 1.
// 
//
// Example 2: 
//
// 
//Input: root = [1], target = 1, k = 3
//Output: []
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [1, 500]. 
// 0 <= Node.val <= 500 
// All the values Node.val are unique. 
// target is the value of one of the nodes in the tree. 
// 0 <= k <= 1000 
// 
//
// Related Topics Tree Depth-First Search Breadth-First Search Binary Tree 👍 85
//37 👎 170
    
package leetcode.editor.en;

import leetcode.util.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * id: 863
 * title: All Nodes Distance K in Binary Tree
 * author: Ives.He 
 * date: 2023-06-08 23:57:46
 * for TEST copy:
 * import leetcode.editor.en.P863_AllNodesDistanceKInBinaryTree .Solution;
 * P863_AllNodesDistanceKInBinaryTree_Test
 */
public class P863_AllNodesDistanceKInBinaryTree{
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
    private final List<Integer> list = new ArrayList<>();

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        // 1. target to child find k
        findDistanceK(target,k);
        // 2. k!=0 表示要往上找元素
        if(k!=0) findNodeUpon(root,target,k);
        return list;
    }
    private void findDistanceK(TreeNode node, int step){
        if(node==null) return;
        if(step==0) {
            this.list.add(node.val);
            return;
        }
        findDistanceK(node.left,step-1);
        findDistanceK(node.right,step-1);
    }

    private int findNodeUpon(TreeNode node, TreeNode target, int k){
        if(node==null)return 0;
        if(node==target) return 1;  // 找到target開始回傳累計step
        int left = findNodeUpon(node.left,target,k);
        int right = findNodeUpon(node.right,target,k);
        int result = 0;
        if(left==k || right==k) findDistanceK(node,0);  // 表示退回的節點剛好距離k
        else if(left!=0 && left<k){ // 由此節點往右下找
            findDistanceK(node.right,k-left-1);
            result = left+1;
        }else if(right!=0 && right<k){ // 由此節點往左下找
            findDistanceK(node.left,k-right-1);
            result = right+1;
        }
        return result;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
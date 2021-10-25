//Implement the BSTIterator class that represents an iterator over the in-order 
//traversal of a binary search tree (BST): 
//
// 
// BSTIterator(TreeNode root) Initializes an object of the BSTIterator class. 
//The root of the BST is given as part of the constructor. The pointer should be 
//initialized to a non-existent number smaller than any element in the BST. 
// boolean hasNext() Returns true if there exists a number in the traversal to 
//the right of the pointer, otherwise returns false. 
// int next() Moves the pointer to the right, then returns the number at the 
//pointer. 
// 
//
// Notice that by initializing the pointer to a non-existent smallest number, 
//the first call to next() will return the smallest element in the BST. 
//
// You may assume that next() calls will always be valid. That is, there will 
//be at least a next number in the in-order traversal when next() is called. 
//
// 
// Example 1: 
//
// 
//Input
//["BSTIterator", "next", "next", "hasNext", "next", "hasNext", "next", 
//"hasNext", "next", "hasNext"]
//[[[7, 3, 15, null, null, 9, 20]], [], [], [], [], [], [], [], [], []]
//Output
//[null, 3, 7, true, 9, true, 15, true, 20, false]
//
//Explanation
//BSTIterator bSTIterator = new BSTIterator([7, 3, 15, null, null, 9, 20]);
//bSTIterator.next();    // return 3
//bSTIterator.next();    // return 7
//bSTIterator.hasNext(); // return True
//bSTIterator.next();    // return 9
//bSTIterator.hasNext(); // return True
//bSTIterator.next();    // return 15
//bSTIterator.hasNext(); // return True
//bSTIterator.next();    // return 20
//bSTIterator.hasNext(); // return False
// 
//
// 
// Constraints: 
//
// 
// The number of nodes in the tree is in the range [1, 10⁵]. 
// 0 <= Node.val <= 10⁶ 
// At most 10⁵ calls will be made to hasNext, and next. 
// 
//
// 
// Follow up: 
//
// 
// Could you implement next() and hasNext() to run in average O(1) time and use 
//O(h) memory, where h is the height of the tree? 
// 
// Related Topics Stack Tree Design Binary Search Tree Binary Tree Iterator 👍 4
//308 👎 339
    
package leetcode.editor.en;

import java.util.*;

/**
 * id: 173
 * title: Binary Search Tree Iterator
 * author: Ives.He 
 * date: 2021-10-25 22:25:14
 * for TEST copy:
 * import leetcode.editor.en.P173_BinarySearchTreeIterator .Solution;
 * P173_BinarySearchTreeIterator_Test
 */
public class P173_BinarySearchTreeIterator{
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
class BSTIterator {
    List<Integer> list;
    int idx = 0;
    public BSTIterator(TreeNode root) {
       this.list = new ArrayList<>();
       dfs(root);
    }

    void dfs(TreeNode node){
        if(node==null) return;
            dfs(node.left);
            list.add(node.val);
            dfs(node.right);
    }
    
    public int next() {
       return list.get(idx++);
    }
    
    public boolean hasNext() {
        return idx<list.size();
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
//leetcode submit region end(Prohibit modification and deletion)

}
package leetcode.util;

/**
 * 根據leetcode建立參考類別
 * Definition for a binary tree node.
 *  public class TreeNode {
 *      int val;
 *      TreeNode left;
 *      TreeNode right;
 *      TreeNode() {}
 *      TreeNode(int val) { this.val = val; }
 *      TreeNode(int val, TreeNode left, TreeNode right) {
 *          this.val = val;
 *          this.left = left;
 *          this.right = right;
 *      }
 *  }
 *
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int val) {
        this.val = val;
    }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

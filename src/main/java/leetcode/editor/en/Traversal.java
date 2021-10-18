package leetcode.editor.en;

/**
 * for Binary Tree Test input/out 使用工具類別
 */
public interface Traversal {
    String serialize(TreeNode root);
    TreeNode deSerialize(String data);
}

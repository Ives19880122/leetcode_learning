package leetcode.practice;

import leetcode.util.TreeNode;

/**
 * left -> center -> right
 */
public class InOrder implements Traversal {
    @Override
    public String serialize(TreeNode root){
        return "";
    }
    @Override
    public TreeNode deSerialize(String data){
        return new TreeNode(1);
    }
}

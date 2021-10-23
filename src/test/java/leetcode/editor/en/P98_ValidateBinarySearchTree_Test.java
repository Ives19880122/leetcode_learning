package leetcode.editor.en;

import leetcode.editor.en.P98_ValidateBinarySearchTree.Solution;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class P98_ValidateBinarySearchTree_Test {
    Solution solution;
    @Before
    public void setup(){
        this.solution = new P98_ValidateBinarySearchTree().new Solution();
    }
    @Test
    public void ex1(){
        TreeNode input = new TreeNode(2,new TreeNode(1),new TreeNode(3));
        Assert.assertTrue(solution.isValidBST(input));
    }
    @Test
    public void ex2(){
        TreeNode input = new TreeNode(5,new TreeNode(1),new TreeNode(4,new TreeNode(3),new TreeNode(6)));
        Assert.assertFalse(solution.isValidBST(input));
    }
    @Test
    public void tx1(){
        TreeNode input = new TreeNode(5);
        Assert.assertTrue(solution.isValidBST(input));
    }
    @Test
    public void tx2(){
        TreeNode input = new TreeNode(5,new TreeNode(3),null);
        Assert.assertTrue(solution.isValidBST(input));
    }
    @Test
    public void tx3(){
        TreeNode input = new TreeNode(5,null,new TreeNode(7));
        Assert.assertTrue(solution.isValidBST(input));
    }
    @Test
    public void tx4(){
        TreeNode input = new TreeNode(5,new TreeNode(4),new TreeNode(6,new TreeNode(3),new TreeNode(7)));
        Assert.assertFalse(solution.isValidBST(input));
    }
    @Test
    public void tx5(){
        TreeNode input = new TreeNode(2,new TreeNode(2),new TreeNode(2));
        Assert.assertFalse(solution.isValidBST(input));
    }
    //[32,26,47,19,null,null,56,null,27]
}

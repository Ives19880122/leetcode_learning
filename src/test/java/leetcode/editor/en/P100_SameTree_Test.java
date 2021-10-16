package leetcode.editor.en;

import leetcode.editor.en.P100_SameTree.Solution;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class P100_SameTree_Test {
    Solution solution;
    @Before
    public void setup(){
        this.solution = new P100_SameTree().new Solution();
    }
    @Test
    public void ex1(){
        TreeNode p = new TreeNode(1,new TreeNode(2),new TreeNode(3));
        TreeNode q = new TreeNode(1,new TreeNode(2),new TreeNode(3));
        Assert.assertTrue(solution.isSameTree(p,q));
    }
    @Test
    public void ex2(){
        TreeNode p = new TreeNode(1,new TreeNode(2),null);
        TreeNode q = new TreeNode(1,null,new TreeNode(2));
        Assert.assertFalse(solution.isSameTree(p,q));
    }
    @Test
    public void ex3(){
        TreeNode p = new TreeNode(1,new TreeNode(2),new TreeNode(1));
        TreeNode q = new TreeNode(1,new TreeNode(1),new TreeNode(2));
        Assert.assertFalse(solution.isSameTree(p,q));
    }
    @Test
    public void tx1(){
        TreeNode p = null;
        TreeNode q = null;
        Assert.assertTrue(solution.isSameTree(p,q));
    }
    @Test
    public void tx2(){
        TreeNode p = null;
        TreeNode q = new TreeNode(1);
        Assert.assertFalse(solution.isSameTree(p,q));
    }
}

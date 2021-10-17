package leetcode.editor.en;

import leetcode.editor.en.P101_SymmetricTree.Solution;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class P101_SymmetricTree_Test {
    Solution solution;
    @Before
    public void setup(){
        this.solution = new P101_SymmetricTree().new Solution();
    }
    @Test
    public void ex1(){
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3),new TreeNode(4)),
                new TreeNode(2,
                        new TreeNode(4),new TreeNode(3)));
        Assert.assertTrue(solution.isSymmetric(root));
    }
    @Test
    public void ex2(){
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        null, new TreeNode(3)),
                new TreeNode(2,
                        null,new TreeNode(3)));
        Assert.assertFalse(solution.isSymmetric(root));
    }

    /**
     * 只有根目錄的狀況
     */
    @Test
    public void tx1(){
        TreeNode root = new TreeNode(1);
        Assert.assertTrue(solution.isSymmetric(root));
    }
    /**
     * 基本對稱[1,2,2]
     */
    @Test
    public void tx2(){
        TreeNode root = new TreeNode(1,
                new TreeNode(2), new TreeNode(2));
        Assert.assertTrue(solution.isSymmetric(root));
    }

    /**
     * 對稱test[1,2,2,null,3,3,null,4,null,null,4]
     */
    @Test
    public void tx3(){
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        null,
                        new TreeNode(3,
                                new TreeNode(4), null)),
                new TreeNode(2,
                        new TreeNode(3,
                                null, new TreeNode(4)),
                        null));
        Assert.assertTrue(solution.isSymmetric(root));
    }
    /**
     * 不對稱test[1,2,2,null,3,3,null,4,null,5,4]
     */
    @Test
    public void tx4(){
        // [1,2,2,null,3,3,null,4,null,null,4]
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        null,
                        new TreeNode(3,
                                new TreeNode(4), null)),
                new TreeNode(2,
                        new TreeNode(3,
                                new TreeNode(5), new TreeNode(4)),
                        null));
        Assert.assertFalse(solution.isSymmetric(root));
    }
}

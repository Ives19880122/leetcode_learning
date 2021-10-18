package leetcode.editor.en;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PreOrder_Test {
    PreOrder preOrder;
    @Before
    public void setup(){
        this.preOrder = new PreOrder();
    }

    @Test
    public void tx1(){
        // TreeNode{1,2,3} -> 1,2,3
        TreeNode r = new TreeNode(1,new TreeNode(2,null,new TreeNode(4)), new TreeNode(3));
        String out = "1,2,#,4,#,#,3,#,#";
        Assert.assertEquals(out,preOrder.serialize(r));
    }
}

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


    /**
     * preOrder 序列化
     */
    @Test
    public void tx1(){
        // TreeNode{1,2,3} -> 1,2,3
        TreeNode r = new TreeNode(1,new TreeNode(2,null,new TreeNode(4)), new TreeNode(3));
        String out = "1,2,#,4,#,#,3,#,#";
        Assert.assertEquals(out,preOrder.serialize(r));
    }

    /**
     * preOrder 反序列化
     */
    @Test
    public void tx2(){
        // 1,2,3 -> TreeNode{1,2,3}
        String in = "1,2,#,#,3,#,#";
        TreeNode out = preOrder.deSerialize(in);
        TreeNode r = new TreeNode(1,new TreeNode(2,null,null), new TreeNode(3,null,null));
        Assert.assertEquals(preOrder.serialize(r),preOrder.serialize(out));
    }
}

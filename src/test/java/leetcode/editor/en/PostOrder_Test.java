package leetcode.editor.en;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PostOrder_Test {
    PostOrder postOrder;
    @Before
    public void setup(){
        this.postOrder = new PostOrder();
    }


    /**
     * postOrder 序列化
     */
    @Test
    public void tx1(){
        // TreeNode{1,2,3} -> #,2,#,1,#,3,#
        TreeNode r = new TreeNode(1,new TreeNode(2,null,null), new TreeNode(3,null,null));
        String out = "#,#,2,#,#,3,1";
        Assert.assertEquals(out,postOrder.serialize(r));
    }

    /**
     * preOrder 反序列化
     */
//    @Test
//    public void tx2(){
//        // 1,2,3 -> TreeNode{1,2,3}
//        String in = "1,2,#,#,3,#,#";
//        TreeNode out = preOrder.deSerialize(in);
//        TreeNode r = new TreeNode(1,new TreeNode(2,null,null), new TreeNode(3,null,null));
//        Assert.assertEquals(preOrder.serialize(r),preOrder.serialize(out));
//    }
}

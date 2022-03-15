package leetcode.editor.en;

import leetcode.editor.en.P19_RemoveNthNodeFromEndOfList.Solution;
import leetcode.util.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class P19_RemoveNthNodeFromEndOfList_Test {
    Solution solution;
    @Before
    public void setup(){
        solution = new P19_RemoveNthNodeFromEndOfList().new Solution();
    }

    @Test
    public void test1(){
        ListNode input = new ListNode(1, new ListNode(2));
        ListNode output = solution.removeNthFromEnd(input,1);
        ListNode accept = new ListNode(1);
        Assert.assertSame(accept.val,output.val);
    }
}

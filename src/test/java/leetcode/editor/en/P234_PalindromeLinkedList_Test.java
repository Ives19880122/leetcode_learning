package leetcode.editor.en;

import leetcode.editor.en.P234_PalindromeLinkedList.Solution;
import leetcode.util.ListNode;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class P234_PalindromeLinkedList_Test {
    Solution solution;
    @Before
    public void setup(){
        solution = new P234_PalindromeLinkedList().new Solution();
    }

    @Test
    public void ex1(){
        // given
        ListNode input = new ListNode(1, new ListNode(2, new ListNode(1, new ListNode(1))));
        boolean result = solution.isPalindrome(input);
        Assert.assertFalse(result);
    }

    @Test
    public void ex2(){
        // given
        ListNode input = new ListNode(1, new ListNode(3, new ListNode(5, new ListNode(3, new ListNode(1)))));
        boolean result = solution.isPalindrome(input);
        Assert.assertTrue(result);
    }

}

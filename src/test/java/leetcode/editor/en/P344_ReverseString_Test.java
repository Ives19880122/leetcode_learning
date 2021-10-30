package leetcode.editor.en;

import leetcode.editor.en.P344_ReverseString.Solution;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class P344_ReverseString_Test {
    Solution solution;
    @Before
    public void setup(){
        solution = new P344_ReverseString().new Solution();
    }
    @Test
    public void ex1(){
        String input = "hello";
        String ouput = "olleh";
        char[] result = input.toCharArray();
        solution.reverseString(result);
        Assert.assertArrayEquals(ouput.toCharArray(),result);
    }
    @Test
    public void tx1(){
        String input = "hello world";
        String ouput = "dlrow olleh";
        char[] result = input.toCharArray();
        solution.reverseString(result);
        Assert.assertArrayEquals(ouput.toCharArray(),result);
    }
}

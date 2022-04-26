package leetcode.editor.en;
import leetcode.editor.en.P187_RepeatedDnaSequences.Solution;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P187_RepeatedDnaSequences_Test {
    Solution solution;
    @Before
    public void setup(){
        solution = new P187_RepeatedDnaSequences().new Solution();
    }
    @Test
    public void ex1(){
        List<String> expect = Arrays.asList("AAAAACCCCC","CCCCCAAAAA");
        String input = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        Assert.assertEquals(expect,solution.findRepeatedDnaSequences(input));
    }
    @Test
    public void ex2(){
        List<String> expect = Arrays.asList("AAAAAAAAAA");
        String input = "AAAAAAAAAAAA";
        Assert.assertEquals(expect,solution.findRepeatedDnaSequences(input));
    }
    @Test
    public void tx1(){
        List<String> expect = Arrays.asList("AAAACCAAAA","AAACCAAAAT","AACCAAAATT");
        String input = "AAAACCAAAATTAAAACCAAAATT";
        Assert.assertEquals(expect,solution.findRepeatedDnaSequences(input));
    }
    @Test
    public void tx2(){
        List<String> expect = new ArrayList<>();
        String input = "AAA";
        Assert.assertEquals(expect,solution.findRepeatedDnaSequences(input));
    }
}

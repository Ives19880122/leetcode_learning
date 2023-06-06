package leetcode.editor.en;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
import leetcode.editor.en.P1108_DefangingAnIpAddress.Solution;

@RunWith(Parameterized.class)
public class P1108_DefangingAnIpAddress_Test {

    private String input;
    private String expect;
    private Solution solution = new P1108_DefangingAnIpAddress().new Solution();

    @Parameters
    public static List<String[]> testCollection(){
        String [][] expectOutput = {
                {"1.1.1.1","1[.]1[.]1[.]1"},
                {"140.115.21.32","140[.]115[.]21[.]32"}
        };
        return Arrays.asList(expectOutput);
    }

    public P1108_DefangingAnIpAddress_Test(String input, String expect){
        super();
        this.input = input;
        this.expect = expect;
    }

    @Test
    public void test(){
        String result = solution.defangIPaddr(input);
        assertEquals(expect,result);
    }
}

package leetcode.editor.en;

import leetcode.editor.en.P24_SwapNodesInPairs.Solution;
import leetcode.util.ListNode;
import org.junit.Before;
import org.junit.Test;

public class P24_SwapNodesInPairs_Test {
    Solution solution;
    @Before
    public void setup(){
        solution = new P24_SwapNodesInPairs().new Solution();
    }
    int i = 0;
    public ListNode util(int[]nums){
        while(i<nums.length){
            int val = nums[i];
            i++;
            return new ListNode(val,util(nums));
        }
        return null;
    }
    @Test
    public void tx1(){
        int[] input = {1,2,3,4};
        solution.swapPairs(util(input));
    }
}

package leetcode.editor.en;

import leetcode.editor.en.P88_MergeSortedArray.Solution;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class P88_MergeSortedArray_Test {
    Solution solution;
    @Before
    public void setup(){
        this.solution = new P88_MergeSortedArray().new Solution();
    }
    @Test
    public void ex1(){
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        int [] res = {1,2,2,3,5,6};
        solution.merge(nums1,m,nums2,n);
        Assert.assertArrayEquals(res,nums1);
    }
    @Test
    public void ex2(){
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;
        int [] res = {1};
        solution.merge(nums1,m,nums2,n);
        Assert.assertArrayEquals(res,nums1);
    }
    @Test
    public void ex3(){
        //Note that because m = 0, there are no elements in nums1.
        //The 0 is only there to ensure the merge result can fit in nums1.
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        int [] res = {1};
        solution.merge(nums1,m,nums2,n);
        Assert.assertArrayEquals(res,nums1);
    }
    /**
     * 邊界條件
     * nums1.length == m + n
     * nums2.length == n
     * 0 <= m, n <= 200
     * 1 <= m + n <= 200
     * -109 <= nums1[i], nums2[j] <= 109
     */
    @Test
    public void tx1(){
        int[] nums1 = {-109,-108,0,109,0,0};
        int m = 4;
        int[] nums2 = {-109,109};
        int n = 2;
        int [] res = {-109,-109,-108,0,109,109};
        solution.merge(nums1,m,nums2,n);
        Assert.assertArrayEquals(res,nums1);
    }
}

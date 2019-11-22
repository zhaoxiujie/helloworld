package com.zxj.helloworld.leetcode.test;

import com.zxj.helloworld.leetcode.ContainsDuplicate;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * 测试leetcode的实现代码
 */
public class LeetCodeTest {
    ContainsDuplicate containsDuplicate = new ContainsDuplicate();

    @Test
    //ContainsDuplicate问题的测试方法
    public void testContainsDuplicate() {
        int[] nums = {1, 2, 3, 2, 5, 8};
        boolean result = containsDuplicate.containsDuplicate(nums);
        Assert.assertTrue(result);
    }
}

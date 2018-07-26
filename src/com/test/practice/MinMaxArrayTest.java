package com.test.practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import organize.MinMaxArray;

public class MinMaxArrayTest {
    @Test
    public void verifyMinMax1()
    {
        int[] a={1,2,3,4,5};
        int[] minmax={10,14};
        Assert.assertEquals(MinMaxArray.miniMaxSum(a),minmax);
    }
}

package com.test.practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import organize.MinMaxArray;
import organize.MinMaxReturnVal;

public class MinMaxArrayTest {
    @Test
    public void verifyMinMax1()
    {
        int[] a={1,2,3,4,5};

        MinMaxReturnVal mmrv= new MinMaxReturnVal();
        mmrv.minsum=10;
        mmrv.maxsum=14;
        MinMaxReturnVal returnVal = MinMaxArray.miniMaxSum(a);
        Assert.assertEquals(returnVal.maxsum, mmrv.maxsum);
        Assert.assertEquals(returnVal.minsum, mmrv.minsum);

        Assert.assertEquals(returnVal.minsum,10 );
        Assert.assertEquals(returnVal.maxsum, 14);

        Assert.assertEquals(returnVal, mmrv);
        Assert.assertTrue(MinMaxReturnVal.TestHelperEquals(returnVal, mmrv));

    }
}

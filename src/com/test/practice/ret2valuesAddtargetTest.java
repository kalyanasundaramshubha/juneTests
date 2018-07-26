package com.test.practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import organize.ret2ValuesAddTarget;

public class ret2valuesAddtargetTest {


    @Test(priority=2, enabled=true)
    public void retvalTarget()
    {
        int[] num={2,8,5,6,10,3};
        int[] retval={0,3};
        Assert.assertEquals(ret2ValuesAddTarget.ret2Values(num,8),retval);
    }
    @Test(priority=1, dependsOnMethods = "retvalTarget", enabled=false)
    public void retvalTarget1()
    {
        int[] num={2, 7, 11, 15};
        int[] retval={0,1};
        Assert.assertEquals(ret2ValuesAddTarget.ret2Values(num,9),retval);
    }
    @Test(priority = 2, dependsOnMethods = "retvalTarget")
    public void retvalTarget2()
    {
        int[] num={2, 5, 5, 11, 15};
        int[] retval={1,2};
        Assert.assertEquals(ret2ValuesAddTarget.hasPairValueSum(num,10),true);
    }
}

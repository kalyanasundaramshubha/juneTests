package com.test.practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import organize.containsDuplicateintarry;

public class containsDupintarrayTest {
    @Test(priority = 1)
    public void verifyDupintArray()
    {
        int[]num={2,5,5,11};
        Assert.assertEquals(containsDuplicateintarry.findDupexist(num),true);
    }

    @Test(priority = 2, dependsOnMethods = "verifyDupintArray")
    public void verifyDupintArray1()
    {
        int[]num={2,5,5,11};
        Assert.assertEquals(containsDuplicateintarry.findDupusinghash(num),true);
    }
    @Test(priority = 3, dependsOnMethods = "verifyDupintArray1")
    public void verifyDupintArray2()
    {
        int[]num={0};
        Assert.assertEquals(containsDuplicateintarry.findDupusinghash(num),false);
    }
}

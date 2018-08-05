package com.test.practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import organize1.FunnyString;

public class FunnyStringTest {
    @Test(enabled=true)
    public void verifyFunnyString()
    {
        Assert.assertEquals(FunnyString.funnyString("bcxz"),"Not Funny");
    }
    @Test(enabled=true)
    public void verifyFunnyString1()
    {
        Assert.assertEquals(FunnyString.funnyString("acxz"),"Funny");
    }
    @Test
    public void verifyFunnyString2()
    {
        Assert.assertEquals(FunnyString.funnyString("nosklrxrtyuxtmnurzsryuxtywqwqpxts"),"Not Funny");
    }
}

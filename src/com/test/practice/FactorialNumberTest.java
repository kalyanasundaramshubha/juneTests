package com.test.practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import organize1.FactorialNumber;

public class FactorialNumberTest {

    @Test
    public void verifyFactorialNum()
    {
        Assert.assertEquals(FactorialNumber.factorialNum(6),720);
    }
    @Test
    public void verifyFactorialNum1()
    {
        Assert.assertEquals(FactorialNumber.factorialNum(1),1);

    }
    @Test
    public void verifyFactorialNum0()
    {
        Assert.assertEquals(FactorialNumber.factorialNum(-4),0);

    }

}

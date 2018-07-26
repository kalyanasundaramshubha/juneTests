package com.test.practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import organize.FactorInteger;

public class FactorsIntegerTest
{
    @Test
    public void verifyFactors()
//factors of 12
    {
        int[] fac={1,2,3,4,6,12};
        Assert.assertEquals(FactorInteger.factorsOfInteger(12),fac);
    }

}

package com.test.practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import organize.BuySellMaxProfit;

public class BuySellProfitTest {
    @Test
    public void verifymaxProfit()
    {
        int[] price={7,2,3,5,1};
        Assert.assertEquals(BuySellMaxProfit.maxProfitStock(price),3);

    }
    @Test
    public void verifymaxProfit1()
    {
        int[] price={7,6,5,4,1};
        Assert.assertEquals(BuySellMaxProfit.maxProfitStock(price),0);

    }
}

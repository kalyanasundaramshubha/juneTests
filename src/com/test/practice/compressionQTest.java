package com.test.practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import organize.compressionQ;

public class compressionQTest {



    //compressionQ compressedvar=new compressionQ();

    @Test
    public void verifyCompression2occ()
    {
        Assert.assertEquals(compressionQ.compressed("goodfood"),"go2dfo2d");
    }
    @Test
    public void verifyCompression2occfirstLast()
    {
        Assert.assertEquals(compressionQ.compressed("oodfddd"),"o2dfd3");
    }
    @Test
    public void verifyCompression3occfirstLastmid()
    {
        Assert.assertEquals(compressionQ.compressed("rrtootoydfddd"),"r2to2toydfd3");
    }
}

package com.test.practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import organize1.InsertElementinArray;

public class InsertElementinArrayTest {
    @Test
    public void verifyInserteleArray()
    {
        int[] a= {4,8,4,5,9};
        String b= "4846659";
        Assert.assertEquals(InsertElementinArray.insertElement(a,4,5,66),b );
    }
    @Test
    public void verifyInserteleArray1()
    {
        int[] a= {4,5,9,4,5};
        int[] b= {4,66,5,9,4,5};
        Assert.assertEquals(InsertElementinArray.insertEle(a,4,5,66),b );
    }
}

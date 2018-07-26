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
}

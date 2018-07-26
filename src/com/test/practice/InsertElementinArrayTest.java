package com.test.practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import organize1.InsertElementinArray;

public class InsertElementinArrayTest {
    @Test
    public void verifyInserteleArray()
    {
        int[] a= {4,5,8,3,9};
        int[] b= {4,66,5,8,3,9};
        Assert.assertEquals(InsertElementinArray.insertElement(a,4,5,66),b );
    }
}

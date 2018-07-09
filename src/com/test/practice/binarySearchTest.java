package com.test.practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import organize.BinarySearch;

public class binarySearchTest {

    @Test
    public void search1()
    {
        int[] arr={4,5,8,9,10,12};
        Assert.assertEquals(BinarySearch.Search(arr,5), 1);
    }
}

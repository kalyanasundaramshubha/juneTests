package com.test.practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import organize.bubbleSort;

public class bubbleSortTest {

    @Test
    public void verifybs()
    {
        int[] bs={14,12,8,15,10};
        int [] sortedbs={8,10,12,14,15};
        Assert.assertEquals(bubbleSort.bubbleSort(bs),6);

    }
}

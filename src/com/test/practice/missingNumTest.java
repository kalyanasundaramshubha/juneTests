package com.test.practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import organize.missingNumbers;

import java.util.ArrayList;
import java.util.List;

public class missingNumTest {
    @Test
    public void verifymissingNum()
    {
        int[] nums={4,3,2,7,8,2,3,1};
        List<Integer> tar= new ArrayList<Integer>();
        tar.add(5);
        tar.add(6);

        Assert.assertEquals(missingNumbers.findmissingnumbers(nums),tar);
    }
}

package com.test.practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import organize.merge2Strings;

public class merge2stringsTest
{
    @Test
    public void verifymerge2()
    {
        Assert.assertEquals(merge2Strings.mergeStrings("abc","def"),"adbecf");
    }
    @Test
    public void verifymerge2str1()
    {
        Assert.assertEquals(merge2Strings.mergeStrings("ab","def"),"adbef");
    }
    @Test
    public void verifymerge2str2()
    {
        Assert.assertEquals(merge2Strings.mergeStrings("shubha","karthikeyan"),"skhaurbthhaikeyan");
    }
}

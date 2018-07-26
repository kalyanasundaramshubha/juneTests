package com.test.practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import organize.StringUtilities;

public class StringUtilitiesTest {
    @Test(enabled=false)
    public void verifyPopularAreacode()
    {
        String[] s={("shubha;425-221-2603;98052"),("Aditi;425-378-0989,98051"),("Arjun;303-594-9445;98052"),("Karthikeyan;303-594-9888;98052"),("roro;425-444-8789,98050")};
        Assert.assertEquals(StringUtilities.mostPopularAreaCode(s),"425");
    }
    @Test(enabled=false)
    public void verifyFirstUniCharString()
    {
        Assert.assertEquals(StringUtilities.firstUniqueCharinString("aabbbbcccd"),'d');
    }
    @Test(enabled=false)
    public void verifyFirstOccChar()
    {
        Assert.assertEquals(StringUtilities.firstOcc("ABCDBEF"),'B');
    }

    @Test
    public void verifyMergeStrings()
    {
        Assert.assertEquals(StringUtilities.mergeStringsAlt("shubha","abc"),"sahbucbha");
    }









}

package com.test.practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import organize1.makeAnagrams;

public class makeAnagramsTest {

    @Test
    public void verifyretvaltomakeAnagram1()
    {
        Assert.assertEquals(makeAnagrams.makeAnagramsfrom2str("silentk","listens"),2);
    }
    @Test
    public void verifyretvaltomakeAnagram2()
    {
        Assert.assertEquals(makeAnagrams.makeAnagramsfrom2str("cde","abc"),4);
    }
    @Test
    public void verifyretvaltomakeAnagram3()
    {
        Assert.assertEquals(makeAnagrams.makeAnagramsfrom2str("kiss","miss"),2);
    }
    @Test
    public void verifyretvaltomakeAnagram4()
    {
        Assert.assertEquals(makeAnagrams.makeAnagramsfrom2str("bacdc","dcbac"),0);
    }
    
}

package com.test.practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import organize.PalindromeIndex;

public class PalindromeIndexTest {
    @Test
    public void palindromeIndextest1()
    {
        Assert.assertEquals(PalindromeIndex.palindromeIndex("madabm"),4);
    }
    @Test
    public void palindromeIndextest2()
    {
        Assert.assertEquals(PalindromeIndex.palindromeIndex("quyjjdcgsvvsgcdjjyq"),1);
    }
    @Test(priority=1)
    public void palindromeIndextest3()
    {
        Assert.assertEquals(PalindromeIndex.palindromeIndex("hgygsvlfwcwnswtuhmyaljkqlqjjqlqkjlaymhutwsnwcflvsgygh"),8);
    }

}

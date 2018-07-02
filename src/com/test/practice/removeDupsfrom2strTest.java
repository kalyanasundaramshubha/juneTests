package com.test.practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import organize1.removeDupsfrom2str;

public class removeDupsfrom2strTest
{

    @Test
    public void verifyDupremoval1()
    {
        Assert.assertEquals(removeDupsfrom2str.removeDups("cc","bb"), 0);
    }
    @Test
    public void verifyDupremoval2()
    {
        Assert.assertEquals(removeDupsfrom2str.removeDups("silentak","listen"), 2);
    }

}

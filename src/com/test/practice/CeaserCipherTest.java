package com.test.practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import organize.CeaserCipher;

public class CeaserCipherTest {

    @Test
    public void ceaserCipherTest1()
    {
        Assert.assertEquals(CeaserCipher.ceasersCipher("Hello_World!" ,4),"Lipps_Asvph!");
    }
}

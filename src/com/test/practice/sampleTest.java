package com.test.practice;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class sampleTest {
    @Test
    public void testAdd()
    {
        String str= "TestNG is working fine";
        assertEquals("TestNG is working fine",str);
    }
}

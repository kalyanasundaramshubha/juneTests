package com.test.practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import organize1.TImeConversion;

public class TimeConversionTest {
    @Test
    public void convertTime12AM()
    {
        Assert.assertEquals(TImeConversion.timeConversion2("12:00:00AM"),"00:00:00");
    }
    @Test
    public void convertTimeAM()
    {
        Assert.assertEquals(TImeConversion.timeConversion("09:40:05AM"),"09:40:05");
    }
    @Test
    public void convertTimeAM1()
    {
        Assert.assertEquals(TImeConversion.timeConversion2("12:40:05AM"),"00:40:05");
    }
    @Test
    public void convertTimePM()
    {
        Assert.assertEquals(TImeConversion.timeConversion2("07:40:05PM"),"19:40:05");
    }
    @Test
    public void convertTimePM1()
    {
        Assert.assertEquals(TImeConversion.timeConversion2("12:40:05PM"),"12:40:05");
    }
    @Test
    public void convertTimePM2()
    {
        Assert.assertEquals(TImeConversion.timeConversion2("10:40:05PM"),"22:40:05");
    }
}

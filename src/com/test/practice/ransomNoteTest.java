package com.test.practice;

import org.testng.Assert;
import org.testng.annotations.Test;
import organize1.ransomNote;

public class ransomNoteTest {

    @Test (priority=1)
    public void verifyransommsg1()
    {
        String[] m={"give","me","quality","job"};
        String[] n={"give","me","badge"};
        Assert.assertEquals(ransomNote.ransomeNoteMessage(m,n),"No");
    }
    @Test (priority=2)
    public void verifyransommsg0()
    {
        String[] m={"give","me","quality","job"};
        String[] n={"laugh","love","badge"};
        Assert.assertEquals(ransomNote.ransomeNoteMessage(m,n),"No");
    }
    @Test (priority=3)
    public void verifyransommsgAll()
    {
        String[] m={"give","me","quality","job"};
        String[] n={"give","job","me"};
        Assert.assertEquals(ransomNote.ransomeNoteMessage(m,n),"Yes");
    }
    @Test(priority=4)
    public void verifyransomUppercase()
    {
        String[] m={"Attack", "at", "dawn"};
        String[] n={"attack", "at","Dawn"};
        Assert.assertEquals(ransomNote.ransomeNoteMessage(m,n),"No");
    }
    @Test(priority=5)
    public void verifyransomRepeattwice()
    {
        String[] m={"two", "times", "three", "is" ,"not" ,"four"};
        String[] n={"two", "times", "two", "is", "four"};
        Assert.assertEquals(ransomNote.ransomeNoteMessage(m,n),"No");
    }
    @Test(priority=6)
    public void verifyransommsg2()
    {
        String[] m={"give", "me", "one", "grand", "today", "night","give"};
        String[] n={"give", "one", "grand", "today"};
        Assert.assertEquals(ransomNote.ransomeNoteMessage(m,n),"Yes");
    }
    @Test(priority=7)
    public void verifyransommsg3()
    {
        String[] m={"give", "me", "one", "grand", "today", "night","give"};
        String[] n={"give", "one", "grand", "today","give"};
        Assert.assertEquals(ransomNote.ransomeNoteMessage(m,n),"Yes");
    }
    @Test(priority=8)
    public void verifyransommsg4()
    {
        String[] m={"good", "bad", "good", "bad", "good", "bad","good"};
        String[] n={"good", "bad", "good", "bad"};
        Assert.assertEquals(ransomNote.ransomeNoteMessage(m,n),"Yes");
    }

}

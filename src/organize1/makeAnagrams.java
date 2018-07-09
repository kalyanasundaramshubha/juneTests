package organize1;

import java.util.Arrays;

import static java.lang.Math.abs;

public class makeAnagrams {

    public static int makeAnagramsfrom2str(String a, String b)
    {
        int count=0;
        int[]freqa=new int[26];
        int[]freqb=new int[26];

        if(a.length()==0||b.length()==0)
        {
            return 0;
        }
        for( int i=0; i<a.length();i++)
        {
            freqa[a.charAt(i)-'a']++;
        }
        for(int i=0;i<b.length();i++)
        {
            freqb[b.charAt(i)-'a']++;
        }
        for(int i=0;i<freqa.length;i++)
        {
            if(freqa[i]!=freqb[i])
            {
                count=count+abs(freqa[i]-freqb[i]);
            }

        }
        return count;

    }

    public static int makeAnagramsusingsort(String str1, String str2)
    {
            char[] a=str1.toCharArray();
            char[] b=str2.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            int cur=0, pos=0,count=0;
            while( cur<a.length&&pos<b.length)
            {
                if(a[cur]!=b[pos])
                {
                    if (a[cur] < b[pos])
                    {
                        count++;
                        cur++;
                    }
                    else
                    {
                       count++;
                       pos++;
                    }
                }
                else
                {
                        cur++;
                        pos++;
                }
            }
            if(cur==(a.length))
            {
                count=count+(b.length-pos);
            }
            if(pos==(b.length))
            {
                count=count+(a.length-cur);
            }
            return count;
    }
}

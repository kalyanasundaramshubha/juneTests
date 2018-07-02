package organize1;

import java.util.HashSet;

public class removeDupsfrom2str {

    public static int removeDups(String a, String b)
    {
        HashSet hs=new HashSet();
        String concat=a+b;
        int[]freq= new int[26];
        int numNeeded=0;
        for(int i=0; i<concat.length();i++)
        {
            freq[concat.charAt(i)-'a']++;
        }
        for(int i=0;i<concat.length();i++) {
            if (freq[i] == 1) {
                numNeeded=numNeeded+freq[i];
            }
        }

        /*for(int j=0;j<concat.length();j++)
            {
                hs.add(concat.charAt(j));
            }*/
        return numNeeded;
    }
}

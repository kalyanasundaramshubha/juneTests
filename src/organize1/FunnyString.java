package organize1;

import java.util.ArrayList;

import static java.lang.Math.abs;

public class FunnyString {

    public static String funnyString(String s)
    {
        String r="", found="";
        ArrayList<Integer> sal=new ArrayList<Integer>();
        ArrayList<Integer> ral=new ArrayList<Integer>();

        for(int i=s.length()-1;i>=0;i--)
        {
            r=r+s.charAt(i);

        }
        for(int i=0;i<s.length()-1;i++)
        {
            sal.add(abs(s.charAt(i)-s.charAt(i+1)));
        }
        for(int i=0;i<r.length()-1;i++)
        {
            ral.add(abs(r.charAt(i)-r.charAt(i+1)));
        }
        int i=0,j=0;
        while(i<s.length()-1&&j<r.length()-1)
        {
            //int sa=sal.indexOf(i), ra=ral.indexOf(j);
           if(sal.get(i)!=ral.get(j))
           {
                    found="Not Funny";
                    break;
           }
           i++;
           j++;


        }
        if(found=="Not Funny")
        {
            return "Not Funny";
        }
        else
        {
            return "Funny";
        }
    }
}

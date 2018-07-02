package organize;

import java.util.ArrayList;

public class charmaxString {

    /*
    1. A string with 1 multiple occurances : str = foobar , output = o
    2. A string with 1 occurance at the end : str = barfoo, output = o
    3. 1 occ at the beginning same char  : str = foodgodo, output= o
    4. 1 occ at beginning diff char : str = fooodgada, output= o

    5. 2 occ at begin and middle : str = fooodgaadram, output= o
    6. 2 occ at middle and end : str= ramdgaadfooo, output=o
    7. 2 occ at begin and end : str = fooodramdaa, output =o
    8  2 occ at begin and end (max) : str= faadramgooo output =o
    9. 2 occ same : str = foodgaad output=a

     */
    public static char maxcharacterString(String str){

        char sb, maxchar='z',currentchar='z';
        int count=0,max=0,cc=0;
        for (int i=1; i < str.length();i++)
        {

            if (str.charAt(i) == str.charAt(i - 1))
            {
                count++;
                currentchar = str.charAt(i - 1);
                cc = count;
                    //count = 0;

            }
            else
            {
              currentchar=str.charAt(i-1);
              cc=count;
              count=0;
            }


            if(cc>max)
            {
                max=cc;
                maxchar=currentchar;
            }
        }

        return maxchar;
    }
}

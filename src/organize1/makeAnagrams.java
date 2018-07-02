package organize1;

public class makeAnagrams {

    public static int makeAnagramsfrom2str(String a, String b)
    {
        int cur=0,pos=0, retval=0, setlen=a.length();

        StringBuilder  bmatch= new StringBuilder();
        StringBuilder  amatch= new StringBuilder();
        /*for(int i=0;i<a.length();i++)
        {
            amatch=amatch.append(a.charAt(i));
        }
        for(int i=0;i<b.length();i++)
        {
            bmatch=bmatch.append(b.charAt(i));
        }*/
        if(a.length()==0||b.length()==0)
        {
            return 0;
        }

        if(a.length()<b.length())
        {
            setlen=b.length();
        }
        for( int i=0; i<setlen;i++)
        {
            while (cur < a.length() && pos < b.length())
            {
                if (a.charAt(cur) != b.charAt(pos))
                {
                    pos++;
                    if(pos==b.length())
                    {
                        amatch.append(a.charAt(cur));
                    }
                }
                else
                {
                    bmatch.append(b.charAt(pos));
                    break;
                }
            }
            cur++;
            pos = 0;
        }
        retval=amatch.length()+(b.length()-bmatch.length());
        return retval;
    }
}

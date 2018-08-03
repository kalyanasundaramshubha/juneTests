package organize;

import java.util.*;

public class StringUtilities {

    public static String revString(String s)
    {
        StringBuilder sb=new StringBuilder();
        int len=s.length();
        for(int i=len-1;i>=0;i++)
        {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    /*
    testcases

    provide null for string
     */
    public static int findFirstOccChar(String s, char target)
    {
        if(s==null)
        {
            return -1;
        }
        for(int i=0;i<s.length();i++)
        {
            if (s.charAt(i)==target)
            {
                return i;
            }
        }

        return -1;
    }

    /*
    return the 2 char String starting from the given index in a String
    Assuming given string length is atleast 2

    testcases
    1. String- shubha- len 6, index=10
    2. String- sh len 2, index= -1
    3. String- doormate len=8, index=8
     */
    public static String twoCharString(String s, int index)
    {
        StringBuilder sb=new StringBuilder();
        if(index>=s.length()-1||index<0)
        {
            sb.append(s.charAt(0));
            sb.append(s.charAt(1));
            return sb.toString();
        }
        sb.append(s.charAt(index));
        sb.append(s.charAt(index+1));
        return sb.toString();
    }

    public static String mostPopularAreaCode(String []s)
    {
        String[] entries;

        String useracct,areacode="";
        int count=1;
        HashMap<String,Integer> ht=new HashMap<String,Integer>();
        for(int i=0;i<s.length;i++)
        {
            useracct=s[i];
            entries= useracct.split(";");
            areacode= entries[1].substring(0,3);

            if(ht.containsKey(areacode))
            {
                count=ht.get(areacode)+1;
            }
            ht.put(areacode,count);
            count=1;
        }

        //int maxValue=Collections.max(ht.values());
        int maxValue=0;
        String key="";
        for (Map.Entry<String, Integer> entry:ht.entrySet())
        {
            if(entry.getValue()>maxValue)
            {
                maxValue=entry.getValue();
                key=entry.getKey();
            }
        }
        return key;
    }

    public static char firstUniqueCharinString(String s)
    {
        int count=1;
        HashMap<Character,Integer> hm = new HashMap<Character, Integer>();
            for(int i=0;i<s.length();i++)
            {
                if(hm.containsKey(s.charAt(i)))
                {
                    count=hm.get(s.charAt(i))+1;
                }
                hm.put(s.charAt(i),count);
                count=1;

            }

            for(int i=0; i<s.length();i++)
            {
                if(hm.get(s.charAt(i))==1)
                {
                    return s.charAt(i);
                }
            }

            return ' ';

    }
    public static MultipleReturnValues firstOcc(String s)
    {

        //String uc=s.toUpperCase();
        HashMap<Character,CountPlusIndex> hm= new HashMap<Character,CountPlusIndex>();
        CountPlusIndex cpi;

        for(int i=0; i<s.length();i++)
        {
            if(hm.containsKey(s.charAt(i)))
            {
                cpi=hm.get(s.charAt(i));
                cpi.countH=cpi.countH+1;
                cpi.indexH=i;
                //since the variable cpi  is referencing to same object we need not put
                // hm.put(s.charAt(i), cpi);
            }
            else
            {
                cpi = new CountPlusIndex();//countH=0,indexH=0
                cpi.countH = 1;
                cpi.indexH = i;
                hm.put(s.charAt(i), cpi);

            }
        }
        MultipleReturnValues mrv= new MultipleReturnValues();
        for(int i=0; i<s.length();i++)
        {
            cpi=hm.get(s.charAt(i));
            if(cpi.countH>1)
            {
                mrv.index=cpi.indexH;
                mrv.Occ=s.charAt(i);
                return mrv;
            }
        }
        return mrv;
    }

    public static MultipleReturnValues firstOcc1(String s)
    {
        HashMap<Character,Integer> hm= new HashMap<Character,Integer>();
        MultipleReturnValues mrv=new MultipleReturnValues();
        int count=1;
        for(int i=0;i<s.charAt(i);i++)
        {
            if(hm.containsKey(s.charAt(i)))
            {
                mrv.index=i;
                mrv.Occ=s.charAt(i);
                return mrv;
            }
            else
            {
                hm.put(s.charAt(i),count);

            }
        }
        return mrv;
    }

    public static String mergeStringsAlt(String a, String b)
    {
        StringBuilder sb = new StringBuilder();
        int big=0;
        if(a.length()>b.length())
        {
            big=a.length();
        }
        else
        {
            big=b.length();
        }

        for(int i=0;i<big;i++)
        {
            if(i<a.length())
            {
                sb.append(a.charAt(i));
            }
            if(i<b.length())
            {
                sb.append(b.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String superReducedString(String s) {
        StringBuilder sb=new StringBuilder();
        int count=1;
        sb.append(s.charAt(0));
        for (int i=1; i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            {
                count++;
            }
            else
            {
                if(count%2==0)
                {
                  sb.deleteCharAt(sb.length()-1);
                }
                sb.append(s.charAt(i));
                count=1;
            }

        }
        if(count%2==0)
        {
            sb.deleteCharAt(s.length()-1);
        }
        return sb.toString();


    }
    public static String reduceStr(String s)
    {
        StringBuilder sb=new StringBuilder();
        int count=1;
        String newstr;
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            {
                count++;

            }
            else
            {
                if(count%2!=0)
                {
                    sb.append(s.charAt(i-1));

                }
                count=1;

            }

        }
        if(count%2!=0)
        {
            sb.append(s.charAt(s.length()-1));
        }


        return sb.toString();
    }


}

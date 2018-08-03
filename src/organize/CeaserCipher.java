package organize;

import java.util.HashMap;

public class CeaserCipher {

    public static String ceaserCipher(String s, int k)
    {
        //s=s.toLowerCase();
        String alpha="abcdefghijklmnopqrstuvwxyz";
        String alphaU=alpha.toUpperCase();
        String cipher=alpha.substring(k,alpha.length())+alpha.substring(0,k);
        String ciherU=cipher.toUpperCase();
        String newstr="";
        HashMap <Character,Character> hm=new HashMap<Character,Character>();
        for(int i=0;i<alpha.length();i++)
        {
            hm.put(alpha.charAt(i),cipher.charAt(i));
            hm.put(alphaU.charAt(i),ciherU.charAt(i));
        }
        for(int i=0;i<s.length();i++)
        {

            if(!hm.containsKey(s.charAt(i)))
            {
                newstr=newstr+s.charAt(i);
            }
            else
            {
                newstr=newstr+hm.get(s.charAt(i));
            }

        }
        return newstr;
    }

    public static String ceasersCipher(String s, int k)
    {
        String newstr="";
        int cipher;
        for(int i=0;i<s.length();i++)
        {

            cipher=s.charAt(i)+k;
            k=k%26;
            if(!Character.isLetter(s.charAt(i)))
            {
                newstr=newstr+s.charAt(i);
            }

            else if(cipher<='z'&&Character.isLowerCase(s.charAt(i))||cipher<='Z'&&Character.isUpperCase(s.charAt(i)))
            {
                newstr=newstr+(char)cipher;
            }
            else if(cipher>'z')
            {
                cipher=k-('z'-s.charAt(i))+ ('a'-1);
                newstr=newstr+(char)cipher;

            }
            else if(cipher>'Z')
            {
                cipher=k-('Z'-s.charAt(i))+('A'-1);
                newstr=newstr+(char)cipher;
            }

      }
        return newstr;
    }
}

package organize1;

import java.util.HashMap;

public class uniqueCharinStr {

    public static int uniqueC(String s){

//Implementation1 - o(n2)

        int len=s.length(), i;
        boolean foundMatch=false;

        //int[] str=;
        for(i=0; i<len;i++) {
             foundMatch=false;
            for(int j=0;j<len;j++)
            {
                if(i!=j)
                {
                    if (s.charAt(i) == s.charAt(j)) {
                        foundMatch = true;
                        break;
                    }
                }

            }

            if(foundMatch==false) {
                return i;
            }

        }
    return -1;
    }

 //Implementation2  o(n) using array
    public static int uniquec(String s){
        int[]freq= new int[26];
        for(int i=0; i<s.length();i++)
        {
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }

    //Implementation 3  using hash map
    public static int uniquehash(String s) {
        HashMap<Character,Integer> uh=new HashMap<Character, Integer>();
        //int c=0;
        for(int i=0; i<s.length();i++){
            if(uh.containsKey(s.charAt(i))) {
                int value=uh.get(s.charAt(i));
                uh.put(s.charAt(i),value+1);
            }
            else
            {
                uh.put(s.charAt(i),1);
            }

        }
        for(int i=0;i<s.length();i++){
            if(uh.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;

    }


}

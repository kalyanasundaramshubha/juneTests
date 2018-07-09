package organize1;

import java.util.HashMap;

public class ransomNote {

    public static String ransomeNoteMessage(String[] m, String[] n)
    {
        int count=1,counter=1;
        HashMap<String,Integer> hm=new HashMap<String,Integer>();

        for(int i=0;i<m.length;i++)
        {
            if(hm.containsKey(m[i]))
            {
                count=hm.get(m[i])+1;

            }
            hm.put(m[i],count);

        }
        for(int i=0;i<n.length;i++)
        {
            if(hm.containsKey(n[i]))
            {
                if(hm.get(n[i])>0)
                {
                    hm.put(n[i],hm.get(n[i])-1);
                }
                else
                {
                    return "No";
                }

            }
            else
            {
                return "No";
            }
        }
        return "Yes";


    }
}

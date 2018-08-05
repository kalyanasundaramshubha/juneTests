package organize;

import java.util.SortedSet;
import java.util.TreeSet;

public class StringSortedSet {

    public static String stringSort(String s, int k)
    {
        SortedSet<String> sset= new TreeSet<String>();
        for(int i=0;i<=s.length()-k;i++)
        {
            sset.add(s.substring(i,i+k));
        }
        return sset.first()+"\n"+sset.last();
    }
}

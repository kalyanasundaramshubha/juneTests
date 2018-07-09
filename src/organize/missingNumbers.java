package organize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class missingNumbers {
    public static List<Integer> findmissingnumbers(int[]nums)
    {

        Arrays.sort(nums);
        HashSet<Integer> hm= new HashSet<Integer>();

        for(int i=0; i<nums.length;i++)
        {
            hm.add(nums[i]);
        }
        for(int i=1;i<= nums.length;i++)
        {
            if(!hm.contains(i))
            {
                hm.add(i);
            }
            else
            {
                hm.remove(i);

            }
        }
        List <Integer> retval= new ArrayList<Integer>(hm);
       for(int i=0; i<retval.size();i++)
        {
             retval.indexOf(i);
        }
        return  retval;
    }
}

package organize;

import java.util.HashSet;
import java.util.Hashtable;

public class containsDuplicateintarry {

    public static boolean findDupexist(int[]num)
    {
        for(int i=0;i<num.length;i++)
        {
            for(int j=1;j<num.length;j++)
            {
                if(num[i]==num[j]&i!=j)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean findDupusinghash(int[]nums)
    {
        Hashtable<Integer,Integer> hm=new Hashtable<Integer,Integer>();
        int count=1;
        for(int i=0;i<nums.length;i++)
        {
            if (hm.containsKey(nums[i]))
            {
                count = hm.get(nums[i]) + 1;
            }
            hm.put(nums[i], count);
            count=1;
        }

        for(int i=0;i<hm.size();i++)
        {
            if(hm.get(nums[i])>1)
            {
                return true;
            }
        }
        return false;
    }

}

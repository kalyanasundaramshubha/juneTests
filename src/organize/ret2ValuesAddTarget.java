package organize;

import java.util.Arrays;

public class ret2ValuesAddTarget {

    public static int[] ret2Values(int[] numbers, int target)
    {
        int[] retval=new int[2];

        for(int i=0; i<numbers.length;i++)
        {
            for(int j=1;j<numbers.length;j++)
            {
                if(numbers[i]+numbers[j]==target&i!=j)
                {

                    retval[0]=i;
                    retval[1]=j;
                    return retval;
                }
                else
                {
                    continue;
                }
            }
        }
        return retval;
    }

    public static boolean hasPairValueSum(int[] a, int target)
    {
        Arrays.sort(a);
        int low=0;
        int high= a.length-1;
        while(low<high)
        {
            if((a[low]+a[high])==target)
            {
                return true;
            }
            if(a[low]+a[high]<target)
            {
                low++;
            }
            else
            {
                high--;
            }

        }
        return false;
    }
}

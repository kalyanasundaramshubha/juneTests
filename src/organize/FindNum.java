package organize;
import java.util.Arrays;

public class FindNum {
    public static int findLowNeg(int[] ar)
    {
        int min=0;

        //Arrays.sort(ar);
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]<min&&ar[i]<0)
            {
                min=ar[i];
            }
        }
        return min;
    }

    public static int findHighPosNum(int[] ar)
    {
        //Arrays.sort(ar);
        int max=0;
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]>max&&ar[i]>0)
            {
                max=ar[i];
            }
        }

        return max;
    }
}

package organize;

public class bubbleSort {

    public static int  bubbleSort(int[] bs)
    {
        int temp=0,swapped=0;
       for(int i=0;i<bs.length;i++)
       {
           for (int j = 0; j < bs.length - 1; j++)
           {
               if (bs[j] > bs[j + 1])
               {
                   temp = bs[j];
                   bs[j] = bs[j + 1];
                   bs[j + 1] = temp;
                   swapped++;
               }
           }
       }
        return swapped;
    }
}

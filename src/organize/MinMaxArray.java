package organize;

public class MinMaxArray {

    public static MinMaxReturnVal miniMaxSum(int[] arr) {
        MinMaxReturnVal mmv=new MinMaxReturnVal();
        int sum=0;
        mmv.maxsum=0;
        mmv.minsum=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                if(i!=j)
                {
                    sum=sum+arr[j];
                }

            }

            if(sum>mmv.maxsum)
            {
                mmv.maxsum=sum;
            }
            if(sum<mmv.minsum)
            {
                mmv.minsum=sum;

            }
            sum=0;
        }

        //System.out.print(minsum);
        //System.out.print(" "+maxsum);
        return mmv;

    }
}

package organize1;

public class fibArray {

    /*
    TCs
    {3,<expected Value> , {-1, throw exception, 0, array of size 0,
    */

    public static int[] fib (int n){
        int [] fib=new int[n];
        int i=0;
        fib[0]=0;
        fib[1]=1;
        for(i=2;i<n;i++){
            fib[i]= fib[i-1]+fib[i-2];
        }
        return fib;
    }

    //n = 2 , 1
    public static long fibValue(int n)
    {
        if (n < 0)
        {
            throw new IllegalArgumentException();
        }

        long prev=1;
        long secprev=0;
        int i=1;
        long current = 0;
        if (n == 1)
        {
            current = 1;
        }

        while( i<n){
           current=prev+secprev;
           secprev=prev;
           prev=current;
           i++;
    }

    return current;

    }

}

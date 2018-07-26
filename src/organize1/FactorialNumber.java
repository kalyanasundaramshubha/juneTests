package organize1;

public class FactorialNumber {
//using recursive method
    public static int factorialNum(int num)
    {
        if(num<=0)
        {
            return 0;
        }
        else if(num==1)
        {
            return 1;
        }
        else
        {
            int factorial=num*factorialNum(num-1);
            return factorial;
        }

    }
    //without using recursion
    public static int factorialNumber(int num)
    {
        int factorial=1;
        if(num<=0)
        {
            return 0;
        }
        for(int i=1;i<=num;i++)
        {
            factorial=factorial*i;
        }
        return factorial;
    }
}

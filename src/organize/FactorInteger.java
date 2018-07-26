package organize;

import java.util.ArrayList;

public class FactorInteger {


    public static int[] factorsOfInteger(int num)
    {
        convertArrayListtoArray altoa=new convertArrayListtoArray();
        ArrayList <Integer> factors=new ArrayList<Integer>();
        if(num<=0)
        {
            throw new NumberFormatException();
        }
        for(int i=1;i<=num;i++)
        {
            if(num%i==0){
                factors.add(i);
            }
        }
        return altoa.convertALtoA(factors);

    }
}

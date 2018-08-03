//import static java.lang.Math.*;

public class mathOperations {
    public static void main(String[]arguments){
        int a=5;
        int b = 6;
        double c=7.896;
        int[] arr={1,1,0,-1,-1};
        int product=Math.multiplyExact(a,b);
        double exponent = Math.exp(b);
        int absolute= Math.abs(a);
        double floordivision=Math.floorDiv(b,a);
        System.out.println(" "+product+"\n "+exponent+"\n "+absolute+"\n"+floordivision);
        plusMinus(arr);
    }

    public static void plusMinus(int[] a) {
        double negative=0, positive=0, zero=0;
        for(int i=0;i<a.length;i++)
        {

            if(a[i]<0)
            {
                negative++;
            }
            else if(a[i]>0)
            {
                positive++;

            }
            else
            {
                zero++;
            }

        }
        double positivefraction = (double) positive/a.length;


        double negativefract=negative/a.length;
        double zerofract=zero/a.length;
        System.out.println(positivefraction);
        System.out.println(negativefract);
        System.out.println(zerofract);


    }
}

//import static java.lang.Math.*;

public class mathOperations {
    public static void main(String[]arguments){
        int a=5;
        int b = 6;
        double c=7.896;
        int product=Math.multiplyExact(a,b);
        double exponent = Math.exp(b);
        int absolute= Math.abs(a);
        double floordivision=Math.floorDiv(b,a);
        System.out.println(" "+product+"\n "+exponent+"\n "+absolute+"\n"+floordivision);
    }
}

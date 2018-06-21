

public class multipleOfFour {

    public static boolean product(int number)
    {
        if(number%4==0){
            return true;
        }else
        {
            return false;
        }
    }


    public static void main(String[]arguments){
        for(int i=0;i<100;i++){
            if(product(i)==true){
                System.out.println("multiple of four is : "+i);

            }
        }
    }
}

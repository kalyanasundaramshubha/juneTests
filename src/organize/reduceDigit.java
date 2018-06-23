package organize;

public class reduceDigit{
    int length;
    public int getLengthofDigit(int number){
         length=(int) Math.log10(number)+1;
     return length;
    }

    public int redtosingleDigit(int num){
        reduceDigit rd=new reduceDigit();
        int add=0;
        //int length=(int) Math.log10(num)+1;
        while(length!=0) {
            int quo = (int) Math.floorDiv(num, 10);
            int rem = (int) Math.floorMod(num, 10);
             num = quo + rem;
             length--;
        }

             add = num;

        return add;
    }
}

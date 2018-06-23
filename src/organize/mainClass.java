package organize;

import java.util.ArrayList;
import java.util.Scanner;

public class mainClass {
    public static void main(String[]args){
        int[] ar1={8,0,1,0,-1,6,0,9} ;

        rearrangeArray ra=new rearrangeArray();
        int[] ar2= ra.rearrange(ar1);
        for(int i=0; i<ar2.length;i++){
            System.out.println(ar2[i] );
        }

        addArrayList  al= new addArrayList();
        ArrayList<String>std=new ArrayList<String>();
        ArrayList <String> students = al.addtoarray(std);
        for(int i=0; i<students.size();i++){
            System.out.println(students.get(i));
        }

        //al.removeFromarray(std);

        reduceDigit red=new reduceDigit();
        System.out.println("Enter the number that you want reduce to single digit");
        Scanner sc=new Scanner(System.in);
        int sum=red.redtosingleDigit(sc.nextInt());
        System.out.println("One digit sum is: "+sum);
    }
}

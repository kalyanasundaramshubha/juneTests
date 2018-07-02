package organize1;

import java.util.Arrays;

public class reverseString {

    public static String reverseStr(String name){
        String rev;
        char[] narr=name.toCharArray();
        /*char[] std= new char[narr.length];
        for(int i=narr.length-1;i>=0;i--){
            std[(narr.length-1)-i] = narr[i];
        }
        rev = Arrays.toString(std);
        return rev;*/

        int j=narr.length-1;
        for(int i=0;i<j;i++){
            char save=narr[i];

            narr[i]=narr[j];
            narr[j]=save;
            j--;
        }
        rev=Arrays.toString(narr);
        return rev;
    }
}

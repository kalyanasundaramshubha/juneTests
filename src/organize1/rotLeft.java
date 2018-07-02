package organize1;

//import org.testng.annotations.Test;

//@Test
public class rotLeft {
    public static int[] rotleft(int[]a, int d){

        int len=a.length;
        for(int k=0;k<d;k++){
            int save=a[len-1];
            a[len-1]=a[0];
            for (int i=0;i<len-1;i++) {

                if (i == (len - 2)) {
                    a[i] = save;
                } else {
                    a[i] = a[i + 1];
                }
            }
        }
        return a;
    }
}

package organize1;

public class InsertElementinArray {

    public static int[] insertElement(int [] a, int NA, int NB, int addel)
    {
        int  arrnew []=new int[a.length+1];
        int diff;

        for(int i=0; i<a.length;i++)
        {
            if(a[i]==NA && a[i+1]==NB)
            {
                arrnew[i+1]=addel;

            }

        }


        for(int i=arrnew.length;i<a.length;i++)
        {
            arrnew[i]=a[i-1];
        }
        return arrnew;

    }
}

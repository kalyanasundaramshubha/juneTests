package organize1;

public class InsertElementinArray {

    public static String insertElement(int [] a, int NA, int NB, int addel)
    {

        StringBuilder sb=new StringBuilder();
        sb.append(a[0]);
        for(int i=1; i<a.length;i++)
        {
            if(a[i]==NB && a[i-1]==NA)
            {
                sb.append(addel);

            }
            sb.append(a[i]);
        }
        return sb.toString();

    }
    public static int[] insertEle(int[] a, int NA, int NB, int addel)
    {
        int[] anew=new int [a.length+1];
        anew[0]=a[0];
        int j=1;
        int insert=0;
        for(int i=1; i<a.length;i++)
        {
                if (a[i] == NB && a[i - 1] == NA && insert==0)
                {
                    anew[j] = addel;
                    anew[j + 1] = a[i];
                    j = j + 2;
                    insert=insert+1;
                }
                else
                {
                    anew[j] = a[i];
                    j++;
                }


        }
        return anew;
    }
}

package organize1;

public class InsertElementinArray {

    public static String insertElement(int [] a, int NA, int NB, int addel)
    {

        int diff;
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
}

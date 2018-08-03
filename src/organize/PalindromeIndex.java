package organize;

public class PalindromeIndex {

    public static int palindromeIndex(String s) {
        //String str="";
        int low=0,high=s.length()-1, save=0;

        while(low<high)
        {
            if(s.charAt(low)==s.charAt(high))
            {
                low++;
                high--;
            }
            else
            {
                if(s.charAt(low)==s.charAt(high-1))
                {
                    save=high;
                    high--;

                }
                else if(s.charAt(low+1)==s.charAt(high))
                {
                    save=low;
                    low++;
                }
                else
                {
                    return -1;
                }
            }
        }
        return save;



    }
}

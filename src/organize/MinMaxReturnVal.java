package organize;

public class MinMaxReturnVal {

    public int minsum;
    public int maxsum;

    @Override
    public boolean equals(Object obj) {
        MinMaxReturnVal mmrv = (MinMaxReturnVal) obj;
        if (mmrv.minsum == this.minsum && mmrv.maxsum == maxsum) {
            return true;
        }

        return false;


    }

    public static boolean TestHelperEquals(MinMaxReturnVal a, MinMaxReturnVal b)
    {
        return (a.maxsum == b.maxsum && a.minsum == b.minsum );
    }

}

package organize;

public class BuySellMaxProfit {

    public static int maxProfitStock(int[]price)
    {
        int maxprofit=0;
        for(int buy=0;buy<price.length;buy++)
        {
            for(int sell=buy+1;sell<price.length;sell++)
            {
                if(price[sell]-price[buy]>maxprofit)
                {
                    maxprofit=price[sell]-price[buy];
                }
            }
        }
        return maxprofit;
    }
}

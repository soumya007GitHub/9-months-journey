import java.lang.Math;

public class BuyAndSellStock {

    public static int func(int array[]){
        int buyPrice = array[0];
        int profit = 0;
        int maxProfit = 0;
        for(int i = 1; i<array.length; ++i){
            buyPrice = Math.min(buyPrice, array[i]);
            profit = array[i] - buyPrice;
            if(profit > maxProfit){
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int days1[] = {7, 6, 4,  3, 1};
        int days2[] = {7, 1, 5, 3, 6, 4};
        
        int result1 = func(days1);
        int result2 = func(days2);

        System.out.println(result1);
        System.out.println(result2);
    }
}

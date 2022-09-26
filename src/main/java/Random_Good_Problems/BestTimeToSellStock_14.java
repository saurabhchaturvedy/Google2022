package main.java.Random_Good_Problems;

public class BestTimeToSellStock_14 {


    private static int maxProfit(int[] stockPrices) {
        int minPrice = stockPrices[0];
        int maxProfit = 0;

        for (int price : stockPrices) {
            int currentProfit = price - minPrice;
            minPrice = Math.min(price, minPrice);
            maxProfit = Math.max(maxProfit, currentProfit);
        }

        return maxProfit;
    }

    public static void main(String[] args) {

        int[] stockPrices = {9, 2, 4, 3, 8, 5};
        System.out.println(maxProfit(stockPrices));
    }
}

// you are given an array prices where prices[i] is the price of a given stock on the ith day .you want to maximize
// your profit by choosing a single day to by one stock and choosing a diffrent day in the future to sell that stock.
// return the maximize profit you can achieve from this transaction . if you cannot achieve any profit return 0

import java.util.*;

public class BuyAndSellStock {
    public static int buyAndSellStock(int prices[]) {
        int n = prices.length;

        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < n; i++) {
            if (buyPrice < prices[i]) { //profit
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buyAndSellStock(prices));
    }
}

// output 5

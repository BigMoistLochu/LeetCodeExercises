package org.example.ArraysAndHashing;

import java.util.Arrays;

public class BestTimeToBuyAndSellStockEasy {

    public static void main(String[] args) {
        int[] list = {7,1,2,3,6,4};
        System.out.println(maxProfit(list));
    }

    //You are given an array prices where prices[i] is the price of a given stock on the ith day.
    //
    //You want to maximize your profit by choosing a single day to buy one stock and choosing a different
    //day in the future to sell that stock.
    //
    //Return the maximum profit you can achieve from this transaction.
    // If you cannot achieve any profit, return 0.
    //Example 1:
    // 7>2 nadpisz  2>1 tak nadpisz, 1>3 nie
    //Input: prices = [7,2,1,3,6,4]
    //Output: 5
    //Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
    //Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

    public static int maxProfit(int[] prices) {

        int min = prices[0];
        int diff,overall = 0;
        for (int i = 1; i < prices.length; i++){
            if(min>prices[i]){
                min = prices[i];
            }
            diff = prices[i] - min;
            if(overall<diff)
            {
                overall = diff;
            }
        }
        return overall;
    }
}

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

        //z poczatku szukasz najmniejszej wartosci
        //5-1=4 zapisujesz aktualny profit jako najwiekszy
        //3-1=2 2>4 false nie nadpisujesz
        //wskaznik na najmniejsza liczbe 7>1? tak-> wskaz na 1
        //najlatwiej to zrobic to tak znalesc najmniejsza liczbe w liscie, po czym od jej prawej strony iterowac
        //indexTheSmallestNumber=?
        //for i=thesmalest ...
        //najwiekszaLiczba =
        int min = prices[0];
        int indexMin = 0;
        for (int i = 1; i < prices.length; i++){
            if(min>prices[i]){
                min = prices[i];
                indexMin = i;
            }
        }

        if(indexMin==prices.length)
        {
            return 0;
        }
        //mamy index najmniejszej liczby
        //teraz zaczynamy szukac od tego indexu najwiekszej roznicy
//        {7,1,2,3,6,4} 2-1
        int diff = 0;
        for (int i = indexMin+1; i < prices.length ; i++) {
            if(prices[i]-prices[indexMin]<diff)
            {
                diff = prices[indexMin]-prices[i];
            }

        }

        return diff;
    }
}

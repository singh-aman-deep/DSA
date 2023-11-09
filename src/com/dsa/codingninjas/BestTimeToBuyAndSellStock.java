package com.dsa.codingninjas;

/**
 * 09 Nov 2023
 * <p>
 * Best time to buy and sell stock
 * <p>
 * You are given an array of integers 'prices' of size n. , where ‘prices[i]’ is the price of a given stock on an ‘i’-th day.
 * You want to maximize the profit by choosing a single day to buy one stock and a different day to sell that stock.
 * Please note that you can’t sell a stock before you buy one.
 * Return the maximum profit you can achieve from this transaction.
 * <p>
 * Example:
 * <p>
 * Input: ‘prices’ =[7, 1, 5, 4, 3, 6]
 * <p>
 * Output: 5
 * <p>
 * Explanation: Purchase stock on day two, where the price is one, and sell it on day six, where the price is 6, profit = 6 - 1 = 5.
 * <p>
 * Hence we return 5.
 */
public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
//        int[] prices = {7, 1, 5, 4, 3, 6};
//        int[] prices = {7, 7, 9, 8, 6, 7, 6, 10, 5};
        int[] prices = {6, 9};
        System.out.println(bestTimeToBuyAndSellStockO(prices));
    }

    public static int bestTimeToBuyAndSellStock1(int[] prices) {
        int n = prices.length;
        int lowestEle = Integer.MAX_VALUE;
        int lowestPos = 0;
        int highestEle = Integer.MIN_VALUE;
        int highestPos = 0;
        for (int i = lowestPos; i < n; i++) {
            if (prices[i] > highestEle) {
                highestEle = prices[i];
                highestPos = i;
            }
        }

        for (int i = 0; i < highestPos; i++) {
            if (prices[i] < lowestEle) {
                lowestEle = prices[i];
                lowestPos = i;
            }

        }


        return highestEle - lowestEle;
    }

    public static int bestTimeToBuyAndSellStock2(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;
        for (int i = n - 1; i >= 0; i--) {
            int profit = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (prices[j] < prices[i]) {
                    profit = prices[i] - prices[j];
                    if (profit > maxProfit) {
                        maxProfit = profit;
                    }
                }

            }

        }
        return maxProfit;
    }

    /**
     * Time complexity: O(n^2)
     * Space Complexity: O(1)
     */
    public static int bestTimeToBuyAndSellStockBF(int[] prices) {
        int maxPro = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] > prices[i]) {
                    maxPro = Math.max(prices[j] - prices[i], maxPro);
                }
            }
        }
        return maxPro;
    }

    /**
     * Time complexity: O(n)
     * <p>
     * Space Complexity: O(1)
     */
    public static int bestTimeToBuyAndSellStockO(int[] prices) {
        int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;
        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxPro = Math.max(maxPro, price - minPrice);
        }
        return maxPro;
    }
}

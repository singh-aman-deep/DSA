package com.dsa.gfg;

/**
 * 27 Oct 2023
 * <p>
 * Sum of Series
 * <p>
 * Write a program to find the sum of the given series 1+2+3+ . . . . . .(N terms)
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 1
 * Output: 1
 * Explanation: For n = 1, sum will be 1.
 */
public class SumOfSeries {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(seriesSum(n));
    }

    static long seriesSum(int n) {
        return (long) ((double) n / 2 * (n + 1));
    }
}

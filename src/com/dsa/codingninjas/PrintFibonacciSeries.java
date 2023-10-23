package com.dsa.codingninjas;

import java.util.Arrays;

/**
 * 23 Oct 2023
 * <p>
 * Print Fibonacci Series
 * <p>
 * <p>
 * Problem Statement: Given an integer N. Return the Fibonacci series up to the Nth term.
 * <p>
 * Example 1:
 * Input: N = 5
 * Output: 0 1 1 2 3 5
 * Explanation: 0 1 1 2 3 5 is the fibonacci series up to 5th term.(0 based indexing)
 */
public class PrintFibonacciSeries {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(generateFibonacciNumbers(n)));
    }

    public static int[] generateFibonacciNumbers(int n) {
        int temp[] = new int[n];
        febo(n, 0, temp);
        return temp;
    }

    public static void febo(int n, int i, int temp[]) {
        if (i == n) {
            return;
        } else {
            if (i == 0) {
                temp[i] = 0;
            } else if (i == 1) {
                temp[i] = 1;
            } else {
                temp[i] = temp[i - 1] + temp[i - 2];
            }
            febo(n, i + 1, temp);
        }
    }
}
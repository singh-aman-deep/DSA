package com.dsa.codingninjas;

import java.util.Arrays;

/**
 * 22 Oct 2023
 * <p>
 * 1 to N Without Loop
 * <p>
 * You are given an integer n
 * Your task is to return an array containing integers from 1 to ‘n’ (in increasing order) without using loops.
 * <p>
 * Input: ‘n’ = 5
 * <p>
 * Output: 1 2 3 4 5
 * <p>
 * Explanation: An array containing integers from ‘1’ to ‘n’ is [1, 2, 3, 4, 5].
 */
public class OnetoNWithoutLoop {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(printNos(n)));
    }

    public static int[] printNos(int x) {
        int[] a = new int[x];
        return recur(x, a);
    }

    public static int[] recur(int x, int[] a) {
        if (x == 0) return a;
        int i = x;
        a[i - 1] = x;
        return recur(x - 1, a);
    }
}

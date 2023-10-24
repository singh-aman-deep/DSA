package com.dsa.gfg;

/**
 * 24 Oct 2023
 *
 * Sum of Array
 *
 * Given an integer array Arr[] of size N. The task is to find sum of it.
 *
 * Example 1:
 *
 * Input:
 * N = 4
 * Arr[] = {1, 2, 3, 4}
 * Output: 10
 * Explanation: 1 + 2 + 3 + 4 = 10.
 */
public class SumofArray {
    public static void main(String[] args) {
        int n = 4;
        int arr[] = {1, 2, 3, 4};
        System.out.println(sum(arr,n));
    }
    static int sum(int arr[], int n) {
        int output = 0;
        for (int i = 0; i < n; i++) {
            output = output + arr[i];
        }
        return output;
    }
}

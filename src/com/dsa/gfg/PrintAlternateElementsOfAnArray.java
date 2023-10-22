package com.dsa.gfg;

/**
 * 20 Oct 2023
 * <p>
 * Print alternate elements of an array
 * <p>
 * <p>
 * You are given an array A of size N. You need to print elements of A in alternate order (starting from index 0).
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 4
 * A[] = {1, 2, 3, 4}
 * Output:
 * 1 3
 */
public class PrintAlternateElementsOfAnArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        int n = 4;
//        int[] arr = new int[]{1, 2, 3, 4, 5};
//        int n = 5;
        print(arr, n);

    }

    public static void print(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}

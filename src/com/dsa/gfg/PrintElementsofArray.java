package com.dsa.gfg;

/**
 * 25 Oct 2023
 * Print Elements of Array
 * <p>
 * Given an array Arr of size N, print all its elements.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 5
 * Arr[] = {1, 2, 3, 4, 5}
 * Output: 1 2 3 4 5
 */
public class PrintElementsofArray {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {1, 2, 3, 4, 5};
        printArray(arr, n);

    }

    static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

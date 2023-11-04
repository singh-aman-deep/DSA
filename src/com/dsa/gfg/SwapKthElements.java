package com.dsa.gfg;

import java.util.Arrays;

/**
 * 04 Nov 2023
 *
 * Swap kth elements
 *
 * Given an array Arr of size N, swap the Kth element from beginning with Kth element from end.
 *
 * Example 1:
 *
 * Input:
 * N = 8, K = 3
 * Arr[] = {1, 2, 3, 4, 5, 6, 7, 8}
 * Output: 1 2 6 4 5 3 7 8
 * Explanation: Kth element from beginning is
 * 3 and from end is 6.
 */
public class SwapKthElements {
    public static void main(String[] args) {
        int n = 8; int k = 3;
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        swapKth(arr,n,k);
        System.out.println(Arrays.toString(arr));
    }

    static void swapKth(int arr[], int n, int k) {
// Swapping the kth element from the beginning and kth element from the end
        int tmp = arr[k - 1];
        arr[k - 1] = arr[n - k];
        arr[n - k] = tmp;    }
}

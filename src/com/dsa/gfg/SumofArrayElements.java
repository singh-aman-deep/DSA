package com.dsa.gfg;

/**
 * 21 Oct 2023
 * <p>
 * Sum of Array Elements
 * <p>
 * Given an integer array arr of size n, you need to sum the elements of arr.
 */
public class SumofArrayElements {

    public static void main(String[] args) {
        int n = 3;
        int arr[] = new int[]{3, 2, 1};
        System.out.println(sumElement(arr, n));

    }

    public static int sumElement(int arr[], int n) {
        int output = 0;
        for (int i = 0; i < n; i++) {
            output = output + arr[i];
        }
        return output;
    }
}

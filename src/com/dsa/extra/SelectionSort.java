package com.dsa.extra;

import java.util.Arrays;

/**
 * 25 Oct 2023
 * Striver
 * Selection Sort Algorithm
 * Problem Statement: Given an array of N integers, write a program to implement the Selection sorting algorithm.
 * <p>
 * Examples:
 * <p>
 * Example 1:
 * Input: N = 6, array[] = {13,46,24,52,20,9}
 * Output: 9,13,20,24,46,52
 * Explanation: After sorting the array is: 9, 13, 20, 24, 46, 52
 *
 * Time complexity: O(N2), (where N = size of the array), for the best, worst, and average cases.
 * Reason: If we carefully observe, we can notice that the outer loop, say i, is running from 0 to n-2 i.e. n-1 times, and for each i, the inner loop j runs from i to n-1. For, i = 0, the inner loop runs n-1 times, for i = 1, the inner loop runs n-2 times, and so on. So, the total steps will be approximately the following: (n-1) + (n-2) + (n-3) + ……..+ 3 + 2 + 1. The summation is approximately the sum of the first n natural numbers i.e. (n*(n+1))/2. The precise time complexity will be O(n2/2 + n/2). Previously, we have learned that we can ignore the lower values as well as the constant coefficients. So, the time complexity is O(n2). Here the value of n is N i.e. the size of the array.
 *
 * Space Complexity: O(1)
 */
public class SelectionSort {

    public static void main(String[] args) {
        int n = 6;
        int arr[] = new int[]{13, 46, 24, 52, 20, 9};
        System.out.println(Arrays.toString(selectionSort(arr, n)));

    }

    public static int[] selectionSort(int[] arr, int n) {
        for (int i = 0; i <= n - 2; i++) {
            int min=i;
            for (int j = i+1; j < n; j++) {
                if (arr[j]<arr[min]){
                    min=j;
                }
            }
            //swap
            int temp= arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
}

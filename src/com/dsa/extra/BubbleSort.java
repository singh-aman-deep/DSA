package com.dsa.extra;

/**
 * 25 Oct 2023
 * Striver||Coding Ninjas
 * <p>
 * Bubble Sort Algorithm
 * Problem Statement: Given an array of N integers, write a program to implement the Bubble Sorting algorithm.
 * <p>
 * Example 1:
 * Input: N = 6, array[] = {13,46,24,52,20,9}
 * Output: 9,13,20,24,46,52
 * Explanation: After sorting we get 9,13,20,24,46,52
 * <p>
 * Time Complexity: O(N2) for the worst and average cases and O(N) for the best case. Here, N = size of the array.
 * <p>
 * Space Complexity: O(1)
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = new int[]{13, 46, 24, 52, 20, 9};
        int n = arr.length;
        bubbleSort(arr, n);
    }

    public static void bubbleSort(int[] arr, int n) {
        for (int i = n - 1; i >= 0; i--) {
            int didSwap = 0;

            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    didSwap = 1;
                }
            }
            if (didSwap == 0) {
                break;
            }
        }
        System.out.println("After bubble sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

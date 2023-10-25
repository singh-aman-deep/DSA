package com.dsa.codingninjas;

/**
 * 25 Oct 2023
 * <p>
 * Selection Sort
 * <p>
 * Sort the given unsorted array arr of size n  in non-decreasing order using the selection sort algorithm.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{13, 46, 24, 52, 20, 9};
        selectionSort(arr);
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            //swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        /*for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }*/
    }
}

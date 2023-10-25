package com.dsa.extra;

/**
 * 25 Oct 2023
 * Striver||Coding Ninjas
 * <p>
 * Insertion Sort Algorithm
 * Problem Statement: Given an array of N integers, write a program to implement the Insertion sorting algorithm.
 * <p>
 * <p>
 * Example 1:
 * Input: N = 6, array[] = {13,46,24,52,20,9}
 * Output: 9,13,20,24,46,52
 * Explanation:
 * After sorting the array is: 9,13,20,24,46,52
 * <p>
 * Time complexity: O(N2), (where N = size of the array), for the worst, and average cases.
 * Reason: If we carefully observe, we can notice that the outer loop, say i, is running from 0 to n-1 i.e. n times, and for each i, the inner loop j runs from i to 1 i.e. i times. For, i = 1, the inner loop runs 1 time, for i = 2, the inner loop runs 2 times, and so on. So, the total steps will be approximately the following: 1 + 2 + 3 +……+ (n-2) + (n-1). The summation is approximately the sum of the first n natural numbers i.e. (n*(n+1))/2. The precise time complexity will be O(n2/2 + n/2). Previously, we have learned that we can ignore the lower values as well as the constant coefficients. So, the time complexity is O(n2). Here the value of n is N i.e. the size of the array.
 * <p>
 * Space Complexity: O(1)
 * <p>
 * Best Case Time Complexity:
 * <p>
 * The best case occurs if the given array is already sorted. And if the given array is already sorted, the outer loop will only run and the inner loop will run for 0 times. So, our overall time complexity in the best case will boil down to O(N), where N = size of the array.
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = new int[]{13, 46, 24, 52, 20, 9};
        int n = arr.length;
        insertionSort2(arr, n);
    }

    public static void insertionSort(int[] arr, int size) {
        for (int i = 0; i <= size - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }

        }

        System.out.println("After insertion sort: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void insertionSort2(int[] arr, int size) {
        //Your code goes here
        solve(arr, size);
        System.out.println("After insertion sort: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void solve(int[] arr, int n) {

        if (n <= 1) {
            return;
        }

        solve(arr, n - 1);

        int val = arr[n - 1];
        int j = n - 2;

        while (j >= 0 && arr[j] > val) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = val;
    }
}

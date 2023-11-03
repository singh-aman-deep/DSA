package com.dsa.striver;

import java.util.Arrays;

/**
 * 23 Oct 2023
 * <p>
 * Reverse a given Array Recursive method
 * <p>
 * Problem Statement: You are given an array. The task is to reverse the array and print it.
 * <p>
 * Example 1:
 * Input: N = 5, arr[] = {5,4,3,2,1}
 * Output: {1,2,3,4,5}
 */
public class ReverseAGivenArray {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = {5, 4, 3, 2, 1};
        reverseArray(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArray(int[] arr, int start, int end) {
        if (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            reverseArray(arr, start + 1, end - 1);
        }
    }
}

package com.dsa.codingninjas;

/**
 * 28 Oct 2023
 *
 * Largest Element in the Array
 *
 * Problem Statement: Given an array, we have to find the largest element in the array.
 *
 * Example 1:
 * Input: arr[] = {2,5,1,3,0};
 * Output: 5
 * Explanation: 5 is the largest element in the array.
 */
public class LargestElementInTheArray {
    public static void main(String[] args) {
        int [] arr= new int[]{10,30,6,4,20};
        int n=arr.length;
        System.out.println(largestElement(arr,n));

    }

    static int largestElement(int[] arr, int n) {
        int max= arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        return max;
    }
}

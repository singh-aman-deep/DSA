package com.dsa.codingninjas;

/**
 * 29 Oct 2023
 * <p>
 * Check Sorted Array
 * <p>
 * Problem Statement: Given an array of size n,
 * write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not.
 * If the array is sorted then return True, Else return False.
 * <p>
 * Example 1:
 * Input: N = 5, array[] = {1,2,3,4,5}
 * Output: True.
 * Explanation: The given array is sorted i.e Every element in the array is smaller than or equals to its next values, So the answer is True.
 * <p>
 * Note: Two consecutive equal values are considered to be sorted.
 */
public class CheckSortedArray {

    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[]{5, 0, 0, 0, 1};
        System.out.println(isSorted(n, arr));
    }

    public static int isSorted(int n, int[] a) {
        int flag = 1;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] >= a[i + 1] && a[i] != a[i + 1]) {
                flag = 0;
                break;
            }
        }

        return flag;
    }
}

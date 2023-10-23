package com.dsa.codingninjas;

import java.util.Arrays;

/**
 * 23 Oct 2023
 *
 * Reverse an Array
 *
 * Problem Statement: You are given an array. The task is to reverse the array and print it.
 *
 * Example 1:
 * Input: N = 5, arr[] = {5,4,3,2,1}
 * Output: {1,2,3,4,5}
 */
public class ReverseAnArray {
    public static void main(String[] args) {
        int n =5;
        int [] arr=new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(reverseArray(n,arr)));
    }

    public static int[] reverseArray(int n, int []nums) {
        int[] reverseArr = new int[n];
        for (int i = 0; i < n; i++) {
            reverseArr[i] = nums[n - i - 1];
        }
        return reverseArr;

    }
}

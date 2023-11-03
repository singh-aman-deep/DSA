package com.dsa.codingninjas;

import java.util.Arrays;

/**
 * 31 Oct 2023
 * <p>
 * Move Zero's to End
 * <p>
 * Problem Statement: You are given an array of integers,
 * your task is to move all the zeros in the array to the end of the array and move non-negative
 * integers to the front by maintaining their order.
 * <p>
 * Example 1:
 * Input: 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
 * Output: 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
 * Explanation: All the zeros are moved to the end and non-negative integers are moved to front by maintaining order
 */
public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 0, 2, 3};
        int n = arr.length;
        System.out.println(Arrays.toString(moveZerosOptimal(n, arr)));
    }


    public static int[] moveZeros(int n, int[] a) {
        int[] tempArr = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                tempArr[j] = a[i];
                j++;
            }
        }

        return tempArr;
    }

    public static int[] moveZerosOptimal(int n, int[] a) {
        int j = -1;
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }
        if (j == -1) {
            return a;
        }

        for (int i = j + 1; i < n; i++) {
            if (a[i] != 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }

        return a;
    }
}

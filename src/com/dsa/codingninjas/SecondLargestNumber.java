package com.dsa.codingninjas;

import java.util.Arrays;

/**
 * 28 Oct 2023
 * <p>
 * Second Largest Number
 * <p>
 * You have been given an array  a of n  unique non-negative integers.
 * Find the second largest and second smallest element from the array.
 * Return the two elements (second largest and second smallest) as another array of size 2.
 */
public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int n = arr.length;
        System.out.println(Arrays.toString(getSecondOrderElements(n, arr)));
    }

    public static int[] getSecondOrderElements(int n, int[] a) {
        int[] arrOutput = new int[2];
        int firstL = Integer.MIN_VALUE;
        int secondL = Integer.MIN_VALUE;
        int firstS = Integer.MAX_VALUE;
        int secondS = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (a[i] > firstL) {
                secondL = firstL;
                firstL = a[i];
            } else if (a[i] > secondL && a[i] != firstL) {
                secondL = a[i];
            }

            if (a[i] < firstS) {
                secondS = firstS;
                firstS = a[i];
            } else if (a[i] < secondS && a[i] != firstS) {
                secondS = a[i];
            }
        }
        arrOutput[0] = secondL;
        arrOutput[1] = secondS;
        return arrOutput;
    }
}

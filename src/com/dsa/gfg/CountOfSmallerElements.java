package com.dsa.gfg;

/**
 * 07 Nov 2023
 * <p>
 * Count of smaller elements
 * <p>
 * Given an sorted array A of size N. Find number of elements which are less than or equal to given element X.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 6
 * A[] = {1, 2, 4, 5, 8, 10}
 * X = 9
 * Output:
 * 5
 */
public class CountOfSmallerElements {
    public static void main(String[] args) {
        int x = 9;
        long[] a = {1, 2, 4, 5, 8, 10};
        int n = a.length;
        System.out.println(countOfElements(a, n, x));

    }

    public static long countOfElements(long arr[], long n, long x) {
        long count = 0;
        for (long l : arr) {
            if (l <= x) {
                count++;
            }
        }
        return count;
    }
}

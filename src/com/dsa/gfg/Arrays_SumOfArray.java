package com.dsa.gfg;

/**
 * 05 Nov 2023
 * <p>
 * Arrays (Sum of array)
 * <p>
 * Given an array of N integers. Your task is to print the sum of all of the integers.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * 4
 * 1 2 3 4
 * Output:
 * 10
 */
public class Arrays_SumOfArray {
    public static void main(String[] args) {

        long[] arr = {1, 2, 3, 4};
        long n = arr.length;

        System.out.println(getSum(arr, n));
    }

    public static long getSum(long a[], long n) {
        long sum = 0L;

        for (long l : a) {
            sum += l;
        }
        return sum;
    }
}

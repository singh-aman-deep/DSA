package com.dsa.gfg;

import java.util.Arrays;

/**
 * 23 Oct 2023
 * <p>
 * Perfect Arrays
 * <p>
 * Given an array of size N and you have to tell whether the array is perfect or not.
 * An array is said to be perfect if its reverse array matches the original array.
 * If the array is perfect then return True else return False.
 * <p>
 * Example 1:
 * <p>
 * Input : Arr[] = {1, 2, 3, 2, 1}
 * Output : PERFECT
 * Explanation:
 * Here we can see we have [1, 2, 3, 2, 1]
 * if we reverse it we can find [1, 2, 3, 2, 1]
 * which is the same as before.
 * So, the answer is PERFECT.
 * <p>
 * Example 2:
 * <p>
 * Input : Arr[] = {1, 2, 3, 4, 5}
 * Output : NOT PERFECT
 */
public class PerfectArrays {

    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 2, 1};
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        System.out.println(IsPerfect(arr, n));
    }

    public static boolean IsPerfect(int a[], int n) {
        int[] reverseArr = new int[n];
        for (int i = 0; i < n; i++) {
            reverseArr[i] = a[n - i - 1];
        }
        return Arrays.equals(a, reverseArr);
    }

    class Solution {

        // Function to check if array is perfect or not
        public boolean IsPerfect(int a[], int n) {
            // Checking elements from both ends of the array
            for (int i = 0; i < n / 2; i++) {
                // If any two elements are not equal, array is not perfect
                if (a[n - i - 1] != a[i])
                    return false;
            }
            // If all elements checked and they are equal, array is perfect
            return true;
        }

    }

}

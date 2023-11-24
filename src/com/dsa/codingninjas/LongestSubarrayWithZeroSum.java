package com.dsa.codingninjas;

import java.util.HashMap;

/**
 * 24 Nov 2023
 * <p>
 * Longest Subarray With Zero Sum
 * Ninja is given an array  Arr of size N.. You have to help him find the longest subarray of ‘Arr’, whose sum is 0. You must return the length of the longest subarray whose sum is 0.
 * <p>
 * Example:
 * <p>
 * For N = 5, and Arr = {1, -1, 0, 0, 1},
 * We have the following subarrays with zero sums:
 * {{1, -1}, {1, -1, 0}, {1, -1, 0, 0}, {-1, 0, 0, 1}, {0}, {0, 0}, {0}}
 * Among these subarrays, {1, -1, 0, 0} and {-1, 0, 0, 1} are the longest subarrays with their sum equal to zero. Hence the answer is 4.
 */
public class LongestSubarrayWithZeroSum {
    public static void main(String[] args) {
        int[] arr = {1, -1, 0, 0, 1};
        System.out.println(getLongestZeroSumSubarrayLength(arr));
    }

    /**
     * Time Complexity: O(N), as we are traversing the array only once
     * <p>
     * Space Complexity: O(N), in the worst case we would insert all array elements prefix sum into our hashmap
     */
    public static int getLongestZeroSumSubarrayLength(int[] arr) {
        int n = arr.length;
        // Your code here
        HashMap<Integer, Integer> mpp = new HashMap<Integer, Integer>();

        int maxi = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {

            sum += arr[i];

            if (sum == 0) {
                maxi = i + 1;
            } else {
                if (mpp.get(sum) != null) {

                    maxi = Math.max(maxi, i - mpp.get(sum));
                } else {

                    mpp.put(sum, i);
                }
            }
        }
        return maxi;
    }
}

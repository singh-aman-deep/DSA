package com.dsa.codingninjas;

/**
 * 08 Nov 2023
 * <p>
 * Maximum Subarray Sum
 * <p>
 * You are given an array 'arr' of length 'n' , consisting of integers.
 * A subarray is a contiguous segment of an array. In other words, a subarray can be formed by removing 0 or more integers from the beginning and 0 or more integers from the end of an array.
 * Find the sum of the subarray (including empty subarray)  having maximum sum among all subarrays.
 * <p>
 * The sum of an empty subarray is 0.
 * <p>
 * Example :
 * Input: 'arr' = [1, 2, 7, -4, 3, 2, -10, 9, 1]
 * <p>
 * Output: 11
 * <p>
 * Explanation: The subarray yielding the maximum sum is [1, 2, 7, -4, 3, 2].
 */
public class MaximumSubArraySum {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 7, -4, 3, 2, -10, 9, 1};
        int n = arr.length;
        System.out.println(maxSubarraySumO(arr, n));
    }

    /**
     * Time Complexity: O(N), where N = size of the array.
     * Reason: We are using a single loop running N times.
     * <p>
     * Space Complexity: O(1) as we are not using any extra space.
     */
    private static long maxSubarraySumO(int[] arr, int n) {
        long maxi = Long.MIN_VALUE; // maximum sum
        long sum = 0;

        for (int i = 0; i < n; i++) {

            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;
            }

            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
        }

        // To consider the sum of the empty subarray
        // uncomment the following check:

        if (maxi < 0) maxi = 0;

        return maxi;
    }

    /**
     * Time Complexity: O(N2), where N = size of the array.
     * Reason: We are using two nested loops, each running approximately N times.
     * <p>
     * Space Complexity: O(1) as we are not using any extra space.
     */
    private static long maxSubarraySumB(int[] arr, int n) {
        long maxi = Long.MIN_VALUE; // maximum sum

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                // current subarray = arr[i.....j]

                //add the current element arr[j]
                // to the sum i.e. sum of arr[i...j-1]
                sum += arr[j];

                maxi = Math.max(maxi, sum); // getting the maximum
            }
        }

        return maxi;
    }

    /**
     * Time Complexity: O(N3), where N = size of the array.
     * Reason: We are using three nested loops, each running approximately N times.
     * <p>
     * Space Complexity: O(1) as we are not using any extra space
     */
    public static long maxSubarraySumBF(int[] arr, int n) {
        long maxi = Long.MIN_VALUE; // maximum sum

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // subarray = arr[i.....j]
                int sum = 0;

                //add all the elements of subarray:
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }

                maxi = Math.max(maxi, sum);
            }
        }

        return maxi;
    }
}

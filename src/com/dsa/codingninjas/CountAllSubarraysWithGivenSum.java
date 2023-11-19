package com.dsa.codingninjas;

import java.util.HashMap;
import java.util.Map;

/**
 * 19 Nov 2023
 *
 * Count All Subarrays With Given Sum
 *
 * Problem Statement: Given an array of integers and an integer k, return the total number of subarrays whose sum equals k.
 *
 * A subarray is a contiguous non-empty sequence of elements within an array.
 *
 * Example 1:
 * Input Format: N = 4, array[] = {3, 1, 2, 4}, k = 6
 * Result: 2
 * Explanation: The subarrays that sum up to 6 are [3, 1, 2] and [2, 4].
 */
public class CountAllSubarraysWithGivenSum {

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4};
        int k = 6;
        int cnt = findAllSubarraysWithGivenSum(arr, k);
        System.out.println("The number of subarrays is: " + cnt);
    }

    public static int findAllSubarraysWithGivenSum(int arr[], int s) {
        int n = arr.length; // size of the given array.
        Map<Integer,Integer> mpp = new HashMap();
        int preSum = 0, cnt = 0;

        mpp.put(0, 1); // Setting 0 in the map.
        for (int i = 0; i < n; i++) {
            // add current element to prefix Sum:
            preSum += arr[i];

            // Calculate x-k:
            int remove = preSum - s;

            // Add the number of subarrays to be removed:
            cnt += mpp.getOrDefault(remove, 0);

            // Update the count of prefix sum
            // in the map.
            mpp.put(preSum, mpp.getOrDefault(preSum, 0) + 1);
        }
        return cnt;
    }
}

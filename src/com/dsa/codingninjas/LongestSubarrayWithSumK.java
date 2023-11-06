package com.dsa.codingninjas;

/**
 * 4 Nov 2023
 * <p>
 * Longest Subarray With Sum K
 * <p>
 * Problem Statement: Given an array and a sum k, we need to print the length of the longest subarray that sums to k.
 * <p>
 * Example 1:
 * Input Format: N = 3, k = 5, array[] = {2,3,5}
 * Result: 2
 * Explanation: The longest subarray with sum 5 is {2, 3}. And its length is 2.
 */
public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int k = 3;
        int array[] = {1, 2, 3, 1, 1, 1, 1};
        System.out.println(longestSubarrayWithSumK(array, k));
    }

    public static int longestSubarrayWithSumK(int[] a, long k) {
        int n = a.length; // size of the array.

        int left = 0, right = 0; // 2 pointers
        long sum = a[0];
        int maxLen = 0;
        while (right < n) {
            // if sum > k, reduce the subarray from left
            // until sum becomes less or equal to k:
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }

            // if sum = k, update the maxLen i.e. answer:
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Move forward thw right pointer:
            right++;
            if (right < n) sum += a[right];
        }

        return maxLen;
    }
}

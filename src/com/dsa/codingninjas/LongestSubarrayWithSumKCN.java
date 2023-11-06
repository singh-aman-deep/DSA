package com.dsa.codingninjas;

import java.util.HashMap;
import java.util.Map;

/**
 * 05 Nov 2023
 * <p>
 * Longest Subarray With Sum K.
 * <p>
 * Ninja and his friend are playing a game of subarrays. They have an array ‘NUMS’ of length ‘N’. Ninja’s friend gives him an arbitrary integer ‘K’ and asks him to find the length of the longest subarray in which the sum of elements is equal to ‘K’.
 * Ninjas asks for your help to win this game. Find the length of the longest subarray in which the sum of elements is equal to ‘K’.
 * If there is no subarray whose sum is ‘K’ then you should return 0.
 * <p>
 * Example:
 * <p>
 * Input: ‘N’ = 5,  ‘K’ = 4, ‘NUMS’ = [ 1, 2, 1, 0, 1 ]
 * <p>
 * Output: 4
 * <p>
 * There are two subarrays with sum = 4, [1, 2, 1] and [2, 1, 0, 1]. Hence the length of the longest subarray with sum = 4 is 4.
 */
public class LongestSubarrayWithSumKCN {

    public static void main(String[] args) {
        int k = 4;
        int[] nums = {1, 2, 1, 0, 1};
        System.out.println(getLongestSubarray(nums, k));

    }

    public static int getLongestSubarray(int[] nums, int k) {
        int n = nums.length; // size of the array.
        Map<Integer, Integer> preSumMap = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }
            int rem = sum - k;
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }
        return maxLen;
    }
}

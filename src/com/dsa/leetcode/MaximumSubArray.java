package com.dsa.leetcode;

/**
 * 08 Nov 2023
 * <p>
 * 53. Maximum Subarray
 * <p>
 * Given an integer array nums, find the
 * subarray
 * with the largest sum, and return its sum.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: The subarray [4,-1,2,1] has the largest sum 6.
 */
public class MaximumSubArray {

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));

    }

    public static int maxSubArray(int[] nums) {
        int maxi = Integer.MIN_VALUE; // maximum sum
        int sum = 0;
        int n = nums.length;
        ;

        for (int i = 0; i < n; i++) {

            sum += nums[i];

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

//        if (maxi < 0) maxi = 0;

        return maxi;
    }

}

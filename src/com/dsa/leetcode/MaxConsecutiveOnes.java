package com.dsa.leetcode;

/**
 * 2 Nov 2023
 * <p>
 * 485. Max Consecutive Ones
 * <p>
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
 * Example 2:
 * <p>
 * Input: nums = [1,0,1,1,0,1]
 * Output: 2
 */
public class MaxConsecutiveOnes {

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 1, 1};
//        int[] nums = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int maximum = 0;
        for (int num : nums) {
            if (num == 1) {
                counter++;
                if (maximum < counter) {
                    maximum++;
                }
            } else {
                counter = 0;
            }
        }

        return maximum;
    }
}

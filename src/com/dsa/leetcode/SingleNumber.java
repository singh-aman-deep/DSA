package com.dsa.leetcode;

/**
 * 3 Nov 2023
 * <p>
 * 136. Single Number
 * <p>
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * <p>
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,2,1]
 * Output: 1
 */
public class SingleNumber {

    public static void main(String[] args) {
        int[] nums = {4, 4, 1, 1, 2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int xor = 0;
        for (int j : nums) {
            xor = xor ^ j;
        }
        return xor;
    }
}

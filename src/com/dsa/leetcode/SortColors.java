package com.dsa.leetcode;

import java.util.Arrays;

/**
 * 06 Nov 2023
 * <p>
 * 75. Sort Colors
 * <p>
 * Given an array nums with n objects colored red, white, or blue,
 * sort them in-place so that objects of the same color are adjacent,
 * with the colors in the order red, white, and blue.
 * <p>
 * We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
 * <p>
 * You must solve this problem without using the library's sort function.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 */
public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        sortColorsB(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sortColorsBF(int[] nums) {
        int n = nums.length;
        for (int i = 0; i <= n - 2; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            //swap
            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }
    }

    public static void sortColorsB(int[] nums) {
        int n = nums.length;
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int num : nums) {
            if (num == 0) {
                count0++;
            } else if (num == 1) {
                count1++;
            } else if (num == 2) {
                count2++;
            }
        }
        for (int i = 0; i < count0; i++) {
            nums[i] = 0;
        }
        for (int i = count0; i < (count0 + count1); i++) {
            nums[i] = 1;
        }
        for (int i = (count0 + count1); i < n; i++) {
            nums[i] = 2;
        }
    }
}

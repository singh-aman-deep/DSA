package com.dsa.leetcode;

import java.util.Arrays;

/**
 * 1 Nov 2023
 *
 * 268. Missing Number
 *
 *
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the
 * range that is missing from the array.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [3,0,1]
 * Output: 2
 * Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
 * 2 is the missing number in the range since it does not appear in nums.
 *
 */
public class MissingNumber {

    public static void main(String[] args) {

        int[] x = {0,1,3};
        System.out.print(missingNumber(x));
    }

    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i] != i){
                return i;
            }
        }
        return nums.length;
    }
}

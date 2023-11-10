package com.dsa.leetcode;

import java.util.Arrays;

/**
 * 10 Nov 2023
 * <p>
 * 2149. Rearrange Array Elements by Sign
 * <p>
 * You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.
 * <p>
 * You should rearrange the elements of nums such that the modified array follows the given conditions:
 * <p>
 * Every consecutive pair of integers have opposite signs.
 * For all integers with the same sign, the order in which they were present in nums is preserved.
 * The rearranged array begins with a positive integer.
 * Return the modified array after rearranging the elements to satisfy the aforementioned conditions.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [3,1,-2,-5,2,-4]
 * Output: [3,-2,1,-5,2,-4]
 * Explanation:
 * The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
 * The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
 * Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions.
 */
public class RearrangeArrayElementsBySign {

    public static void main(String[] args) {
        int[] nums = {3, 1, -2, -5, 2, -4};
        System.out.println(Arrays.toString(rearrangeArray(nums)));

    }

    public static int[] rearrangeArray(int[] nums) {
        int[] output = new int[nums.length];
        int posIndex = 0, negIndex = 1;
        for (int num : nums) {

            if (num < 0) {
                output[negIndex] = num;
                negIndex += 2;

            } else {
                output[posIndex] = num;
                posIndex += 2;

            }
        }


        return output;
    }

}

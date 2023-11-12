package com.dsa.leetcode;

/**
 * 07 Nov 2023
 * <p>
 * 169. Majority Element
 * <p>
 * Given an array nums of size n, return the majority element.
 * <p>
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [3,2,3]
 * Output: 3
 * Example 2:
 * <p>
 * Input: nums = [2,2,1,1,1,2,2]
 * Output: 2
 */
public class MajorityElement {

    public static void main(String[] args) {

        int[] nums = {3, 2, 3};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        //size of the given array:
        int n = nums.length;
        int cnt = 0; // count
        int el = 0; // Element

        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = nums[i];
            } else if (nums[i] == el) {
                cnt++;
            } else {
                cnt--;
            }
        }
        //checking if the stored element
        // is the majority element:
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == el) cnt1++;
        }

        if (cnt1 > (n / 2)) return el;
        return -1;
    }
}

package com.dsa.leetcode;

import java.util.Arrays;

/**
 * 15 Nov 2023
 * 128. Longest Consecutive Sequence
 *
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
 *
 * You must write an algorithm that runs in O(n) time.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [100,4,200,1,3,2]
 * Output: 4
 * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
 *
 */
public class LongestConsecutiveSequence {

    public static void main(String[] args) {
       int [] nums = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));


    }

    /**
     * Time Complexity: O(NlogN) + O(N), N = size of the given array.
     * Reason: O(NlogN) for sorting the array. To find the longest sequence, we are using a loop that results in O(N).
     *
     * Space Complexity: O(1), as we are not using any extra space to solve this problem.
     */
    public static int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;

        //sort the array:
        Arrays.sort(nums);
        int lastSmaller = Integer.MIN_VALUE;
        int cnt = 0;
        int longest = 1;

        //find longest sequence:
        for (int i = 0; i < n; i++) {
            if (nums[i] - 1 == lastSmaller) {
                //nums[i] is the next element of the
                //current sequence.
                cnt += 1;
                lastSmaller = nums[i];
            } else if (nums[i] != lastSmaller) {
                cnt = 1;
                lastSmaller = nums[i];
            }
            longest = Math.max(longest, cnt);
        }
        return longest;
    }
}

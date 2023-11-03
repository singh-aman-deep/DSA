package com.dsa.codingninjas;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 24 Oct 2023
 * <p>
 * Count Frequency in a range
 * <p>
 * You are given an array arr of length n  containing integers within the range 1 to x
 * Your task is to count the frequency of all elements from  1 to  n.
 * <p>
 * Input: ‘n’ = 6 ‘x’ = 9 ‘arr’ = [1, 3, 1, 9, 2, 7]
 * Output: [2, 1, 1, 0, 0, 0]
 * Explanation: Below Table shows the number and their counts, respectively, in the array
 * Number         Count
 * 1                2
 * 2                1
 * 3                1
 * 4                0
 * 5                0
 * 6                0
 */
public class CountFrequencyInARange {

    public static void main(String[] args) {
//        int n=6;
//        int x=9;
//        int [] arr={1,3,1,9,2,7};
        int n = 7;
        int x = 20;
        int[] arr = {10, 7, 9, 8, 14, 20, 6};
        System.out.println(Arrays.toString(countFrequency(n, x, arr)));

    }

    public static int[] countFrequency(int n, int x, int[] nums) {
        int[] output = new int[n];
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < n; i++) {
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        }
        /*for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }*/
        for (int i = 1; i <= n; i++) {
            output[i - 1] = count.getOrDefault(i, 0);
        }

        return output;
    }
    /*
    Time Complexity: O(n)
    Space Complexity: O(1)
    where n is the size of the input array 'nums'
*/

    public class Solution {
        public int[] countFrequency(int n, int x, int[] nums) {
            // Iterate through the array and modify the elements to track the frequency.
            int i = 0;
            while (i < n) {
                // Skip the element if it is not within our range.
                if (nums[i] > n || nums[i] < 1) {
                    i++;
                    continue;
                }

                // Calculate the index of the element.
                int j = nums[i] - 1;

                // Update the frequencies.
                if (nums[j] < 0) {
                    nums[i] = 0;
                    nums[j]--;
                    i++;
                    continue;
                } else {
                    swap(nums, j, i);
                    nums[j] = -1;
                }
            }

            // Adjust the negative values to positive frequencies.
            for (int k = 0; k < nums.length; k++) {
                if (nums[k] < 0)
                    nums[k] *= -1;
                else
                    nums[k] = 0;
            }

            // Return the array with frequencies.
            return nums;
        }

        public void swap(int[] a, int i, int j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }
}

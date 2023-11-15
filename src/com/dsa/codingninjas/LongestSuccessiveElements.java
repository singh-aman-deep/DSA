package com.dsa.codingninjas;

import java.util.HashSet;
import java.util.Set;

/**
 * 15 Nov 2023
 * <p>
 * Longest Successive Elements
 *
 * There is an integer array ‘A’ of size ‘N’.
 *A sequence is successive when the adjacent elements of the sequence have a difference of 1.
 * You must return the length of the longest successive sequence.
 * Note:
 * You can reorder the array to form a sequence.
 *
 * Example:
 *
 * Input:
 * A = [5, 8, 3, 2, 1, 4], N = 6
 * Output:
 * 5
 * Explanation:
 * The resultant sequence can be 1, 2, 3, 4, 5.
 * The length of the sequence is 5.
 *
 */
public class LongestSuccessiveElements {

    public static void main(String[] args) {
        int[] a = {5, 8, 3, 2, 1, 4};
        System.out.println(longestSuccessiveElements(a));
    }

    public static int longestSuccessiveElements(int[] a) {
        int n = a.length;
        if (n == 0)
            return 0;

        int longest = 1;
        Set<Integer> set = new HashSet<>();

        // put all the array elements into set
        for (int i = 0; i < n; i++) {
            set.add(a[i]);
        }

        // Find the longest sequence
        for (int it : set) {
            // if 'it' is a starting number
            if (!set.contains(it - 1)) {
                // find consecutive numbers
                int cnt = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
}

package com.dsa.codingninjas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 11 Nov 2023
 * <p>
 * Next Greater Permutation
 * <p>
 * Problem Statement: Given an array Arr[] of integers, rearrange the numbers of the given array into the lexicographically next greater permutation of numbers.
 * <p>
 * If such an arrangement is not possible, it must rearrange to the lowest possible order (i.e., sorted in ascending order).
 * <p>
 * Example 1 :
 * <p>
 * Input format: Arr[] = {1,3,2}
 * Output: Arr[] = {2,1,3}
 * Explanation: All permutations of {1,2,3} are {{1,2,3} , {1,3,2}, {2,13} , {2,3,1} , {3,1,2} , {3,2,1}}. So, the next permutation just after {1,3,2} is {2,1,3}.
 */
public class NextGreaterPermutation {

    public static void main(String args[]) {
        List<Integer> A = Arrays.asList(new Integer[]{2, 1, 5, 4, 3, 0, 0});
        List<Integer> ans = nextGreaterPermutation(A);

        System.out.print("The next permutation is: [");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println("]");

    }

    /**
     * Time Complexity: O(3N), where N = size of the given array
     * Finding the break-point, finding the next greater element, and reversal at the end takes O(N) for each, where N is the number of elements in the input array. This sums up to 3*O(N) which is approximately O(3N).
     * <p>
     * Space Complexity: Since no extra storage is required. Thus, its space complexity is O(1).
     */
    public static List<Integer> nextGreaterPermutation(List<Integer> A) {
        int n = A.size(); // size of the array.

        // Step 1: Find the break point:
        int ind = -1; // break point
        for (int i = n - 2; i >= 0; i--) {
            if (A.get(i) < A.get(i + 1)) {
                // index i is the break point
                ind = i;
                break;
            }
        }

        // If break point does not exist:
        if (ind == -1) {
            // reverse the whole array:
            Collections.reverse(A);
            return A;
        }

        // Step 2: Find the next greater element
        //         and swap it with arr[ind]:

        for (int i = n - 1; i > ind; i--) {
            if (A.get(i) > A.get(ind)) {
                int tmp = A.get(i);
                A.set(i, A.get(ind));
                A.set(ind, tmp);
                break;
            }
        }

        // Step 3: reverse the right half:
        List<Integer> sublist = A.subList(ind + 1, n);
        Collections.reverse(sublist);

        return A;
    }
}

package com.dsa.codingninjas;

import java.util.HashMap;

/**
 * 2 Nov 2023
 * <p>
 * Maximum Frequency Number
 * <p>
 * Ninja is given an array of integers that contain numbers in random order.
 * He needs to write a program to find and return the number which occurs the maximum times in the given input.
 * He needs your help to solve this problem.
 * If two or more elements contend for the maximum frequency, return the element which occurs in the array first i.e. whose index is lowest.
 * <p>
 * Sample Input 1:
 * 1
 * 13
 * 2 12 2 11 -12 2 -1 2 2 11 12 2 -6
 * Sample Output 1:
 * 2
 * Explanation of Sample Input 1:
 * Test case 1:
 * For the first test case of sample output 1, as we start traveling the array, ‘2’ has the highest frequency, hence our answer is ‘2’.
 */
public class MaximumFrequencyNumber {
    public static void main(String[] args) {
        int n = 13;
        int[] arr = {2, 12, 2, 11, -12, 2, -1, 2, 2, 11, 12, 2, -6};
        System.out.println(maxFrequencyNumberO(n, arr));
    }

    public static int maxFrequencyNumber(int n, int[] arr) {
        int outputElement = 0;
        int maxCount = 0;
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            counter = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    counter++;
                    if (maxCount < counter) {
                        maxCount++;
                        outputElement = arr[i];
                    }
                }

            }
        }
        return outputElement;
    }

    public static int maxFrequencyNumberO(int n, int[] arr) {

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i : arr) {

            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        int max = 0, ans = Integer.MIN_VALUE;
        for (int i : arr) {
            if (hm.get(i) > max) {
                max = hm.get(i);
                ans = i;
            }
        }
        return ans;
    }
}

package com.dsa.codingninjas;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 25 Oct 2023
 * <p>
 * Highest / Lowest Frequency Elements
 * <p>
 * Given an array V of n numbers.
 * Your task is to find and return the highest and lowest frequency elements.
 * If there are multiple elements that have the highest frequency or lowest frequency, pick the smallest element.
 * <p>
 * Input: ‘n' = 6, 'v' = [1, 2, 3, 1, 1, 4]
 * <p>
 * Output: 1 2
 * <p>
 * Explanation: The element having the highest frequency is '1', and the frequency is 3.
 * The elements with the lowest frequencies are '2', '3', and '4'.
 * Since we need to pick the smallest element, we pick '2'. Hence we return [1, 2].
 */
public class HighestLowestFrequencyElementsCN {
    public static void main(String[] args) {
        int n = 6;
        int[] arr = new int[]{1, 2, 3, 1, 1, 4};
        System.out.println(Arrays.toString(getFrequencies(arr)));
    }

    public static int[] getFrequencies(int[] v) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] output = new int[2];
        for (int j : v) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        int maxFreq = 0, minFreq = v.length;
        int maxEle = 0, minEle = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            int element = entry.getKey();

            if (count > maxFreq || count == maxFreq && element < maxEle) {
                maxFreq = count;
                maxEle = element;
            }

            if (count < minFreq || count == minFreq && element < minEle) {
                minFreq = count;
                minEle = element;
            }
        }
        output[0] = maxEle;
        output[1] = minEle;

        return output;
    }

}

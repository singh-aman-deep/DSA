package com.dsa.striver;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 25 Oct 2023
 * Find the highest/lowest frequency element
 * Problem Statement: Given an array of size N. Find the highest and lowest frequency element.
 * <p>
 * Example 1:
 * Input: array[] = {10,5,10,15,10,5};
 * Output: 10 15
 * Explanation: The frequency of 10 is 3, i.e. the highest and the frequency of 15 is 1 i.e. the lowest.
 */
public class FindTheHighestAndLowestFrequencyElement {

    public static void main(String[] args) {
        int[] array = {10, 5, 10, 15, 10, 5};
        System.out.println(Arrays.toString(highestLowestFre(array)));

    }

    public static int[] highestLowestFre(int[] arr) {
        int[] output = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        /*for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }*/
        int maxFreq = 0, minFreq = arr.length;
        int maxEle = 0, minEle = 0;
        // Traverse through map and find the elements
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int count = entry.getValue();
            int element = entry.getKey();

            if (count > maxFreq) {
                maxEle = element;
                maxFreq = count;
            }
            if (count < minFreq) {
                minEle = element;
                minFreq = count;
            }
        }
        output[0] = maxEle;
        output[1] = minEle;

        return output;
    }
}

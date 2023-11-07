package com.dsa.codingninjas;

import java.util.HashMap;
import java.util.Map;

/**
 * 07 Nov 2023
 * <p>
 * Majority Element
 * <p>
 * Problem Statement: Given an array of N integers,
 * write a program to return an element that occurs more than N/2 times in the given array.
 * You may consider that such an element always exists in the array.
 * <p>
 * Example 1:
 * Input Format: N = 3, nums[] = {3,2,3}
 * Result: 3
 * Explanation: When we just count the occurrences of each number and compare with half of the size of the array,
 * you will get 3 for the above solution.
 */
public class MajorityElement {

    public static void main(String[] args) {
        int[] v = new int[]{2, 3, 1, 3, 1, 1, 3, 1, 1};
        System.out.println(majorityElementO(v));
    }

    /**
     * Time Complexity: O(N2), where N = size of the given array.
     * Reason: For every element of the array the inner loop runs for N times.
     * And there are N elements in the array. So, the total time complexity is O(N2).
     * Space Complexity: O(1) as we use no extra space.
     */
    public static int majorityElementBF(int[] v) {
        int n = v.length;
        int occur = n / 2;
        int output = 0;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (v[j] == v[i]) {
                    count++;
                }
            }
            if (count >= occur) {
                output = v[i];
            }
        }

        return output;
    }

    /**
     * Time Complexity: O(N*logN) + O(N), where N = size of the given array.
     * Reason: We are using a map data structure. Insertion in the map takes logN time.
     * And we are doing it for N elements. So, it results in the first term O(N*logN).
     * The second O(N) is for checking which element occurs more than floor(N/2) times.
     * If we use unordered_map instead, the first term will be O(N) for the best and average case and for the worst case, it will be O(N2).
     * <p>
     * Space Complexity: O(N) as we are using a map data structure.
     */
    public static int majorityElementB(int[] v) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int j : v) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (value >= (v.length / 2)) {
                return key;
            }
        }
        return -1;
    }

    /**
     * Time Complexity: O(N) + O(N), where N = size of the given array.
     * Reason: The first O(N) is to calculate the count and find the expected majority element.
     * The second one is to check if the expected element is the majority one or not.
     * <p>
     * Note: If the question states that the array must contain a majority element,
     * in that case, we do not need the second check. Then the time complexity will boil down to O(N).
     * <p>
     * Space Complexity: O(1) as we are not using any extra space.
     */
    public static int majorityElementO(int[] v) {
        //size of the given array:
        int n = v.length;
        int cnt = 0; // count
        int el = 0; // Element

        //applying the algorithm:
        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = v[i];
            } else if (el == v[i]) cnt++;
            else cnt--;
        }

        //checking if the stored element
        // is the majority element:
        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] == el) cnt1++;
        }

        if (cnt1 > (n / 2)) return el;
        return -1;
    }
}

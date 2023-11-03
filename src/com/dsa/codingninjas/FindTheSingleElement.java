package com.dsa.codingninjas;

import java.util.HashMap;
import java.util.Map;

/**
 * 3 Nov 2023
 * Find The Single Element
 * <p>
 * Problem Statement: Given a non-empty array of integers arr, every element appears twice except for one.
 * Find that single one.
 * <p>
 * Examples
 * Example 1:
 * Input Format: arr[] = {2,2,1}
 * Result: 1
 * Explanation: In this array, only the element 1 appear once and so it is the answer.
 */
public class FindTheSingleElement {
    public static void main(String[] args) {
        int[] arr = {4, 4, 1, 1, 2};
        System.out.println(getSingleElementO(arr));
    }

    public static int getSingleElement(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        for (Map.Entry<Integer,Integer> item: map.entrySet()) {
            int key=item.getKey();
            int count=item.getValue();
            if (count==1){
              return key;
            }
        }
        return 0;
    }

    public static int getSingleElementO(int[] arr) {
        int xor=0;
        for (int j : arr) {
            xor = xor ^ j;
        }
        return xor;
    }


    public static int getSingleElementBF(int[] arr) {
        // Using Linear Search
        int output = 0;
        for (int i = 0; i < arr.length; i++) {
           output=arr[i];
           int counter=0;
            for (int j = 0; j < arr.length; j++) {

                if (output==arr[j]){
                    counter++;
                }

            }
            if (counter==1){
                return output;
            }

        }

        return output;
    }
}

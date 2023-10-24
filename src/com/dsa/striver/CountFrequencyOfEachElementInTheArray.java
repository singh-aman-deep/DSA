package com.dsa.striver;

import java.util.HashMap;
import java.util.Map;

/**
 * 24 Oct 2023
 * Count frequency of each element in the array
 * Problem statement: Given an array, we have found the number of occurrences of each element in the array.
 *
 * Example 1:
 * Input: arr[] = {10,5,10,15,10,5};
 * Output: 10  3
 * 	        5  2
 *         15  1
 * Explanation: 10 occurs 3 times in the array
 * 	             5 occurs 2 times in the array
 *              15 occurs 1 time in the array
 */
public class CountFrequencyOfEachElementInTheArray {

    public static void main(String[] args) {
        int arr[] = {10,5,10,15,10,5};
        countFrequency(arr);
    }

    private static void countFrequency(int[] arr) {
        Map<Integer,Integer> count=new HashMap<>();
        for (int i=0;i< arr.length;i++){
            count.put(arr[i],count.getOrDefault(arr[i] ,0)+1);
        }
        for (Map.Entry<Integer,Integer> entry : count.entrySet()){
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
    }
}
}

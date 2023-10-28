package com.dsa.gfg;

import java.util.ArrayList;

/**
 * 28 Oct 2023
 *
 * Value equal to index value
 *
 * Given an array Arr of N positive integers.
 * Your task is to find the elements whose value is equal to that of its index value ( Consider 1-based indexing ).
 *
 * Note: There can be more than one element in the array which have the same value as its index.
 * You need to include every such element's index. Follows 1-based indexing of the array.
 *
 * Example 1:
 *
 * Input:
 * N = 5
 * Arr[] = {15, 2, 45, 12, 7}
 * Output: 2
 * Explanation: Only Arr[2] = 2 exists here.
 */
public class ValueEqualToIndexValue {

    public static void main(String[] args) {
        int n = 5;
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println(valueEqualToIndex(arr,n));
    }

    static ArrayList<Integer> valueEqualToIndex(int arr[], int n) {
        ArrayList<Integer> output =new ArrayList<>();
        for (int i=0;i<n;i++)
        {
            if (i+1 == arr[i]){
                output.add(arr[i] );
            }
        }
        return output;
    }
}

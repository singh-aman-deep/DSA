package com.dsa.gfg;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 17 Oct 2023
 * <p>
 * Find duplicates in an array
 * <p>
 * Given an array a of size N which contains elements from 0 to N-1, you need to find all the elements occurring more than once in the given array. Return the answer in ascending order. If no such element is found, return list containing [-1].
 * <p>
 * Note: The extra space is only for the array to be returned. Try and perform all operations within the provided array.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 4
 * a[] = {0,3,1,2}
 * Output:
 * -1
 * Explanation:
 * There is no repeating element in the array. Therefore output is -1.
 * Example 2:
 * <p>
 * Input:
 * N = 5
 * a[] = {2,3,1,2,3}
 * Output:
 * 2 3
 * Explanation:
 * 2 and 3 occur more than once in the given array.
 */
public class FindDuplicatesInAnArray {

    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[]{2, 3, 1, 2, 3};
        System.out.println(duplicates(arr, n));

    }

    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.sort(arr);
        int c;
        for (int i = 0; i < n; i++) {
            c = 0;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    c++;
                } else {
                    break;
                }
            }
            if (c > 0) {
                i = i + c;
                list.add(arr[i]);
            }
        }
        if (list.isEmpty())
            list.add(-1);
        return list;
    }
}

package com.dsa.codingninjas;

import java.util.ArrayList;

/**
 * 30 Oct 2023
 * <p>
 * Rotate array
 * <p>
 * Problem Statement: Given an array of integers, rotating array of elements by k elements to left
 * <p>
 * Example:
 * <p>
 * 'arr '= [1,2,3,4,5]
 * 'k' = 1  rotated array = [2,3,4,5,1]
 * 'k' = 2  rotated array = [3,4,5,1,2]
 * 'k' = 3  rotated array = [4,5,1,2,3] and so on.
 */
public class RotateArrayLeftByK {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>() {{
            add(1);
            add(2);
            add(3);
            add(4);
            add(5);
        }};

        int k = 3;
        System.out.println(rotateArray(arrayList, k));

    }

    public static ArrayList<Integer> rotateArray(ArrayList<Integer> arr, int k) {
        // Write your code here.
        // Reverse first k elements
        reverse(arr, 0, k - 1);
        // Reverse last n-k elements
        reverse(arr, k, arr.size() - 1);
        // Reverse whole array
        reverse(arr, 0, arr.size() - 1);
        return arr;
    }

    public static void reverse(ArrayList<Integer> arr, int start, int end) {
        while (start <= end) {
            int temp = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
        }
    }
}

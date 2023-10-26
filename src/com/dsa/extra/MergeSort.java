package com.dsa.extra;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 26 Oct 2023
 * Striver||Coding Ninjas
 * <p>
 * Merge Sort Algorithm
 * <p>
 * Problem:  Given an array of size n, sort the array using Merge Sort.
 * <p>
 * Example 1:
 * Input: N=5, arr[]={4,2,1,6,7}
 * Output: 1,2,4,6,7,
 * <p>
 * Time complexity: O(nlogn)
 * <p>
 * Reason: At each step, we divide the whole array,
 * for that logn and we assume n steps are taken to get sorted array,
 * so overall time complexity will be nlogn
 * <p>
 * Space complexity: O(n)
 * <p>
 * Reason: We are using a temporary array to store elements in sorted order.
 * <p>
 * Auxiliary Space Complexity: O(n)
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{13, 46, 24, 52, 20, 9};
        int n = arr.length;
        mergeSort(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int l, int r) {
        mS(arr, l, r);

    }

    public static void mS(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid=(low+high)/2;
        mS(arr,low,mid);
        mS(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1;

        while (left<=mid&&right<=high){
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }
        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }

    }
}

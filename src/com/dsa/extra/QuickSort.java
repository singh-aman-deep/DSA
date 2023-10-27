package com.dsa.extra;

import java.util.Arrays;

/**
 * 27 Oct 2023
 * Striver||Coding Ninjas
 * <p>
 * Quick Sort Algorithm
 * Problem Statement:  Given an array of n integers, sort the array using the Quicksort method.
 * <p>
 * <p>
 * Example 1:
 * Input:  N = 5  , Arr[] = {4,1,7,9,3}
 * Output: 1 3 4 7 9
 * <p>
 * Explanation: After sorting the array becomes 1, 3, 4, 7, 9
 * <p>
 * <p>
 * Time Complexity: O(N*logN), where N = size of the array.
 * <p>
 * Reason: At each step, we divide the whole array, for that logN and n steps are taken for the partition() function, so overall time complexity will be N*logN.
 * <p>
 * The following recurrence relation can be written for Quick sort :
 * <p>
 * F(n) = F(k) + F(n-1-k)
 * <p>
 * Here k is the number of elements smaller or equal to the pivot and n-1-k denotes elements greater than the pivot.
 * <p>
 * There can be 2 cases :
 * <p>
 * Worst Case – This case occurs when the pivot is the greatest or smallest element of the array. If the partition is done and the last element is the pivot, then the worst case would be either in the increasing order of the array or in the decreasing order of the array.
 * <p>
 * Recurrence:
 * F(n) = F(0)+F(n-1)  or  F(n) = F(n-1) + F(0)
 * <p>
 * Worst Case Time complexity: O(n2)
 * <p>
 * Best Case – This case occurs when the pivot is the middle element or near to middle element of the array.
 * Recurrence :
 * F(n) = 2F(n/2)
 * <p>
 * Time Complexity for the best and average case: O(N*logN)
 * <p>
 * Space Complexity: O(1) + O(N) auxiliary stack space.
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{13, 46, 24, 52, 20, 9};
        int n = arr.length;

        quickSort(arr, 0, n - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] input, int startIndex, int endInedx) {

        qs(input, startIndex, endInedx);

    }

    private static void qs(int[] arr, int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high);
            qs(arr, low, pIndex - 1);
            qs(arr, pIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot=arr[low];
        int i=low;
        int j=high;
        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }

            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }
            if (i < j) {
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp = arr[low];
        arr[low] =arr[j];
        arr[j]=temp;
        return j;
    }

}

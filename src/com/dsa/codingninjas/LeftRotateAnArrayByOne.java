package com.dsa.codingninjas;

import java.util.Arrays;

/**
 * 30 Oct 2023
 *
 * Left Rotate an Array by One
 *
 *
 * Problem Statement: Given an array of N integers, left rotate the array by one place.
 *
 *
 * Example 1:
 * Input: N = 5, array[] = {1,2,3,4,5}
 * Output: 2,3,4,5,1
 * Explanation:
 * Since all the elements in array will be shifted
 * toward left by one so ‘2’ will now become the
 * first index and and ‘1’ which was present at
 * first index will be shifted at last.
 */
public class LeftRotateAnArrayByOne {

    public static void main(String[] args) {
        int n = 5;
        int array[] = {1,2,3,4,5};

        System.out.println(Arrays.toString(rotateArray(array,n)));

    }

    static int[] rotateArray(int[] arr, int n) {
        int temp=arr[0];
        for (int i=0;i<n-1;i++){
            arr[i]=arr[i+1];
            if (i+1==n-1){
                arr[n-1]=temp;
            }

        }
        return arr;
    }


}

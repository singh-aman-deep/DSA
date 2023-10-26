package com.dsa.gfg;

import java.util.Arrays;

/**
 * 26 Oct 2023
 * Find Index
 * <p>
 * <p>
 * Given an unsorted array Arr[] of N integers and a Key which is present in this array.
 * You need to write a program to find the start index( index where the element is first found from left in the array )
 * and end index( index where the element is first found from right in the array ).
 * If the key does not exist in the array then return -1 for both start and end index in this case.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 6
 * arr[] = { 1, 2, 3, 4, 5, 5 }
 * Key = 5
 * Output:  4 5
 * Explanation:
 * 5 appears first time at index 4 and
 * appears last time at index 5.
 * (0 based indexing)
 */
public class FindIndex {

    public static void main(String[] args) {
//        int n = 6;
//        int arr[] = {1, 2, 3, 4, 5, 5};
//        int key = 5;
        int n = 6;
        int arr[] = { 6, 5, 4, 3, 1, 4 };
        int key = 4;
        System.out.println(Arrays.toString(findIndex2(arr, n, key)));
    }

    // Function to find starting and end index
    static int[] findIndex(int a[], int N, int key) {
        int[] output = new int[2];
        int leftPos=-1;
        int rightPos=-1;
        int i=0;
        while (i<N){
            if (a[i]==key&& leftPos==-1){
                leftPos=i;
            }
            if (a[i]==key&& rightPos==-1){
                rightPos=i;
            }
            i++;
        }
        output[0]=leftPos;
        output[1]=rightPos;
        return output;
    }

    static int[] findIndex2(int a[], int N, int key) {
        int[] output = new int[2];
        int start = -1;
        for (int i = 0; i < N; i++) {
            if (a[i] == key) {
                start = i;
                break;
            }
        }
        if (start==-1){
            output[0]=-1;
            output[1]=-1;
            return output;
        }
        int end = start;
        for (int i = N - 1; i >= start; i--) {
            if (a[i] == key) {
                end = i;
                break;
            }
        }
        output[0]=start;
        output[1]=end;
        return output;
    }


    //User function Template for Java
//import java.util.*;
    class Solution
    {
        // Function to find starting and end index
        int[] findIndex(int a[], int N, int key)
        {
            int x =-1;
            int y=-1;
            for(int i =0;i<N;i++){
                if(a[i]==key){
                    x=i;
                    //System.out.print(i);
                    break;
                }

            }
            for(int j =N-1;j>=0;j--){
                if(a[j]==key){
                    y=j;
                    break;
                }}
            return new int[]{x,y};
        }
    }
}

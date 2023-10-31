package com.dsa.gfg;

import java.util.Arrays;

/**
 * 31 Oct 2023
 *
 * Smaller and Larger
 *
 * Given a sorted array Arr of size N and a value X,
 * find the number of array elements less than or equal to X and elements more than or equal to X.
 *
 * Example 1:
 *
 * Input:
 * N = 7, X = 0
 * Arr[] = {1, 2, 8, 10, 11, 12, 19}
 * Output: 0 7
 * Explanation: There are no elements less or
 * equal to 0 and 7 elements greater or equal
 * to 0.
 */
public class SmallerAndLarger {

    public static void main(String[] args) {
        int arr[] = {1, 2, 8, 10, 11, 12, 19};
        int n = arr.length;
        int x = 5;
        System.out.println(Arrays.toString(getMoreAndLess(arr,n,x)));
    }

    static int[] getMoreAndLess(int[] arr, int n, int x) {
       int [] output=new int[2];
       int less=0;
       int more=0;
       for (int i=0;i<n;i++){
           if (arr[i]>=x){
               more++;
           }

           if (arr[i]<=x){
               less++;
           }
       }
       output[0]=less;
       output[1]=more;

       return  output;
    }
}

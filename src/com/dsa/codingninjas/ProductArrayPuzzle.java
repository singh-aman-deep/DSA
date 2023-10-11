package com.dsa.codingninjas;

import java.util.Arrays;

/**
 * You are given an array of ‘N’ integers.
 * You need to return another array ‘product’ such that ‘product[i]’
 * contains the product of all the arrays except the element at the ith position in the given array.
 */
public class ProductArrayPuzzle {
    public static void main(String[] args) {
        int size = 5;
        int[] arr = new int[]{1, 3, 3, 10, 2};
        System.out.println(Arrays.toString(productPuzzle(arr, size)));
    }

    public static int[] productPuzzle(int[] arr, int n) {
        int[] outputArr = new int[n];
        Arrays.fill(outputArr,1);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j!=i){
                    outputArr[i] = outputArr[i] * arr[j];
                }
            }
        }
        return outputArr;
    }
}

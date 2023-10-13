package com.dsa.gfg;

import java.util.Arrays;

/**
 * 12 Oct 2023
 * <p>
 * Missing number in array
 * <p>
 * Given an array of size N-1 such that
 * it only contains distinct integers in the range of 1 to N. Find the missing element.
 */
public class MissingNumberInArray {

    public static void main(String[] args) {

        int[] arr = new int[]{6, 1, 2, 8, 3, 4, 7, 10, 5};
        int size = 10;
        System.out.println(missingNumber(arr, size));
    }

    static int missingNumber(int array[], int n) {
        int sum = ((n + 1) * (n + 2)) / 2;
        for (int i = 0; i < n; i++)
            sum -= array[i];
        return sum;
    }

    static int missingNumber0(int array[], int n) {
        int missingNumber = -1;
        Arrays.sort(array);
        for (int i = 0; i < array.length-1; i++) {
            int difference=array[i+1]-array[i];
            if (difference!=1){
                missingNumber=array[i]+1;
            }else {
                if (array.length!=n){
                    missingNumber=n;
                }
            }

        }
        return missingNumber;
    }

}



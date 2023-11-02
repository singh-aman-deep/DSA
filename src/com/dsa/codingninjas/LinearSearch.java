package com.dsa.codingninjas;

/**
 *1 Nov 2023
 *
 * Linear Search
 *
 * You are given an array 'arr'  containing  ‘n’  integers. You are also given an integer ‘num’ , and your task is to find whether ‘num’ is present in the array or not.
 * If ‘num’ is present in the array, return the 0-based index of the first occurrence of ‘num’. Else, return -1.
 *
 *Example:
 *
 * Input: ‘n’ = 5, ‘num’ = 4
 * 'arr' =  [6,7,8,4,1]
 *
 * Output: 3
 *
 * Explanation:
 * 4 is present at the 3rd index.
 */
public class LinearSearch {

    public static void main(String[] args) {
        int[] x = {1,2,3,4};
        System.out.print(linearSearch(x,4));

    }

    static  int linearSearch(int[] arr, int num){
        boolean flag = false;
        int i;
        for(i = 0;i < arr.length;i++){
            if(num == arr[i])
            {
                flag = true;
                break;
            }
        }

        if(!flag)
            return -1;
        else
            return i;
    }
}

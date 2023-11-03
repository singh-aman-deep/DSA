package com.dsa.gfg;

import java.util.ArrayList;

public class SubarrayWithGivenSum {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        int n = 8;
        int s = 15;
        int[] arr = new int[]{1, 2, 3, 7, 5, 3, 6, 7};
//        int[] arr = new int[]{1,2,3,7,5};
        System.out.println(Solution.subarraySum(arr, n, s));

    }
}

class Solution {
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        int ind = 0, j = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            while (sum > s && s > 0) {
                sum = sum - arr[ind];
                ind++;
            }
            if (sum == s) {
                list.add(ind + 1);
                list.add(i + 1);
                return list;
            }

        }
        list.add(-1);
        return list;

    }
}

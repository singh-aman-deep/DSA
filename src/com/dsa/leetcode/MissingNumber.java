package com.dsa.leetcode;

import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {

        int[] x = {0,1,3};
        System.out.print(missingNumber(x));
    }

    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i] != i){
                return i;
            }
        }
        return nums.length;
    }
}

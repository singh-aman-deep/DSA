package com.dsa.leetcode;

import java.util.Arrays;

/**
 * 31 Oct 2023
 *
 * 283. Move Zeroes
 *
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * Note that you must do this in-place without making a copy of the array.
 *
 * Example 1:
 *
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 *
 */
public class MoveZeroes {
    public static void main(String[] args) {
        int [] arr={1,2,0,0,2,3};
        int n= arr.length;
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void moveZeroes(int[] nums) {
        int j=-1;
        int n= nums.length;
        if (n == 1) {
            return;
        }
        for (int i=0;i<n;i++){
            if (nums[i]==0){
                j=i;
                break;
            }
        }

        if (j==-1){
            return ;
        }

        for (int i=j+1;i<n;i++){
            if (nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
    }
}

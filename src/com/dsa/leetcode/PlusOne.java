package com.dsa.leetcode;

import java.util.Arrays;

/**
 * 27 Oct 2023
 * <p>
 * 66. Plus One
 * <p>
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
 * <p>
 * Increment the large integer by one and return the resulting array of digits.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124.
 * Thus, the result should be [1,2,4].
 */
public class PlusOne {
    public static void main(String[] args) {
//        int [] arr ={1,2,3};
//        int [] arr ={4,3,2,1};
        int[] arr = {9};
        System.out.println(Arrays.toString(plusOne(arr)));

    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
                // starting from extreme right--> if array[i] is less than 9 means can be added with 1
                // i.e. [ 5,8 ]-->[ 5,9 ] or
                //      [ 9,4 ]-->[ 9,5 ] or
                //      [ 6,0 ]-->[ 6,1 ]
                // and will directly return array
            }
            digits[i] = 0;
            // if array[i] is not less than 9, means it have to be 9 only then digit is changed to 0,
            // and we again revolve around loop to check for number if less than 9 or not
            // i.e. [ 5,9 ]-->[ 5,0 ]-loop->[ 6,0 ] or
            //      [ 1,9,9 ]-->[ 1,9,0 ]-loop->[ 1,0,0 ]-loop->[ 2,0,0 ]
            // and will directly return array
        }

// if all number inside array are 9
// i.e. [ 9,9,9,9 ] than according to above loop it will become [ 0,0,0,0 ]
// but we have to make it like this [ 9,9,9,9 ]-->[ 1,0,0,0,0 ]


// to make like above we need to make new array of length--> n+1
// by default new array values are set to -->0 only
// thus just changed first value of array to 1 and return the array

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static int[] plusOne1(int[] digits) {
        String number = "";
        int[] output = new int[digits.length == 1 ? digits.length + 1 : digits.length];
        for (int i = 0; i < digits.length; i++) {
            number = number + digits[i];
        }
        int numberInt = Integer.parseInt(number);
        String plusOne = String.valueOf(numberInt + 1);
        for (int j = 0; j < plusOne.length(); j++) {
            output[j] = Integer.parseInt(String.valueOf(plusOne.charAt(j)));
        }
        return output;
    }
}

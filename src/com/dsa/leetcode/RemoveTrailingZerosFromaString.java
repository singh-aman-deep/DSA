package com.dsa.leetcode;

/**
 * 20 Oct 2023
 * <p>
 * 2710. Remove Trailing Zeros From a String
 * <p>
 * Given a positive integer num represented as a string, return the integer num without trailing zeros as a string.
 * <p>
 * Example 1:
 * <p>
 * Input: num = "51230100"
 * Output: "512301"
 * Explanation: Integer "51230100" has 2 trailing zeros, we remove them and return integer "512301".
 */
public class RemoveTrailingZerosFromaString {
    public static void main(String[] args) {
//        String num = "51230100";
        String num = "123";
        System.out.println(removeTrailingZeros(num));
    }

    public static String removeTrailingZeros(String num) {
        int length=num.length()-1;
        for (int i = length; i >= 0; i--) {
            if (num.charAt(i)=='0'){
                num=num.substring(0,i);
            }else {
                break;
            }

        }
        return num;
    }

    public static String removeTrailingZeros1(String num) {
        int i = num.length()-1;
        while(num.charAt(i)=='0'){
            i--;
        }
        return num.substring(0,i+1);
    }
}

package com.dsa.leetcode;

/**
 * 22 Oct 2023
 * <p>
 * 9. Palindrome Number
 * <p>
 * Given an integer x, return true if x is a
 * palindrome
 * , and false otherwise.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: x = 121
 * Output: true
 * Explanation: 121 reads as 121 from left to right and from right to left.
 */
public class PalindromeNumberLC {
    public static void main(String[] args) {
        int x = -121;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        int reverseNumber = 0;
        int originalNUmber = x;
        while (x > 0) {
            //Extract the last digit
            int digit = x % 10;
            //Appending last digit
            reverseNumber = reverseNumber * 10 + digit;
            // Shrinking x by discarding the last digit
            x = x / 10;
        }
        return reverseNumber == originalNUmber;
    }
}

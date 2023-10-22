package com.dsa.codingninjas;

/**
 * 22 Oct 2023
 * <p>
 * Palindrome number
 * <p>
 * Problem Statement:  Given a number check if it is a palindrome.
 * <p>
 * An integer is considered a palindrome when it reads the same backward as forward.
 * <p>
 * <p>
 * Example 1:
 * Input: N = 123
 * Output: Not Palindrome Number
 * Explanation: 123 read backwards is 321.Since these are two different numbers 123 is not a palindrome.
 */
public class PalindromeNumber {
    public static void main(String[] args) {

        int n = 123;
        System.out.println(palindromeNumber(n));
    }

    public static boolean palindromeNumber(int n) {
        int reverseNumber = 0;
        int originalNUmber = n;
        while (n > 0) {
            //Extract the last digit
            int digit = n % 10;
            //Appending last digit
            reverseNumber = reverseNumber * 10 + digit;
            // Shrinking n by discarding the last digit
            n = n / 10;
        }
        return reverseNumber == originalNUmber;
    }
}

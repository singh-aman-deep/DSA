package com.dsa.striver;

/**
 * 21 Oct 2023
 * <p>
 * Count digits in a number
 * Problem Statement: Given an integer N, write a program to count the number of digits in N.
 * <p>
 * Example 1:
 * Input: N = 12345
 * Output: 5
 * Explanation: N has 5 digits
 */
public class CountDigits {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println("Number of digits in " + n + " is " + count_digits(n));
    }

    static int count_digits(int n) {
        int x = n;
        int count = 0;
        while (x != 0) {
            x = x / 10;
            count++;
        }
        return count;
    }
}

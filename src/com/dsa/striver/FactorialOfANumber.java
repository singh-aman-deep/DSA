package com.dsa.striver;

/**
 * 23 Oct 2023
 * <p>
 * Factorial of a Number
 * <p>
 * Problem Statement: Given a number X,  print its factorial.
 * <p>
 * Example 1:
 * Input: X = 5
 * Output: 120
 * Explanation: 5! = 5*4*3*2*1
 */
public class FactorialOfANumber {
    public static void main(String[] args) {
        int x = 3;
        System.out.println(fact(x));
    }

    public static int fact(int x) {
        if (x < 1) {
            return 1;
        }
        return x * fact(x - 1);
    }
}

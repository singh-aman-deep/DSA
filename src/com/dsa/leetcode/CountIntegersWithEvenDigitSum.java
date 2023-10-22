package com.dsa.leetcode;

/**
 * Given a positive integer num, return the number of positive integers less than or equal to num whose digit sums are even.
 * <p>
 * The digit sum of a positive integer is the sum of all its digits.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: num = 4
 * Output: 2
 * Explanation:
 * The only integers less than or equal to 4 whose digit sums are even are 2 and 4.
 */
public class CountIntegersWithEvenDigitSum {
    public static void main(String[] args) {
        int input = 500;
        System.out.println("Result->" + countEven(input));
    }

    public static int countEven(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (sumOfDigits(i) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int sumOfDigits(int number) {
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }

        return sum;
    }
}

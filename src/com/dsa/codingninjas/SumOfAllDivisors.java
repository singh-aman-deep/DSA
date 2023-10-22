package com.dsa.codingninjas;

/**
 * 22 Oct 2023
 * <p>
 * Sum of all divisors
 * <p>
 * You are given an integer N
 * <p>
 * Function ‘sumOfDivisors(n)’ is defined as the sum of all divisors of ‘n’.
 * <p>
 * Find the sum of ‘sumOfDivisors(i)’ for all ‘i’ from 1 to ‘n’.
 */
public class SumOfAllDivisors {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumOfAllDivisors(n));
    }

    public static int sumOfAllDivisors(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    sum += j;
                    if (j != i / j) {
                        sum += (i / j);
                    }
                }
            }
        }
        return sum;
    }

}

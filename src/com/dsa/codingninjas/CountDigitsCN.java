package com.dsa.codingninjas;

/**
 * 21 Oct 2023
 * <p>
 * Count Digits
 * You are given a number N
 *
 * Find the number of digits of ‘n’ that evenly divide ‘n’.
 */
public class CountDigitsCN {
    public static int countDigits(int n) {
        int i = 0;
        int temp = n;
        while (temp != 0) {
            int rem = temp % 10;
            if (rem != 0 && n % rem == 0) {
                i = i + 1;
            }
            temp /= 10;
        }
        return i;
    }

    public static void main(String args[]) {
        int n = 35;
        int re = countDigits(n);
        System.out.println(re);
    }
}




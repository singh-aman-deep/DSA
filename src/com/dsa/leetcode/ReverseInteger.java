package com.dsa.leetcode;

/**
 * 21 Oct 2032
 * <p>
 * 7. Reverse Integer
 * <p>
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 * <p>
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 */
public class ReverseInteger {

    public static void main(String[] args) {
        int n = 123;
        System.out.println(reverse(n));
    }

    public static int reverse(int x) {
        long finalNum = 0;
        while (x != 0) {
            int lastDig = x % 10;
            finalNum += lastDig;
            finalNum = finalNum * 10;
            x = x / 10;
        }
        finalNum = finalNum / 10;
        if (finalNum > Integer.MAX_VALUE || finalNum < Integer.MIN_VALUE) {
            return 0;
        }
        if (x < 0) {
            return (int) (-1 * finalNum);
        }
        return (int) finalNum;
    }
}

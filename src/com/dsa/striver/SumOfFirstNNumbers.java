package com.dsa.striver;

/**
 * 23 Oct 2023
 * Coding Ninjas
 *
 * Sum Of First N Numbers
 *
 * Problem statement: Given a number ‘N’, find out the sum of the first N natural numbers.
 *
 * Examples:
 *
 * Example 1:
 * Input: N=5
 * Output: 15
 * Explanation: 1+2+3+4+5=15
 *
 */
public class SumOfFirstNNumbers {

    public static void main(String[] args) {
        int n=1000000;
        System.out.println(sumFirstN2(n));
    }
    public static long sumFirstN(long n) {
       return sum(0,n);
    }

    private static long sum(long i, long n) {
        if (n<1){
            return i;
        }
        i=i+n;
        return sum(i,n-1);
    }

     static long sumFirstN2(long n) {
        // Write your code here.
        return n*(n+1)/2;
    }
}

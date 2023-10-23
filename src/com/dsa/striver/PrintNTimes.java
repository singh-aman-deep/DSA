package com.dsa.striver;

/**
 * 23 Oct 2032
 * <p>
 * Coding Ninjas
 * <p>
 * Print n times
 * <p>
 * Print Name N times using Recursion
 */
public class PrintNTimes {

    public static void main(String[] args) {
        int n = 4;
        printNtimes(n);
    }

    public static void printNtimes(int n) {
        if (n==0){
            return;
        }
        System.out.print("Coding Ninjas ");
        printNtimes(n-1);
    }
}

package com.dsa.striver;

public class GCDOfTwoNumbers {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 6;
        System.out.println(calcGCD(num1, num2));

    }

    public static int calcGCD(int n, int m) {
        if (m == 0) {
            return n;
        }
        return calcGCD(m, n % m);
    }
}

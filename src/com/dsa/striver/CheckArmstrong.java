package com.dsa.striver;

import java.util.Scanner;


/**
 * 22 Oct 2023
 * Coding Ninjas
 * <p>
 * Check Armstrong
 * <p>
 * Check if a number is Armstrong Number or not
 * Problem Statement: Given a number, check if it is Armstrong Number or Not.
 * <p>
 * Example 1:
 * Input:153
 * Output: Yes, it is an Armstrong Number
 * Explanation: 1^3 + 5^3 + 3^3 = 153
 */
public class CheckArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int power = countNum(num);
        System.out.println(isArmstrong(num, power));
    }

    public static int countNum(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num /= 10;
        }
        return count;

    }

    public static boolean isArmstrong(int num, int power) {
        int temp = num;
        int sum = 0;
        while (num != 0) {
            int ld = num % 10;
            sum += Math.pow(ld, power);
            num /= 10;
        }
        if (sum == temp) {
            return true;
        }
        return false;
    }


}


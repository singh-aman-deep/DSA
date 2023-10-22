package com.dsa.striver;

/**
 * 22 Oct 2023
 * Coding Ninjas
 * Check Prime
 * Check if a number is prime or not
 * Problem Statement: Given a number, check whether it is prime or not. A prime number is a natural number that is only divisible by 1 and by itself.
 *
 * Examples 1 2 3 5 7 11 13 17 19 …
 */
public class CheckPrime {

    public static void main(String[] args) {
     int num=1;
        System.out.println(isPrime(num));
    }

    public static String isPrime(int num) {
        boolean flag=true;
        if (num==1){
            flag=true;
        }
        for (int i=2;i<Math.sqrt(num);i++){
            if (num%i==0){
                flag=false;
                break;
            }
        }
        return flag ?"YES":"NO";
    }
}

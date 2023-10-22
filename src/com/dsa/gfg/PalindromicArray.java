package com.dsa.gfg;

/**
 * 22 Oct 2023
 * <p>
 * Palindromic Array
 * <p>
 * Given a Integer array A[] of n elements. Your task is to complete the function PalinArray.
 * Which will return 1 if all the elements of the Array are palindrome otherwise it will return 0.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * 5
 * 111 222 333 444 555
 * <p>
 * Output:
 * 1
 * <p>
 * Explanation:
 * A[0] = 111 //which is a palindrome number.
 * A[1] = 222 //which is a palindrome number.
 * A[2] = 333 //which is a palindrome number.
 * A[3] = 444 //which is a palindrome number.
 * A[4] = 555 //which is a palindrome number.
 * As all numbers are palindrome so This will return 1.
 */
public class PalindromicArray {

    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[]{111, 434, 333, 444, 555};
        System.out.println(palinArray(arr, n));

    }

    public static int palinArray(int[] a, int n) {
        int flag = 0;

        for (int i = 0; i < n; i++) {
            int reverseNumber = 0;
            int originalNumber = a[i];
            while (a[i] > 0) {
                //Extract the last digit
                int digit = a[i] % 10;
                //Appending last digit
                reverseNumber = reverseNumber * 10 + digit;
                // Shrinking n by discarding the last digit
                a[i] = a[i] / 10;


            }
            if (reverseNumber == originalNumber) {
                flag = 1;
            } else {
                flag = 0;
                break;
            }

        }
        return flag;
    }
}

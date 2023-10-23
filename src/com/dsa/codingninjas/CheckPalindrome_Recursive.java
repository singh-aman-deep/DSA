package com.dsa.codingninjas;

/**
 * 23 Oct 2023
 * Check if the given String is Palindrome or not
 *
 * Problem Statement: “Given a string, check if the string is palindrome or not.”  A string is said to be palindrome if the reverse of the string is the same as the string.
 *
 * Example 1:
 * Input: Str =  “ABCDCBA”
 * Output: Palindrome
 * Explanation: String when reversed is the same as string.
 */
public class CheckPalindrome_Recursive {
    public static void main(String[] args) {
        String s= "racecar";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String str) {
        return palindrome(0,str);
    }

    private static boolean palindrome(int i, String str) {
        if (i>str.length()/2) return true;
        if(str.charAt(i)!=str.charAt(str.length()-i-1)) return false;
        return palindrome(i+1,str);
    }

}

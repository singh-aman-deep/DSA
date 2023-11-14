package com.dsa.gfg;

/**
 * 14 Nov 2023
 * <p>
 * Remove vowels from string
 * <p>
 * Given a string, remove the vowels from the string.
 * <p>
 * Example 1:
 * <p>
 * Input: S = "welcome to geeksforgeeks"
 * Output: wlcm t gksfrgks
 * Explanation: Ignore vowels and print other
 * characters
 */
public class RemoveVowelsFromString {

    public static void main(String[] args) {
        String s = "welcome to geeksforgeeks";
        System.out.println(removeVowels(s));


    }

    static String removeVowels(String S) {
        int n = S.length();
        int j = 0;
        char[] result = new char[n];

        // iterating over each character of the string
        for (int i = 0; i < n; i++) {
            // checking if the character is a vowel or not
            if (S.charAt(i) != 'a' && S.charAt(i) != 'e' && S.charAt(i) != 'i' && S.charAt(i) != 'o' && S.charAt(i) != 'u') {
                result[j++] = S.charAt(i); // if not a vowel, storing it in the new array
            }
        }

        // returning the updated string without vowels
        return new String(result, 0, j);
    }
}

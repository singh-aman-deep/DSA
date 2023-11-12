package com.dsa.gfg;

/**
 * 12 Nov 2023
 * <p>
 * Remove characters from alphanumeric string
 * <p>
 * Remove all characters except the numeric characters from an alphanumeric string.
 * <p>
 * Example 1:
 * <p>
 * Input: S = "AA1d23cBB4"
 * Output: 1234
 * Explanation: Remove all characters
 * other than numbers
 */
public class RemoveCharactersFromAlphanumericString {
    public static void main(String[] args) {
        String s = "AA1d23cBB4";
        System.out.println(removeCharacters(s));
    }

    static String removeCharacters(String S) {
        int j = 0;

        // Iterating over each character in the string.
        for (int i = 0; i < S.length(); i++) {
            // Checking if the current character is a digit.
            if ('0' <= S.charAt(i) && S.charAt(i) <= '9') {
                // Storing the digit at the current index j.
                S = S.substring(0, j) + S.charAt(i) + S.substring(j + 1);
                j++;
            }
        }

        // Returning the substring of the modified string without non-numeric characters.
        return S.substring(0, j);
    }
}

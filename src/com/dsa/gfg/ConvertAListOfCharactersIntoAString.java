package com.dsa.gfg;

/**
 * 10 Nov 2023
 * <p>
 * Convert a list of characters into a String
 * <p>
 * Given a list of characters, merge all of them into a string.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 13
 * Char array = g e e k s f o r g e e k s
 * Output: geeksforgeeks
 * Explanation: combined all the characters
 * to form a single string.
 */
public class ConvertAListOfCharactersIntoAString {
    public static void main(String[] args) {
        char[] array = {'g', 'e', 'e', 'k', 's', 'f', 'o', 'r', 'g', 'e', 'e', 'k', 's'};
        int n = array.length;

        System.out.println(chartostr(array, n));

    }

    public static String chartostr(char arr[], int N) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : arr) {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

}

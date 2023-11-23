package com.dsa.gfg;

/**
 * 23 Nov 2023
 *
 * Reversing the vowels
 *
 * Given a string consisting of lowercase english alphabets, reverse only the vowels present in it and print the resulting string.
 *
 * Example 1:
 *
 * Input:
 * S = "geeksforgeeks"
 * Output: geeksforgeeks
 * Explanation: The vowels are: e, e, o, e, e
 * Reverse of these is also e, e, o, e, e.
 *
 * Example 2:
 *
 * Input:
 * S = "practice"
 * Output: prectica
 * Explanation: The vowels are a, i, e
 * Reverse of these is e, i, a.
 */
public class ReversingTheVowels {
    public static void main(String[] args) {
        String s="practice";
        System.out.println(modify(s));
    }
    public static String modify(String s) {
        StringBuilder vow = new StringBuilder();
        for (int i = 0; i < s.length(); ++i) {
            // Removing the vowels from s and adding them to the StringBuilder vow
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                vow.append(s.charAt(i));
                // To indicate that the current position is now empty
                s = replaceChar(s, i, '.');
            }
        }

        // Traversing s in reverse order and placing the vowels at empty locations
        int i = s.length() - 1;
        int j = 0;
        while (i >= 0) {
            if (s.charAt(i) == '.') {
                s = replaceChar(s, i, vow.charAt(j++));
            }
            i--;
        }
        return s;
    }

    private static String replaceChar(String s, int index, char replacement) {
        char[] chars = s.toCharArray();
        chars[index] = replacement;
        return new String(chars);
    }
}

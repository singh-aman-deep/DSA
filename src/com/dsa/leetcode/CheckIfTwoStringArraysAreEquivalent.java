package com.dsa.leetcode;

/**
 * 28 Oct 2023
 * <p>
 * 1662. Check If Two String Arrays are Equivalent
 * <p>
 * Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
 * <p>
 * A string is represented by an array if the array elements concatenated in order forms the string.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
 * Output: true
 * Explanation:
 * word1 represents string "ab" + "c" -> "abc"
 * word2 represents string "a" + "bc" -> "abc"
 * The strings are the same, so return true.
 */
public class CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {
        String[] word1 = new String[]{"ab", "c"};
        String[] word2 = new String[]{"a", "bc"};
        System.out.println(arrayStringsAreEqual(word1, word2));
    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder wordCombine1 = new StringBuilder();
        StringBuilder wordCombine2 = new StringBuilder();

        for (String s : word1) {
            wordCombine1.append(s);
        }
        for (String s : word2) {
            wordCombine2.append(s);
        }
        return wordCombine1.compareTo(wordCombine2) == 0;

    }

    public static boolean arrayStringsAreEqual1(String[] word1, String[] word2) {
        return String.join("", word1).equals(String.join("", word2));

    }
}

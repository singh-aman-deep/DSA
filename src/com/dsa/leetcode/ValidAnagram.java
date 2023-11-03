package com.dsa.leetcode;

import java.util.Arrays;

/**
 * 23 Oct 2023
 * <p>
 * 242. Valid Anagram
 * <p>
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * <p>
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "anagram", t = "nagaram"
 * Output: true
 */
public class ValidAnagram {
    public static void main(String[] args) {
//        String s = "anagram";
//        String t = "nagaram";
        String s = "rat";
        String t = "car";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        char[] one = s.toCharArray();
        char[] two = t.toCharArray();
        Arrays.sort(one);
        Arrays.sort(two);
        return Arrays.equals(one, two);
    }
}

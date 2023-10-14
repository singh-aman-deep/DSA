package com.dsa.codingninjas;

import java.util.HashMap;
import java.util.Map;

/**
 * 14 Oct 2023
 * <p>
 * Isomorphic Strings
 * You have been given two strings,'str1' and 'str2'
 * <p>
 * Your task is to return true if the given two strings are isomorphic to each other, else return false.
 * <p>
 * Two strings are isomorphic if a one-to-one mapping is possible for every character of the first string ‘str1’ to every character of the second string ‘str2’ while preserving the order of the characters.
 * <p>
 * All occurrences of every character in the first string ‘str1’ should map to the same character in the second string, ‘str2’.
 */
public class IsomorphicStrings {

    public static void main(String[] args) {
        String str1 = "aab";
        String str2 = "xyz";
        System.out.println(new Solution().areIsomorphic(str1, str2));

    }
}

class Solution {

    static Map<Character, Character> mapping;
    static Map<Character, Boolean> mappedBefore;
    static boolean equivalent;

    public static boolean areIsomorphic(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        mapping = new HashMap<Character, Character>();
        mappedBefore = new HashMap<Character, Boolean>();
        equivalent = true;


        for (int i = 0; i < str1.length(); i++) {
            if (mapping.containsKey(str1.charAt(i))) {
                char mapped = mapping.get(str1.charAt(i));

                if (mapped != str2.charAt(i)) {
                    equivalent = false;
                    break;
                }
            } else {
                if (mappedBefore.containsKey(str2.charAt(i))) {
                    equivalent = false;
                    break;
                } else {
                    mappedBefore.put(str2.charAt(i), true);
                    mapping.put(str1.charAt(i), str2.charAt(i));
                }

            }
        }
        return equivalent;
    }
}

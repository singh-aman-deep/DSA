package com.dsa.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 17 Oct 2023
 * <p>
 * 2828. Check if a String Is an Acronym of Words
 * <p>
 * <p>
 * Given an array of strings words and a string s, determine if s is an acronym of words.
 * <p>
 * The string s is considered an acronym of words if it can be formed by concatenating the first character of each string in words in order. For example, "ab" can be formed from ["apple", "banana"], but it can't be formed from ["bear", "aardvark"].
 * <p>
 * Return true if s is an acronym of words, and false otherwise.
 * <p>
 * Example 1:
 * <p>
 * Input: words = ["alice","bob","charlie"], s = "abc"
 * Output: true
 * Explanation: The first character in the words "alice", "bob", and "charlie" are 'a', 'b', and 'c', respectively. Hence, s = "abc" is the acronym.
 */
public class CheckIfAStringIsAnAcronymofWords {
    public static void main(String[] args) {
        String s = "a";
//        String [] wordsArr= new String[]{"alice","bob","charlie"};
        String[] wordsArr = new String[]{"an", "apple"};
        List<String> words = new ArrayList<>(Arrays.asList(wordsArr));
        System.out.println(isAcronym(words, s));
    }

    public static boolean isAcronym(List<String> words, String s) {
        StringBuilder output = new StringBuilder();
        for (String word : words) {
            output.append(word.charAt(0));
        }
        return output.toString().equals(s);
    }
}

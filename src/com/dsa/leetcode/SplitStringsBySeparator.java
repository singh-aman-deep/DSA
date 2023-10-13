package com.dsa.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 13 Oct 2023
 * <p>
 * 2788. Split Strings by Separator
 * <p>
 * Given an array of strings words and a character separator, split each string in words by separator.
 * <p>
 * Return an array of strings containing the new strings formed after the splits, excluding empty strings.
 * <p>
 * Notes
 * <p>
 * separator is used to determine where the split should occur, but it is not included as part of the resulting strings.
 * A split may result in more than two strings.
 * The resulting strings must maintain the same order as they were initially given.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: words = ["one.two.three","four.five","six"], separator = "."
 * Output: ["one","two","three","four","five","six"]
 */
public class SplitStringsBySeparator {

    public static void main(String[] args) {
        List<String> words = List.of(new String[]{"$easy$", "$problem$"});
        char separator = '$';
//        List<String> words = List.of(new String[]{"one.two.three", "four.five", "six"});
//        char separator = '.';
        System.out.println(splitWordsBySeparator(words, separator));
    }

    /**
     * "\\Q" and "\\E": These are special markers in Java's regular expression syntax.
     * They are used to treat the text between them as a literal string, rather than interpreting it as part of the regular expression pattern.
     * This is important because the separator might contain characters that have special meanings in regular expressions.
     * <p>
     * \\Q: Indicates the start of the literal string.
     * \\E: Indicates the end of the literal string.
     * Putting it all together, let's say separator is '-'. If you used just str.split("-"), it would work in most cases.
     * However, if the separator itself contained special characters like '[', ']', '*', etc.,
     * it could cause unexpected behavior or errors because those characters are interpreted as regular expression syntax.
     * To avoid this, the code adds \\Q at the beginning and \\E at the end of the separator,
     * ensuring that any potential special characters in the separator are treated as literals.
     */
    public static List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> output = new ArrayList<>();

        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).contains(String.valueOf(separator))) {
                String[] split = words.get(i).split("\\Q" + separator + "\\E");
                for (int j = 0; j < split.length; j++) {

                    if (split[j].length() > 0) {
                        output.add(split[j]);
                    }
                }
            } else {
                output.add(words.get(i));
            }
        }
        return output;
    }
}

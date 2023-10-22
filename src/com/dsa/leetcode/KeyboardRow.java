package com.dsa.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 19 Oct 2023
 * <p>
 * 500. Keyboard Row
 * <p>
 * <p>
 * Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.
 * <p>
 * In the American keyboard:
 * <p>
 * the first row consists of the characters "qwertyuiop",
 * the second row consists of the characters "asdfghjkl", and
 * the third row consists of the characters "zxcvbnm".
 * <p>
 * Example 1:
 * <p>
 * Input: words = ["Hello","Alaska","Dad","Peace"]
 * Output: ["Alaska","Dad"]
 */
public class KeyboardRow {

    public static void main(String[] args) {
        String[] words = new String[]{"Hello", "Alaska", "Dad", "Peace"};
        System.out.println(Arrays.toString(findWords(words)));
    }

    public static String[] findWords(String[] words) {
        String one = "qwertyuiopQWERTYUIOP";
        String two = "asdfghjklASDFGHJKL";
        String three = "zxcvbnmZXCVBNM";
        List<String> list = new LinkedList<>();
        for (int i = 0; i < words.length; i++) {
            if (check(words[i], one) || check(words[i], two) || check(words[i], three)) {
                list.add(words[i]);
            }
        }
        String[] arr = new String[list.size()];

        // Converting ArrayList to Array
        // using get() method
        for (int i = 0; i < list.size(); i++)
            arr[i] = list.get(i);

        return arr;
    }

    public static boolean check(String s, String checker) {
        boolean temp = true;
        for (char c : s.toCharArray()) {
            boolean isTrue = false;
            for (char ch : checker.toCharArray()) {
                if (c == ch) {
                    isTrue = true;
                    break;
                }
            }
            if (!isTrue) {
                return false;
            }
        }
        return temp;

    }
}

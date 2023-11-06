package com.dsa.leetcode;

import java.util.HashMap;

/**
 * 05 Nov 2023
 * <p>
 * 2325. Decode the Message
 * <p>
 * You are given the strings key and message, which represent a cipher key and a secret message, respectively. The steps to decode message are as follows:
 * <p>
 * 1.Use the first appearance of all 26 lowercase English letters in key as the order of the substitution table.
 * 2.Align the substitution table with the regular English alphabet.
 * 3.Each letter in message is then substituted using the table.
 * 4.Spaces ' ' are transformed to themselves.
 * -->For example, given key = "happy boy" (actual key would have at least one instance of each letter in the alphabet), we have the partial substitution table of ('h' -> 'a', 'a' -> 'b', 'p' -> 'c', 'y' -> 'd', 'b' -> 'e', 'o' -> 'f').
 * Return the decoded message.
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: key = "the quick brown fox jumps over the lazy dog", message = "vkbs bs t suepuv"
 * Output: "this is a secret"
 * Explanation: The diagram above shows the substitution table.
 * It is obtained by taking the first appearance of each letter in "the quick brown fox jumps over the lazy dog".
 */
public class DecodeTheMessage {

    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        System.out.println(decodeMessage(key, message));
    }

    public static String decodeMessage(String key, String message) {
        StringBuilder ans = new StringBuilder();
        HashMap<Character, Character> map = new HashMap<>();
        key = key.replace(" ", "");
        char ch = 'a';
        for (char i : key.toCharArray()) {
            if (map.containsKey(i) == false)
                map.put(i, ch++);
        }

        for (char i : message.toCharArray()) {
            if (map.containsKey(i))
                ans.append(map.get(i));
            else
                ans.append(i);
        }

        return ans.toString();
    }
}

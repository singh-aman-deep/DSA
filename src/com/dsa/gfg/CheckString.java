package com.dsa.gfg;

/**
 * 09 Nov 2023
 * <p>
 * Check String
 * <p>
 * Given a string, check if all its characters are the same or not.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * s = "geeks"
 * Output: False
 * Explanation: The string contains different
 * character 'g', 'e', 'k' and 's'.
 */
public class CheckString {
    public static void main(String[] args) {
        String s = "eeee";
        System.out.println(check(s));
    }

    static Boolean check(String s) {
        boolean flag = true;
        char matchChar = s.charAt(0);
        for (char c : s.toCharArray()) {
            if (c != matchChar) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}

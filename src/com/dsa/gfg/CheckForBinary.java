package com.dsa.gfg;

/**
 * 08 Nov 2023
 * <p>
 * Check for Binary
 * <p>
 * Given a non-empty sequence of characters str, return true if sequence is Binary, else return false
 * <p>
 * Example 1:
 * <p>
 * Input:
 * str = 101
 * Output:
 * 1
 * Explanation:
 * Since string contains only 0 and 1, output is 1.
 */
public class CheckForBinary {
    public static void main(String[] args) {
        String str = "75";
        System.out.println(isBinary(str));

    }

    static boolean isBinary(String str) {
        boolean flag = true;
        for (char c : str.toCharArray()) {
            if (c != '0' && c != '1') {
                flag = false;
                break;
            }
        }
        return flag;
    }
}

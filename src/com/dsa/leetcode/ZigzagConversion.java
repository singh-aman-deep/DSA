package com.dsa.leetcode;

import java.util.ArrayList;

/**
 * 12 Nov 2023
 * <p>
 * 6. Zigzag Conversion
 * <p>
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 * <p>
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"
 * <p>
 * Write the code that will take a string and make this conversion given a number of rows:
 * <p>
 * string convert(string s, int numRows);
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: s = "PAYPALISHIRING", numRows = 3
 * Output: "PAHNAPLSIIGYIR"
 * Example 2:
 * <p>
 * Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * Explanation:
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 * Example 3:
 * <p>
 * Input: s = "A", numRows = 1
 * Output: "A"
 */
public class ZigzagConversion {

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println(convert(s, numRows));

    }

    public static String convert(String s, int numRows) {
        if (numRows == 1 || s.length() < numRows)
            return s;

        ArrayList<StringBuilder> al = new ArrayList<>();
        int k = 0;
        for (int i = 0; i < numRows; i++)
            al.add(new StringBuilder());

        boolean down = false;
        for (char c : s.toCharArray()) {
            al.get(k).append(c);
            if (k == 0 || k == numRows - 1)
                down = !down;
            k += down ? 1 : -1;
        }

        StringBuilder st = new StringBuilder();
        for (StringBuilder str : al)
            st.append(str);
        return st.toString();
    }
}

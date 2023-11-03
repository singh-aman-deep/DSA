package com.dsa.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 16 Oct 2023
 * <p>
 * 119. Pascal's Triangle II
 * <p>
 * <p>
 * Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
 * <p>
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 * <p>
 * <a href="https://upload.wikimedia.org/wikipedia/commons/0/0d/PascalTriangleAnimated2.gif">Pascal Triangle</a>
 */
public class PascalTriangle2 {
    public static void main(String[] args) {
        int rowIndex = 3;
        System.out.println(getRow(rowIndex));
    }

    public static List<Integer> getRow(int rowIndex) {
        int[] prev = new int[rowIndex + 1];
        int[] res = new int[rowIndex + 1];
        prev[0] = 1;
        res[0] = 1;
        for (int i = 1, m; i <= rowIndex; i++) {
            m = i / 2 + 1;
            res[i] = 1;
            for (int j = 1; j < m; j++) {
                res[j] = prev[j] + prev[j - 1];
                res[i - j] = res[j];
            }
            int[] temp = res;
            res = prev;
            prev = temp;
        }
        List<Integer> Res = new ArrayList<Integer>();
        for (int r : prev) Res.add(r);
        return Res;
    }

}

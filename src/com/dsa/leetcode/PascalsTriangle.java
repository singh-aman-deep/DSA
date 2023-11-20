package com.dsa.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 20 Nov 2023
 * <p>
 * 118. Pascal's Triangle
 * <p>
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 * <p>
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: numRows = 5
 * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 */
public class PascalsTriangle {

    public static void main(String[] args) {
        int n = 5;
        System.out.println(generate(n));
    }

    /**
     * Time Complexity: O(n2), where n = number of rows(given).
     * Reason: We are generating a row for each single row. The number of rows is n. And generating an entire row takes O(n) time complexity.
     * <p>
     * Space Complexity: In this case, we are only using space to store the answer. That is why space complexity can still be considered as O(1).
     */
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        //store the entire pascal's triangle:
        for (int row = 1; row <= numRows; row++) {
            ans.add(generateRow(row));
        }
        return ans;
    }

    public static List<Integer> generateRow(int row) {
        long ans = 1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1); //inserting the 1st element

        //calculate the rest of the elements:
        for (int col = 1; col < row; col++) {
            ans = ans * (row - col);
            ans = ans / col;
            ansRow.add((int) ans);
        }
        return ansRow;
    }
}

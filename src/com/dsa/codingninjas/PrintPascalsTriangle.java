package com.dsa.codingninjas;

import java.util.Arrays;

/**
 * 20 Nov 2023
 * <p>
 * Print Pascal’s Triangle
 * <p>
 * You are given an integer ‘N’. You need to return the first ‘N’ rows of Pascal’s triangle.
 * <p>
 * Example:
 * <p>
 * Input:
 * N = 4
 * Output:
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * Explanation: The output matrix has the first four rows of Pascal’s Triangle.
 */
public class PrintPascalsTriangle {

    public static void main(String[] args) {
        int n = 4;
        System.out.println(Arrays.deepToString(pascalTriangle(n)));

    }

    public static int[][] pascalTriangle(int N) {
        // Write your code here.

        int[][] arr = new int[N][];

        for (int i = 0; i < N; i++) {

            arr[i] = new int[i + 1];

            for (int j = 0; j <= i; j++) {

                if (j == 0 || j == i)

                    arr[i][j] = 1;

                else {

                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];

                }

            }

        }

        return arr;
    }

}

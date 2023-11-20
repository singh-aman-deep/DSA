package com.dsa.gfg;

/**
 * 20 Nov 2023
 * <p>
 * Find difference between sum of diagonals
 * <p>
 * Given a matrix Grid[][] of size NxN. Calculate the absolute difference between the sums of its diagonals.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N=3
 * Grid=[[1,2,3],[4,5,6],[7,8,9]]
 * Output:
 * 0
 * Explanation:
 * Sum of primary diagonal = 1+5+9 = 15.
 * Sum of secondary diagonal = 3+5+7 = 15.
 * Difference = |15 - 15| = 0.
 */
public class FindDifferenceBetweenSumOfDiagonals {
    public static void main(String[] args) {
        int[][] grid = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int n = 3;
        System.out.println(diagonalSumDifference(n, grid));
    }

    static int diagonalSumDifference(int N, int[][] Grid) {
        int i, j, sum1 = 0, sum2 = 0;
        for (i = 0; i < N; i++) {
            // adding primary diagonal elements
            sum1 += Grid[i][i];
            // adding secondary diagonal elements
            sum2 += Grid[i][N - i - 1];
        }
        return Math.abs(sum1 - sum2);
    }
}

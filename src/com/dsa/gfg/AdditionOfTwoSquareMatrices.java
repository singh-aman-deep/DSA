package com.dsa.gfg;

/**
 * 21 Nov 2023
 * <p>
 * Addition of two square matrices
 * <p>
 * Given two square matrices matrixA and matrixB of size n x n.  Find the addition of these two matrices.
 * <p>
 * Note :- You don't have to return anything in this question (Refer YourTask section).
 * <p>
 * Example 1:
 * <p>
 * Input: matrixA = {{1, 2}, {3, 4}},
 * matrixB = {{4, 3}, {2, 1}}
 * Output: {{5, 5}, {5, 5}}
 */
public class AdditionOfTwoSquareMatrices {
    public static void main(String[] args) {
        int[][] matrixA = {{1, 2}, {3, 4}};
        int[][] matrixB = {{4, 3}, {2, 1}};

        int n = matrixA.length;
        Addition(matrixA,matrixB);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println();
        }


    }

    public static void Addition(int[][] matrixA, int[][] matrixB) {
        int n = matrixA.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               matrixA[i][j]=matrixA[i][j]+matrixB[i][j];
            }

        }
    }
}

package com.dsa.gfg;

/**
 * 22 Nov 2023
 * <p>
 * Diagonal sum
 * <p>
 * Given a square matrix of size n×n. Your task is to calculate the sum of its diagonals.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: matrix = {{1, 1, 1},
 * {1, 1, 1}, {1, 1, 1}}
 * Output: 6
 * Example 2:
 * <p>
 * Input: matrix = {{1, 2}, {3, 4}}
 * Output: 10
 */
public class DiagonalSum {

    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};

        System.out.println(DiagonalSum(matrix));
    }

    public static int DiagonalSum(int[][] matrix) {
        int n = matrix.length;
        int sum=0;

        for (int i = 0; i < n; i++) {
            sum+=matrix[i][i];

        }

        for(int j  = matrix.length - 1 , i = 0; j >= 0; j--){
            //adding the element at matrix[i][j] to the sum.
            sum += matrix[i++][j];
        }
        return sum;
    }
}

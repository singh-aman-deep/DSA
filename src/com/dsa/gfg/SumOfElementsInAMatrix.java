package com.dsa.gfg;

/**
 * 18 Nov 2023
 * <p>
 * Sum of elements in a matrix
 * <p>
 * Given a non null integer matrix Grid of dimensions NxM.Calculate the sum of its elements.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N=2,M=3
 * Grid=
 * [[1,0,1],
 * [-8,9,-2]]
 * Output:
 * 1
 * Explanation:
 * The sum of all elements of the matrix is
 * (1+0+1-8+9-2)=1.
 */
public class SumOfElementsInAMatrix {
    public static void main(String[] args) {
        int n = 2;
        int m = 3;
        int[][] grid = {{1, 0, 1}, {-8, 9, -2}};
        System.out.println(sumOfMatrix(n, m, grid));
    }

    static int sumOfMatrix(int N, int M, int[][] Grid) {
        // variable to store the sum
        int sum = 0;
        // loop through each row of the matrix
        for (int i = 0; i < N; i++)
            // loop through each column of the matrix
            for (int j = 0; j < M; j++)
                // add the current element to the sum
                sum += Grid[i][j];
        // return the final sum
        return sum;
    }
}

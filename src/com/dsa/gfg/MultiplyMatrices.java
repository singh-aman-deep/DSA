package com.dsa.gfg;

import java.util.Arrays;

/**
 * 17 Nov 2023
 *
 * Multiply Matrices
 *
 * Given two square Matrices A[][] and B[][]. Your task is to complete the function multiply which stores the multiplied matrices in a new matrix C[][].
 *
 *
 * Example 1:
 *
 * Input:
 * N = 2
 * A[][] = {{7, 8}, {2 , 9}}
 * B[][] = {{14, 5}, {5, 18}}
 * Output:
 * C[][] = {{138, 179}, {73, 172}}
 */
public class MultiplyMatrices {

    public static void main(String[] args) {
        int A[][]={{7, 8}, {2 , 9}};
        int B[][]={{14, 5}, {5, 18}};
        int C[][]=new int[2][2];
        int N=2;
        multiply(A,B,C,N);
        print2D(C);

    }
    public static void multiply(int A[][], int B[][], int C[][], int N)
    {
        //add code here.
        for(int i=0; i<N; i++){
            for(int j=0; j<A[0].length; j++){
                int sum = 0;
                for(int k=0; k<A[0].length; k++){
                    sum += A[i][k] * B[k][j];
                }
                C[i][j] = sum;
            }
        }
    }

    public static void print2D(int mat[][])
    {
        // Loop through all rows
        for (int i = 0; i < mat.length; i++)

            // Loop through all elements of current row
            for (int j = 0; j < mat[i].length; j++)
                System.out.print(mat[i][j] + " ");
    }


}

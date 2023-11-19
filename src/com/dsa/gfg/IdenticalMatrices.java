package com.dsa.gfg;

/**
 * 19 Nov 2023
 *
 * Identical Matrices
 *
 * Given two square matrices Grid1 and Grid2 with the same dimensions(NxN).Check whether they are identical or not.
 *
 * Example 1:
 *
 * Input:
 * N=2
 * Grid1=[[1,2],[3,4]]
 * Grid2=[[1,2],[3,4]]
 * Output:
 * 1
 * Explanation:
 * Both the matrices are identical,
 * so the answer is 1.
 */
public class IdenticalMatrices {

    public static void main(String[] args) {
        int N=2;
        int [] [] Grid1={{1,2},{3,4}};
        int [] [] Grid2={{1,2},{3,4}};
        System.out.println(areMatricesIdentical(N,Grid1,Grid2));

    }
   static int areMatricesIdentical(int N, int[][] Grid1, int[][] Grid2) {
       int i, j;
       for (i = 0; i < N; i++)
           for (j = 0; j < N; j++)
               // checking whether correspoding elements are same or not
               if (Grid1[i][j] != Grid2[i][j]) return 0; //if not same, return 0
       return 1;
    }
}

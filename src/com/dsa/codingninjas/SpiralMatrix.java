package com.dsa.codingninjas;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 18 Nov 2023
 * <p>
 * Spiral Matrix
 * <p>
 * Problem Statement: Given a Matrix, print the given matrix in spiral order.
 * <p>
 * Examples:
 * <p>
 * Input: Matrix[][] = { { 1, 2, 3, 4 },
 * { 5, 6, 7, 8 },
 * { 9, 10, 11, 12 },
 * { 13, 14, 15, 16 } }
 * <p>
 * Outhput: 1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10.
 * Explanation: The output of matrix in spiral form.
 */
public class SpiralMatrix {

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        System.out.println(Arrays.toString(spiralMatrix(matrix)));
    }

    public static int[] spiralMatrix(int[][] matrix) {
        // Write your code here.
        ArrayList<Integer> li = new ArrayList<>();
        int top = 0, bottom = matrix.length - 1, left = 0, right = matrix[0].length - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                li.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                li.add(matrix[i][right]);
            }
            right--;
            if (!(top <= bottom) || !(left <= right)) {
                break;
            }
            for (int i = right; i >= left; i--) {
                li.add(matrix[bottom][i]);
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                li.add(matrix[i][left]);
            }
            left++;
        }
        int[] a = new int[li.size()];
        for (int i = 0; i < li.size(); i++) {
            a[i] = li.get(i);
        }
        return a;
    }
}

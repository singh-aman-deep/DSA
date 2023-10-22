package com.dsa.leetcode;

/**
 * 14 Oct 2023
 * <p>
 * 2742. Painting the Walls
 * <p>
 * You are given two 0-indexed integer arrays, cost and time, of size n representing the costs and the
 * time taken to paint n different walls respectively. There are two painters available:
 * <p>
 * A paid painter that paints the ith wall in time[i] units of time and takes cost[i] units of money.
 * A free painter that paints any wall in 1 unit of time at a cost of 0.
 * But the free painter can only be used if the paid painter is already occupied.
 * Return the minimum amount of money required to paint the n walls.
 */
public class PaintingTheWalls {

    public static void main(String[] args) {
        int[] cost = new int[]{1, 2, 3, 2};
        int[] time = new int[]{1, 2, 3, 2};
        System.out.println(new Solution().paintWalls(cost, time));
    }

}

class Solution {
    int[][] memo;
    int n;

    public int paintWalls(int[] cost, int[] time) {
        n = cost.length;
        memo = new int[n][n + 1];
        return dp(0, n, cost, time);
    }

    public int dp(int i, int remain, int[] cost, int[] time) {
        if (remain <= 0) {
            return 0;
        }

        if (i == n) {
            return (int) 1e9;
        }

        if (memo[i][remain] != 0) {
            return memo[i][remain];
        }

        int paint = cost[i] + dp(i + 1, remain - 1 - time[i], cost, time);
        int dontPaint = dp(i + 1, remain, cost, time);
        memo[i][remain] = Math.min(paint, dontPaint);
        return memo[i][remain];
    }
}

package com.dsa.gfg;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 16 Oct 2023
 * <p>
 * Making A Large Island
 * <p>
 * You are given an n x n binary matrix grid. You are allowed to change at most one 0 to be 1. A group of connected 1s forms an island. Two 1s are connected if they share one of their sides with each other.
 * <p>
 * Return the size of the largest island in the grid after applying this operation.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * grid = [[1,0],[0,1]]
 * Output:
 * 3
 * Explanation:
 * Change any one 0 to 1 and connect two 1s, then we get an island with area = 3.
 */
public class MakingALargeIsland {
    public static void main(String[] args) {
        int N = 2;
        int[][] grid = new int[][]{{1, 0}, {0, 1}};
        System.out.println(new Solution2().largestIsland(N, grid));

    }

    static class Solution2 {
        static Map<Integer, Integer> unmap = new HashMap<>();

        // Depth-first search (DFS) function to calculate
        // the size of an island.
        static int dfs(int i, int j, int[][] grid, boolean[][] visited, int key) {
            int n = grid.length;

            // Base cases: Check for boundaries,
            // visited status, and water (grid[i][j] == 0).
            if (i < 0 || j < 0 || i >= n || j >= n || visited[i][j] || grid[i][j] == 0) {
                return 0;
            }

            // Mark the current cell as visited.
            visited[i][j] = true;

            // Recursively explore adjacent cells and
            // accumulate the island size.
            int count = 1 + dfs(i + 1, j, grid, visited, key)
                    + dfs(i - 1, j, grid, visited, key)
                    + dfs(i, j + 1, grid, visited, key)
                    + dfs(i, j - 1, grid, visited, key);

            // Update the cell's value to the key
            // representing the island.
            grid[i][j] = key;
            return count;
        }

        public int largestIsland(int N, int[][] grid) {
            int n = N;
            int key = 2;
            boolean[][] visited = new boolean[n][n];

            // Traverse the grid to identify and mark
            // islands, and store their sizes in the map.
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (!visited[i][j] && grid[i][j] == 1) {
                        int count = dfs(i, j, grid, visited, key);

                        // Store island size in the map.
                        unmap.put(key, count);
                        key++;
                    }
                }
            }

            int result = -1;
            boolean[][] visited2 = new boolean[n][n];

            // Traverse the grid again to identify water
            // cells and calculate the largest
            // possible island.
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 0) {

                        // Check adjacent cells and
                        // gather island sizes from the map.
                        int a = (i + 1 < n) ? grid[i + 1][j] : 0;
                        int b = (i - 1 >= 0) ? grid[i - 1][j] : 0;
                        int c = (j + 1 < n) ? grid[i][j + 1] : 0;
                        int d = (j - 1 >= 0) ? grid[i][j - 1] : 0;

                        // Store unique island sizes
                        // around the current water cell.
                        Set<Integer> st = new HashSet<>();
                        st.add(a);
                        st.add(b);
                        st.add(c);
                        st.add(d);

                        int res = 1;

                        // Calculate the combined size
                        // of neighboring islands.
                        for (int value : st) {
                            res += unmap.getOrDefault(value, 0);
                        }

                        // Update the largest island size.
                        result = Math.max(result, res);
                    }
                }
            }

            // If no land cells were present (only water),
            // return the size of the entire grid.
            if (result == -1) {
                return n * n;
            }
            return result;
        }
    }

}



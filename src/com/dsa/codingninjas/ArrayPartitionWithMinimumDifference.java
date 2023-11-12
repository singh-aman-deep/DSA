package com.dsa.codingninjas;

/**
 * 12 Nov 2023
 * <p>
 * Array partition with minimum difference
 * <p>
 * You are given an array 'arr' containing 'n' non-negative integers.
 * Your task is to partition this array into two subsets such that the absolute difference between subset sums is minimum.
 * You just need to find the minimum absolute difference considering any valid division of the array elements.
 * Note:
 * 1. Each array element should belong to exactly one of the subsets.
 * <p>
 * 2. Subsets need not always be contiguous.
 * For example, for the array : [1, 2, 3], some of the possible divisions are
 * a) {1,2} and {3}
 * b) {1,3} and {2}.
 * <p>
 * 3. Subset-sum is the sum of all the elements in that subset.
 * <p>
 * Example:
 * <p>
 * Input: 'n' = 5, 'arr' = [3, 1, 5, 2, 8].
 * <p>
 * Ouput: 1
 * <p>
 * Explanation: We can partition the given array into {3, 1, 5} and {2, 8}.
 * This will give us the minimum possible absolute difference i.e. (10 - 9 = 1).
 */
public class ArrayPartitionWithMinimumDifference {

    public static void main(String[] args) {

        int[] arr = {3, 1, 5, 2, 8};
        int n = arr.length;
        System.out.println(minSubsetSumDifference(arr, n));
    }

    public static int minSubsetSumDifference(int[] arr, int n) {
        int total_sum = 0;
        for (int i = 0; i < n; i++) {
            total_sum = total_sum + arr[i];
        }

        boolean dp[][] = new boolean[n][total_sum + 1];

        for (int i = 0; i < n; i++) {
            dp[i][0] = true;
        }

        if (arr[0] <= total_sum) {
            dp[0][arr[0]] = true;
        }


        for (int ind = 1; ind < n; ind++) {
            for (int target = 1; target <= total_sum; target++) {

                boolean notTaken = dp[ind - 1][target];

                boolean taken = false;
                if (arr[ind] <= target)
                    taken = dp[ind - 1][target - arr[ind]];

                dp[ind][target] = notTaken || taken;
            }
        }

        // for(int i=0;i<n;i++){
        //     for(int j= 0;j<total_sum+1;j++){
        //         System.out.print(dp[i][j]+" , ");
        //     }
        //     System.out.println();
        // }

        int mini = (int) Math.pow(10, 9);
        for (int i = 0; i <= total_sum; i++) {
            if (dp[n - 1][i] == true) {
                int diff = Math.abs(i - (total_sum - i));
                mini = Math.min(mini, diff);
            }
        }
        return mini;

    }
}

package com.dsa.striver;

import java.util.Arrays;

/**
 * 23 Oct 2023
 * Coding Ninjas
 * <p>
 * N to 1 without loop
 * <p>
 * Print N to 1 using Recursion
 */
public class NToOneWithoutLoop {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(printNos(n)));
    }

    public static int[] printNos(int x) {
        int[] arr = new int[x];
        return recu(arr, x, 0);
    }

    private static int[] recu(int[] a, int x, int n) {
        if (x < 1) return a;
        a[n] = x;
        return recu(a, x - 1, n + 1);
    }

    /*
    Time Complexity: O( n )
    Space Complexity: O( n )

    where n is the integer.
*/
    public class Solution1 {
        public void recursiveFunction(int x, int[] ans) {
            if (x == 0) {
                return;
            }
            // Insert element in the array
            ans[ans.length - x] = x;

            // Call recursive function
            recursiveFunction(x - 1, ans);
        }

        public int[] printNos(int x) {
            // Declaring empty integer array
            int[] ans = new int[x];

            // Calling recursive function
            recursiveFunction(x, ans);

            return ans;
        }
    }
}

package com.dsa.gfg;

import java.util.Arrays;

/**
 * 2 Nov 2023
 * <p>
 * Average in a stream
 * <p>
 * Given a stream of incoming numbers, find average or mean of the stream at every point.
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input:
 * n = 5
 * arr[] = {10, 20, 30, 40, 50}
 * Output: 10.00 15.00 20.00 25.00 30.00
 * Explanation:
 * 10 / 1 = 10.00
 * (10 + 20) / 2 = 15.00
 * (10 + 20 + 30) / 3 = 20.00
 * And so on.
 */
public class AverageInAStream {

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(streamAvg(arr, n)));
    }

    static float[] streamAvg(int[] arr, int n) {
        float[] output = new float[n];
        int temp = 0;
        for (int i = 0; i < n; i++) {
            temp = temp + arr[i];
            output[i] = (float) temp / (i + 1);
        }
        return output;
    }
}

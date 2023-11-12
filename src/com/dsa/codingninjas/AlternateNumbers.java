package com.dsa.codingninjas;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 10 Nov 2023
 * <p>
 * Alternate Numbers
 * <p>
 * There is an array ‘A’ of size ‘N’ with an equal number of positive and negative elements.
 * Without altering the relative order of positive and negative numbers, you must return an array of alternative positive and negative values.
 * <p>
 * Note:Start the array with a positive number.
 * <p>
 * Example:
 * <p>
 * Input:
 * A = [1, 2, -4, -5], N = 4
 * Output:
 * 1 -4  2 -5
 * Explanation:
 * Positive elements = 1, 2
 * Negative elements = -4, -5
 * To maintain relative ordering, 1 must occur before 2, and -4 must occur before -5.
 */
public class AlternateNumbers {
    public static void main(String[] args) {
//        int[] a = {1, 2, -4, -5};
        int[] a = {1, 2, -3, -1, -2, 3};
        System.out.println(Arrays.toString(alternateNumbersO(a)));
    }

    public static int[] alternateNumbersBFMy(int[] a) {
        int n = a.length;
        int output[] = new int[n];
        int positive[] = new int[n / 2];
        int negative[] = new int[n / 2];
        int posCount = 0;
        int negCount = 0;
        for (int i = 0; i < (n); i++) {
            if (a[i] > 0) {
                positive[posCount] = a[i];
                posCount++;
            } else {
                negative[negCount] = a[i];
                negCount++;
            }
        }
        posCount = 0;
        negCount = 0;
        for (int i = 0; i < (n); i++) {
            if (i % 2 == 0) {
                output[i] = positive[posCount];
                posCount++;
            } else {
                output[i] = negative[negCount];
                negCount++;
            }
        }
        return output;
    }

    /**
     * Time Complexity: O(N+N/2) { O(N) for traversing the array once for segregating positives and negatives and another O(N/2) for adding those elements alternatively to the array, where N = size of the array A}.
     * <p>
     * Space Complexity:  O(N/2 + N/2) = O(N) { N/2 space required for each of the positive and negative element arrays, where N = size of the array A}.
     */
    public static int[] alternateNumbersBF(int[] a) {
        int n = a.length;
        // Define 2 vectors, one for storing positive
        // and other for negative elements of the array.
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        // Segregate the array into positives and negatives.
        for (int i = 0; i < n; i++) {

            if (a[i] > 0) pos.add(a[i]);
            else neg.add(a[i]);
        }

        // Positives on even indices, negatives on odd.
        for (int i = 0; i < n / 2; i++) {

            a[2 * i] = pos.get(i);
            a[2 * i + 1] = neg.get(i);
        }


        return a;
    }

    /**
     * Time Complexity: O(N) { O(N) for traversing the array once and substituting positives and negatives simultaneously using pointers, where N = size of the array A}.
     * <p>
     * Space Complexity:  O(N) { Extra Space used to store the rearranged elements separately in an array, where N = size of array A}.
     */
    public static int[] alternateNumbersO(int[] a) {
        int n = a.length;
        int output[] = new int[n];
        int posIndex = 0, negIndex = 1;
        for (int i = 0; i < n; i++) {

            if (a[i] < 0) {
                output[negIndex] = a[i];
                negIndex += 2;

            } else {
                output[posIndex] = a[i];
                posIndex += 2;

            }
        }


        return output;
    }


}

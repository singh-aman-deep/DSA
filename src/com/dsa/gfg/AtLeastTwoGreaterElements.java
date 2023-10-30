package com.dsa.gfg;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 30 Oct 2023
 * <p>
 * At least two greater elements
 * <p>
 * Given an array of N distinct elements,
 * the task is to find all elements in array except two greatest elements in sorted order.
 * <p>
 * Example 1:
 * <p>
 * Input :
 * a[] = {2, 8, 7, 1, 5}
 * Output :
 * 1 2 5
 * Explanation :
 * The output three elements have two or
 * more greater elements.
 */
public class AtLeastTwoGreaterElements {
    public static void main(String[] args) {
//        long a[] = {2, 8, 7, 1, 5};
        long a[] = {7, -2, 3, 4, 9, -1};
        int n = a.length;
        System.out.println(Arrays.toString(findElements(a, n)));
    }

    public static long[] findElements(long a[], long n) {
        ArrayList<Long> output = new ArrayList<>();
        long firstLargest=Long.MIN_VALUE;
        long secondLargest=Long.MIN_VALUE;

        for (long l : a) {
            if (l > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = l;
            } else if (l > secondLargest && l != firstLargest) {
                secondLargest = l;

            }
        }

        for (long l : a) {
            if (l != firstLargest && l != secondLargest) {
                output.add(l);
            }
        }
        long[] longArray = new long[output.size()];
        for (int i = 0; i < output.size(); i++) {
            longArray[i] = output.get(i);
        }
        Arrays.sort(longArray);
        return longArray;
    }

    public static long[] findElements1(long a[], long n) {
        int length = a.length;
        Arrays.sort(a);
        long[] output = new long[length-2];
        for(int i=0; i< n-2 ;i++){
            output[i] = a[i];
        }
        return output;
    }
}

package com.dsa.codingninjas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 2 Nov 2023
 * <p>
 * Merge 2 Sorted Array
 * <p>
 * Problem Statement: Given two sorted arrays, arr1, and arr2 of size n and m. Find the union of two sorted arrays.
 * <p>
 * The union of two arrays can be defined as the common and distinct elements in the two arrays.
 * NOTE: Elements in the union should be in ascending order.
 * <p>
 * Example 1:
 * Input:
 * n = 5,m = 5.
 * arr1[] = {1,2,3,4,5}
 * arr2[] = {2,3,4,4,5}
 * Output:
 * {1,2,3,4,5}
 * <p>
 * Explanation:
 * Common Elements in arr1 and arr2  are:  2,3,4,5
 * Distnict Elements in arr1 are : 1
 * Distnict Elemennts in arr2 are : No distinct elements.
 * Union of arr1 and arr2 is {1,2,3,4,5}
 */
public class Merge2SortedArray {

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 6};
        int[] b = new int[]{2, 3, 5};
        System.out.println(sortedArrayO(a, b));
    }

    public static List<Integer> sortedArray(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();
        for (int j : a) {
            set.add(j);
        }

        for (int j : b) {
            set.add(j);
        }
        return new ArrayList<>(set);
    }

    public static List<Integer> sortedArrayO(int[] a, int[] b) {
        int i = 0, j = 0; // pointers
        int n = a.length;
        int m = b.length;
        ArrayList<Integer> union = new ArrayList<>(); // Uninon vector
        while (i < n && j < m) {
            if (a[i] <= b[j]) // Case 1 and 2
            {
                if (union.size() == 0 || union.get(union.size() - 1) != a[i])
                    union.add(a[i]);
                i++;
            } else // case 3
            {
                if (union.size() == 0 || union.get(union.size() - 1) != b[j])
                    union.add(b[j]);
                j++;
            }
        }
        while (i < n) // IF any element left in a
        {
            if (union.get(union.size() - 1) != a[i])
                union.add(a[i]);
            i++;
        }
        while (j < m) // If any elements left in b
        {
            if (union.get(union.size() - 1) != b[j])
                union.add(b[j]);
            j++;
        }
        return union;
    }
}

package com.dsa.codingninjas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 14 Nov 2023
 * <p>
 * Superior Elements
 * <p>
 * There is an integer array ‘a’ of size ‘n’.
 * An element is called a Superior Element if it is greater than all the elements present to its right.
 * You must return an array all Superior Elements in the array ‘a’.
 * <p>
 * Note:
 * The last element of the array is always a Superior Element.
 * <p>
 * Example:
 * Input: a = [1, 2, 3, 2], n = 4
 * <p>
 * Output: 2 3
 * <p>
 * Explanation:
 * a[ 2 ] = 3 is greater than a[ 3 ]. Hence it is a Superior Element.
 * a[ 3 ] = 2 is the last element. Hence it is a Superior Element.
 * The final answer is in sorted order.
 */
public class SuperiorElements {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 2};
//        int[] a = {1,2 ,2 ,1};
        System.out.println(superiorElementsO(a));

    }

    public static List<Integer> superiorElementsMy(int[] a) {
        List<Integer> output = new ArrayList<>();
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int counter = 0;
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    counter++;
                } else {
                    counter--;
                }
            }
            if (counter == n - i - 1) {
                output.add(a[i]);
            }
        }
        Collections.sort(output);
        return output;
    }

    /**
     * Time Complexity: O(N^2) { Since there are nested loops being used, at the worst case n^2 time would be consumed }.
     * <p>
     * Space Complexity: O(N) { There is no extra space being used in this approach. But,
     * a O(N) of space for ans array will be used in the worst case }.
     */
    public static List<Integer> superiorElementsBF(int[] a) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = a.length;

        for (int i = 0; i < n; i++) {
            boolean leader = true;

            //Checking whether arr[i] is greater than all
            //the elements in its right side
            for (int j = i + 1; j < n; j++)
                if (a[j] > a[i]) {

                    // If any element found is greater than current leader
                    // curr element is not the leader.
                    leader = false;
                    break;
                }

            // Push all the leaders in ans array.
            if (leader)
                ans.add(a[i]);

        }
        Collections.sort(ans);

        return ans;
    }


    /**
     * Time Complexity: O(N) { Since the array is traversed single time back to front, it will consume O(N) of time where N = size of the array }.
     *
     * Space Complexity: O(N) { There is no extra space being used in this approach. But, a O(N) of space for ans array will be used in the worst case }.
     */
    public static List<Integer> superiorElementsO(int[] a) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = a.length;
        int max=Integer.MIN_VALUE;

        for (int i = n - 1; i >= 0; i--) {
            if (a[i]>max){
                max=a[i];
                ans.add(a[i]);
            }

        }
//        Collections.sort(ans);

        return ans;
    }
}

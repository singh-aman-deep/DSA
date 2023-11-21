package com.dsa.codingninjas;

import java.util.ArrayList;
import java.util.List;

/**
 * 21 Nov 2023
 *
 * Majority Element
 *
 * Given an array ‘A’ of ‘N’ integers, find the majority elements of the array.>
 *
 * A majority element in an array ‘A’ of size ‘N’ is an element that appears more than floor(N / 3) times.>
 * Note: The floor function returns the number rounded down to the nearest integer.>
 * Note: Return the array of majority elements in sorted order.>
 *
 * Example;
 *
 * Input: ‘N’ = 9 ‘A’ = [2, 2, 1, 3, 1, 1, 3, 1, 1]
 *
 * Output: 1
 *
 * Explanation: The frequency of ‘1’ is 5, which is greater than floor(N / 3), hence ‘1’ is the majority element.
 */
public class MajorityElementNBy3 {
    public static void main(String[] args) {
        int [] v={ 2,2,1,3,1,1,3,1,1};
        System.out.println(majorityElement(v));

    }

    /**
     * Time Complexity: O(N) + O(N), where N = size of the given array.
     * Reason: The first O(N) is to calculate the counts and find the expected majority elements. The second one is to check if the calculated elements are the majority ones or not.
     *
     * Space Complexity: O(1) as we are only using a list that stores a maximum of 2 elements. The space used is so small that it can be considered constant.
     */
    public static List< Integer > majorityElement(int []v) {
        int n = v.length; //size of the array

        int cnt1 = 0, cnt2 = 0; // counts
        int el1 = Integer.MIN_VALUE; // element 1
        int el2 = Integer.MIN_VALUE; // element 2

        // applying the Extended Boyer Moore's Voting Algorithm:
        for (int i = 0; i < n; i++) {
            if (cnt1 == 0 && el2 != v[i]) {
                cnt1 = 1;
                el1 = v[i];
            } else if (cnt2 == 0 && el1 != v[i]) {
                cnt2 = 1;
                el2 = v[i];
            } else if (v[i] == el1) cnt1++;
            else if (v[i] == el2) cnt2++;
            else {
                cnt1--; cnt2--;
            }
        }

        List<Integer> ls = new ArrayList<>(); // list of answers

        // Manually check if the stored elements in
        // el1 and el2 are the majority elements:
        cnt1 = 0; cnt2 = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] == el1) cnt1++;
            if (v[i] == el2) cnt2++;
        }

        int mini = (int)(n / 3) + 1;
        if (cnt1 >= mini) ls.add(el1);
        if (cnt2 >= mini) ls.add(el2);

        // Uncomment the following line
        // if it is told to sort the answer array:
        //Collections.sort(ls); //TC --> O(2*log2) ~ O(1);

        return ls;
    }
}

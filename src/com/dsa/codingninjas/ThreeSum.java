package com.dsa.codingninjas;

import java.util.*;

/**
 * 22 Nov 2023
 * <p>
 * Three Sum
 * <p>
 * You are given an array  ARR containing N integers.
 * <p>
 * Return all the unique triplets [ARR[i], ARR[j], ARR[k]] such that i != j, j != k and k != i and their sum is equal to zero.>
 * <p>
 * Example:
 * <p>
 * Input: ‘N’ = 5
 * 'ARR' =  [-1, -1, 2, 0, 1]
 * <p>
 * Output:
 * -1 -1 2
 * -1 0 1
 * <p>
 * Explanation:
 * (-1 -1 +2) = (-1 +0 +1) = 0.
 */
public class ThreeSum {

    public static void main(String[] args) {
        int[] arr = {-1, -1, 2, 0, 1};
        int n = arr.length;
        System.out.println(tripletBF(n, arr));

    }

    public static List<List<Integer>> tripletMy(int n, int[] arr) {
        List<List<Integer>> output = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                for (int k = j; k < n; k++) {

                    if (i != j && j != k) {
                        int sum = arr[i] + arr[j] + arr[k];
                        if (sum == 0) {
                            List<Integer> triplet = new ArrayList<>();
                            triplet.add(arr[i]);
                            triplet.add(arr[j]);
                            triplet.add(arr[k]);
                            Collections.sort(triplet);
                            if (!output.contains(triplet)) {
                                output.add(triplet);
                            }
                        }
                    }

                }
            }
        }
        return output;
    }

    /**
     * Time Complexity: O(N3 * log(no. of unique triplets)), where N = size of the array.
     * Reason: Here, we are mainly using 3 nested loops. And inserting triplets into the set takes O(log(no. of unique triplets)) time complexity. But we are not considering the time complexity of sorting as we are just sorting 3 elements every time.
     * <p>
     * Space Complexity: O(2 * no. of the unique triplets) as we are using a set data structure and a list to store the triplets.
     */
    public static List<List<Integer>> tripletBF(int n, int[] arr) {
        Set<List<Integer>> st = new HashSet<>();

        // check all possible triplets:
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                        temp.sort(null);
                        st.add(temp);
                    }
                }
            }
        }

        // store the set elements in the answer:
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }


    /**
     * Time Complexity: O(N2 * log(no. of unique triplets)), where N = size of the array.
     * Reason: Here, we are mainly using 3 nested loops. And inserting triplets into the set takes O(log(no. of unique triplets)) time complexity. But we are not considering the time complexity of sorting as we are just sorting 3 elements every time.
     *
     * Space Complexity: O(2 * no. of the unique triplets) + O(N) as we are using a set data structure and a list to store the triplets and extra O(N) for storing the array elements in another set.
     */
    public static List<List<Integer>> tripletB(int n, int[] arr) {
        Set<List<Integer>> st = new HashSet<>();

        for (int i = 0; i < n; i++) {
            Set<Integer> hashset = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                //Calculate the 3rd element:
                int third = -(arr[i] + arr[j]);

                //Find the element in the set:
                if (hashset.contains(third)) {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], third);
                    temp.sort(null);
                    st.add(temp);
                }
                hashset.add(arr[j]);
            }
        }

        // store the set elements in the answer:
        List<List<Integer>> ans = new ArrayList<>(st);
        return ans;
    }

    /**
     * Time Complexity: O(NlogN)+O(N2), where N = size of the array.
     * Reason: The pointer i, is running for approximately N times. And both the pointers j and k combined can run for approximately N times including the operation of skipping duplicates. So the total time complexity will be O(N2).
     *
     * Space Complexity: O(no. of quadruplets), This space is only used to store the answer. We are not using any extra space to solve this problem. So, from that perspective, space complexity can be written as O(1).
     */
    public static List<List<Integer>> tripletO(int n, int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            //remove duplicates:
            if (i != 0 && arr[i] == arr[i - 1]) continue;

            //moving 2 pointers:
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    //skip the duplicates:
                    while (j < k && arr[j] == arr[j - 1]) j++;
                    while (j < k && arr[k] == arr[k + 1]) k--;
                }
            }
        }

        return ans;
    }
}

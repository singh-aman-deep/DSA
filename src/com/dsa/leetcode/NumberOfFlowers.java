package com.dsa.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * You are given a 0-indexed 2D integer array flowers, where flowers[i] = [starti, endi] means
 * the ith flower will be in full bloom from starti to endi (inclusive).
 * You are also given a 0-indexed integer array people of size n, where people[i] is the time
 * that the ith person will arrive to see the flowers.
 * *****
 * Return an integer array answer of size n, where answer[i] is the number of flowers that are in
 * full bloom when the ith person arrives.
 * *****
 * Input: flowers = [[1,6],[3,7],[9,12],[4,13]], poeple = [2,3,7,11]
 * Output: [1,2,2,2]
 * *****
 * Explanation: The figure above shows the times when the flowers are in full bloom and when the people arrive.
 * For each person, we return the number of flowers in full bloom during their arrival.
 */
public class NumberOfFlowers {

    public static void main(String[] args) {

        int[][] flowers = new int[][]{{1, 10}, {3, 3}};
        int[] peoples = new int[]{3, 3, 2};

        System.out.println(Arrays.toString(fullBloomFlowers(flowers, peoples)));
    }

    public static int[] fullBloomFlowers(int[][] flowers, int[] people) {
        //create copy of people array for sorting
        int[] peopleSorted = Arrays.copyOf(people, people.length);
        //Sort people array
        Arrays.sort(peopleSorted);
        //Sort flower array
        Arrays.sort(flowers, (a, b) -> Arrays.compare(a, b));
        //Create hashmap
        Map<Integer, Integer> dic = new HashMap();
        //Create heap using PriorityQueue
        PriorityQueue<Integer> heap = new PriorityQueue();

        int i = 0;

        //Iterate over sortedPeople. For each person
        for (int person : peopleSorted) {
            //the flower at i already started blooming
            while (i < flowers.length && flowers[i][0] <= person) {
                //push to heap
                heap.add(flowers[i][1]);
                //increment the count
                i++;
            }

            while (!heap.isEmpty() && heap.peek() < person) {
                //pop from heap
                heap.remove();
            }

            //put heap into hashmap
            dic.put(person, heap.size());
        }

        int[] result = new int[people.length];
        for (int j = 0; j < people.length; j++) {
            result[j] = dic.get(people[j]);
        }

        return result;
    }
}

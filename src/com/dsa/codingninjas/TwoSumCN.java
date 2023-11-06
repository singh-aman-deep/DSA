package com.dsa.codingninjas;

import java.util.HashMap;
import java.util.Map;

/**
 * 06 Nov 2023
 * <p>
 * Two Sum
 * <p>
 * Sam want to read exactly ‘TARGET’ number of pages.
 * He has an array ‘BOOK’ containing the number of pages for ‘N’ books.
 * Return YES/NO, if it is possible for him to read any 2 books and he can meet his ‘TARGET’ number of pages.
 * <p>
 * Input: ‘N’ = 5, ‘TARGET’ = 5
 * ‘BOOK’ = [4, 1, 2, 3, 1]
 * <p>
 * Output: YES
 * Explanation:
 * Sam can buy 4 pages book and 1 page book.
 */
public class TwoSumCN {

    public static void main(String[] args) {
        int [] book={4,1,2,3,1};
        int n= book.length;
        int target=5;
        System.out.println(readB(n,book,target));

    }

    public static String readBF(int n, int []book, int target){
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (book[i] + book[j] == target) {
                    return "YES";
                }
            }
        }
        return "NO"; // No solution found
    }

    public static String readB(int n, int []book, int target){
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < n - 1; i++) {
            int a=book[i];
            int more=target-a;
            if (map.containsKey(more)){
                return "YES";
            }else {
                map.put(a,i);
            }

        }
        return "NO"; // No solution found
    }

}

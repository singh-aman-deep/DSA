package com.dsa.gfg;

/**
 * 3 Nov 2023
 * <p>
 * Display longest name
 * <p>
 * Given a list of names, display the longest name.
 * <p>
 * Example:
 * <p>
 * Input:
 * N = 5
 * names[] = { "Geek", "Geeks", "Geeksfor",
 * "GeeksforGeek", "GeeksforGeeks" }
 * <p>
 * Output:
 * GeeksforGeeks
 */
public class DisplayLongestName {
    public static void main(String[] args) {
        int n = 6;
        String names[] = {"Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks"};
        System.out.println(longest(names, n));
    }

    static String longest(String names[], int n) {
        String output;
        output = names[0];
        for (int i = 0; i < n; i++) {
            if (names[i].length() > output.length()) {
                output = names[i];
            }
        }
        return output;
    }
}

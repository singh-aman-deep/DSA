package com.dsa.codingninjas;

import java.util.ArrayList;
import java.util.List;

/**
 * 13 Nov 2023
 * <p>
 * Alien dictionary
 * You have been given a sorted (lexical order) dictionary of an alien language.
 * Write a function that returns the order of characters as a string in the alien language. This dictionary will be given to you as an array of strings called 'dictionary', of size 'N'
 * Example :
 * <p>
 * If the dictionary consists of the following words:-
 * ["caa", "aaa", "aab"], and 'K' is 3.
 * <p>
 * Then, the order of the alphabet is -
 * ['c', 'a', 'b']
 * <p>
 * Note:
 * <p>
 * If the language consists of four letters, the four letters should be the starting four letters of the English language.
 * <p>
 * However, their order might differ in the alien language.
 */
public class AlienDictionaryHard {
    public static void main(String[] args) {
        String[] arr = {"a", "aa", "aaa" };
        int k = 1;
        System.out.println(getAlienLanguage(arr, k));
    }

    public static String getAlienLanguage(String[] dictionary, int k) {
        List<List<Integer>> adj = new ArrayList();
        for (int i = 0; i < k; i++) {
            adj.add(new ArrayList());
        }
        for (int i = 0; i < dictionary.length - 1; i++) {
            String a = dictionary[i];
            String b = dictionary[i + 1];
            int len = Math.min(a.length(), b.length()), j = 0;
            while (j < len) {
                if (a.charAt(j) != b.charAt(j)) {
                    adj.get(a.charAt(j) - 'a').add(b.charAt(j) - 'a');
                    break;
                }
                j++;
            }
        }
        StringBuilder ans = new StringBuilder();
        boolean[] vis = new boolean[k];
        for (int i = 0; i < k; i++) {
            if (!vis[i]) {
                dfs(i, vis, adj, ans);
            }
        }
        return ans.toString();
    }

    public static void dfs(int V, boolean vis[], List<List<Integer>> l, StringBuilder ans) {
        vis[V] = true;
        for (int i : l.get(V)) {
            if (!vis[i]) dfs(i, vis, l, ans);
        }
        ans.insert(0, (char) (V + 'a'));
    }
}

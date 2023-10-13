package com.dsa.codingninjas;

import java.util.HashMap;
import java.util.Map;

/**
 * 13 Oct 2023
 * <p>
 * Alien Dictionary
 * <p>
 * Ninja is learning a new but strange language known as Alien Language.
 * Alien language possesses the same alphabets as of English language,
 * but their order is different. The order of letters are given as ‘ORDER’ string. Ninja has ‘N’ words in
 * the ‘WORDS’ array. Ninja’s task is to check whether the words of ‘WORDS’ are sorted lexicographically
 * in this alien language or not.
 * <p>
 * <p>
 * 2
 * 3
 * word world row
 * worldabcefghijkmnpqstuvxyz
 * 2
 * ninja codingninja
 * nabcdefghijklmopqrstuvwxyz
 */
public class AlienDictionary {
    public static void main(String[] args) {
//        int n = 3;
//        String[] arr = new String[]{"word", "world", "row"};
//        String order = "worldabcefghijkmnpqstuvxyz";
        int n = 2;
        String[] arr = new String[]{"ninja", "codingninja"};
        String order = "nabcdefghijklmopqrstuvwxyz";
        String output = alienDictonary(n, arr, order) ? "YES" : "NO";
        System.out.println(output);
    }

    public static Boolean alienDictonary(int n, String words[], String order) {
        Map<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < order.length(); i++) {
            mp.put(order.charAt(i), i);
        }

        for (int i = 1; i < words.length; i++) {
            String f = words[i - 1];
            String s = words[i];
            int num = Math.min(f.length(), s.length());
            boolean fl = false;

            for (int j = 0; j < num; j++) {
                if (mp.get(f.charAt(j)) < mp.get(s.charAt(j))) {
                    fl = true;
                    break;
                } else if (mp.get(f.charAt(j)) > mp.get(s.charAt(j))) {
                    return false;
                }
            }

            if (!fl && f.length() > s.length()) {
                return false;
            }
        }

        return true;
    }
}

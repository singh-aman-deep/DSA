package com.dsa.gfg;

/**
 * 12 Nov 2023
 * <p>
 * Remove characters from alphanumeric string
 * <p>
 * Remove all characters except the numeric characters from an alphanumeric string.
 * <p>
 * Example 1:
 * <p>
 * Input: S = "AA1d23cBB4"
 * Output: 1234
 * Explanation: Remove all characters
 * other than numbers
 */
public class RemoveCharactersFromAlphanumericString {
    public static void main(String[] args) {
        String s = "AA1d23cBB4";
        System.out.println(removeCharacters(s));
    }

    static String removeCharacters(String S) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0;i<S.length();i++){
            if((int)S.charAt(i)>47 && (int)S.charAt(i) < 58 ){
                sb.append(S.charAt(i));
            }
        }
        return sb.toString();
    }
}

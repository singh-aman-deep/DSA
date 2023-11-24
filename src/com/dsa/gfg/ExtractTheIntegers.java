package com.dsa.gfg;

import java.util.ArrayList;

/**
 * 24 Nov 2023
 * <p>
 * Extract the integers
 * <p>
 * Given a string s, extract all the integers from s.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * s = "1: Prakhar Agrawal, 2: Manish Kumar Rai,
 * 3: Rishabh Gupta56"
 * Output: 1 2 3 56
 * Explanation:
 * 1, 2, 3, 56 are the integers present in s.
 */
public class ExtractTheIntegers {
    public static void main(String[] args) {
        String s = "1: Prakhar Agrawal, 2: Manish Kumar Rai, 3: Rishabh Gupta56";

        System.out.println(extractIntegerWords(s));

    }

    static ArrayList<String> extractIntegerWords(String s) {
        // Initialize an ArrayList to store the extracted integer words
        ArrayList<String> ans = new ArrayList<String>();
        // Initialize a variable to keep track of the current integer word
        int x=0;
        // Initialize a StringBuilder to build the current integer word
        StringBuilder tmp = new StringBuilder();
        // Loop through each character in the string
        for(int i=0;i<s.length();i++)
        {
            // If the character is not a digit, skip to the next iteration
            if(s.charAt(i)<'0'||s.charAt(i)>'9')
                continue;
            // Append the character to the current integer word
            tmp.append(s.charAt(i));
            // If the next character is also a digit, do not add the current integer word yet
            if(i+1<s.length()&&'0'<=s.charAt(i+1)&&s.charAt(i+1)<='9')
                continue;
            // Add the current integer word to the ArrayList
            ans.add(tmp.toString());
            // Reset the StringBuilder for the next integer word
            tmp.delete(0,tmp.length());
            // Reset the variable for the next iteration
            x=0;
        }
        // Return the ArrayList of extracted integer words
        return ans;
    }

}

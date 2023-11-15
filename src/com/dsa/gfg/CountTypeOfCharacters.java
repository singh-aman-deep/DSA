package com.dsa.gfg;

/**
 * 15 Nov 2023
 *
 * Count type of Characters
 *
 * Given a string S, write a program to count the occurrence of Lowercase characters, Uppercase characters, Special characters and Numeric values in the string.
 * Note: There are no white spaces in the string.
 *
 * Example 1:
 *
 * Input:
 * S = "#GeeKs01fOr@gEEks07"
 * Output:
 * 5
 * 8
 * 4
 * 2
 * Explanation: There are 5 uppercase characters,
 * 8 lowercase characters, 4 numeric characters
 * and 2 special characters.
 *
 */
public class CountTypeOfCharacters {

    public static void main(String[] args) {
        String s="#GeeKs01fOr@gEEks07";
    }

   static int[] count (String s)
    {
        int res[] = new int[4];

        // Iterate through each character in the string
        for (int i = 0; i < s.length (); ++i)
        {
            // If the character is an uppercase letter, increment the count for uppercase letters
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') res[0]++;

                // If the character is a lowercase letter, increment the count for lowercase letters
            else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') res[1]++;

                // If the character is a digit, increment the count for digits
            else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') res[2]++;

                // If the character is neither an uppercase letter, lowercase letter, nor digit, increment the count for special characters
            else res[3]++;
        }

        return res; // Return the array with counts of each type of character
    }
}

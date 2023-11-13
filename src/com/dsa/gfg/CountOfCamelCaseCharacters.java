package com.dsa.gfg;

/**
 * 13 Nov 2023
 * <p>
 * Count of camel case characters
 * <p>
 * Given a string. Count the number of Camel Case characters in it.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * S = "ckjkUUYII"
 * Output: 5
 * Explanation: Camel Case characters present:
 * U, U, Y, I and I.
 */
public class CountOfCamelCaseCharacters {

    public static void main(String[] args) {
        String s = "ckjkUUYII";
        System.out.println(countCamelCase(s));
    }

    static int countCamelCase(String s) {
        int res = 0; //initialize the result to 0
        for (int i = 0; i < s.length(); ++i) //iterate through each character in the string
        {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') //check if the character is a capital letter
            {
                res++; //increment the result counter
            }
        }

        return res; //return the final count of camel case letters
    }
}

package com.dsa.gfg;

/**
 * 1 Nov 2023
 *
 * Fascinating Number
 *
 * Given a number N. Your task is to check whether it is fascinating or not.
 * Fascinating Number: When a number(should contain 3 digits or more) is multiplied by 2 and 3,
 * and when both these products are concatenated with the original number, then it results in all digits
 * from 1 to 9 present exactly once.
 *
 * Example 1:
 *
 * Input:
 * N = 192
 * Output: Fascinating
 * Explanation: After multiplication with 2
 * and 3, and concatenating with original
 * number, number will become 192384576
 * which contains all digits from 1 to 9.
 */
public class FascinatingNumber {

    public static void main(String[] args) {
            System.out.print(isFascinating(192));
    }

    public static boolean isFascinating(int num)
    {

        // frequency count array
        //using 1 indexing
        int[] freq = new int[10];

        // obtaining the resultant number
        // using string concatenation
        String val = "" + num + num * 2 +
                num * 3;

        // Traversing the string character //by character
        for (int i = 0; i < val.length(); i++)
        {

            // gives integer value of //a character digit
            int digit = val.charAt(i) - '0';

            // To check if any digit has
            // appeared multiple times
            if (freq[digit]>0 && digit != 0)
                return false;
            else
                freq[digit]++;
        }

        // Traversing through freq array to
        // check if any digit was missing
        for (int i = 1; i < freq.length; i++)
        {
            if (freq[i] == 0)
                return false;
        }
        return true;
    }
}

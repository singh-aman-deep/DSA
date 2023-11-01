package com.dsa.gfg;

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

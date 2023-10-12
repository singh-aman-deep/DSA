package com.dsa.codingninjas;

import java.util.Arrays;

/**
 * 12 Oct 2023
 * Next Greater Element III
 * <p>
 * Alice and Bob were given homework to bring a number. As usual, Bob forgot to do it and asked Alice if he could copy her’s. Alice agreed to help him only if he rearranged the digits of her number such that the new number was strictly greater than the old one. Also, the teacher does not like big numbers, so Bob needs to make sure his number is as small as possible.
 * <p>
 * In the first test case, 252 is the smallest possible number that can be made by rearranging the digits of 225 and is greater than 225. Another possible arrangement is 522, but it’s not the smallest possible.
 */
public class NextGreaterElement {
    public static void main(String[] args) {
        System.out.println(bobsHomework(39));
//        System.out.println(nextPermutation(342));
//        nextPermutation(39);

    }

    static int nextPermutation(int number) {
        char[] arr = String.valueOf(number).toCharArray();
        int n = arr.length;

        // If number of digits is 1 then just return the vector
        if (n == 1)
            return -1;

        // Start from the right most digit and find the first
        // digit that is
        // smaller than the digit next to it.
        int i = 0;
        for (i = n - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1])
                break;
        }

        // If there is a possibility of a next greater element
        if (i != 0) {

            // Find the smallest digit on right side of (i-1)'th
            // digit that is
            // greater than number[i-1]
            for (int j = n - 1; j >= i; j--) {
                if (arr[i - 1] < arr[j]) {

                    // Swap the found smallest digit i.e. arr[j]
                    // with arr[i-1]
                    int temp = arr[j];
                    arr[j] = arr[i - 1];
                    arr[i - 1] = (char) temp;
                    break;
                }
            }
        } else {
            return -1;
        }

        // Reverse the digits after (i-1) because the digits
        // after (i-1) are in decreasing order and thus we will
        // get the smallest element possible from these digits
        int[] res = new int[arr.length];
        int ind = arr.length - 1;

        // copying the first i elements of arr
        // into res
        for (int j = 0; j < i; j++)
            res[j] = arr[j];

        // copying the rest of the elements
        // in reverse order
        for (int j = i; j < res.length; j++)
            res[j] = arr[ind--];

        // If i is 0 that means elements are in decreasing order
        // Therefore, no greater element possible then we just
        // return the lowest possible
        // order/element formed from these digits by just
        // reversing the vector
        return Integer.parseInt(new String(arr));
    }

    public static long bobsHomework(int num) {

        char[] ar = String.valueOf(num).toCharArray();
        int length = ar.length;
        int i;

        // I) Start from the right most digit
        // and find the first digit that is smaller
        // than the digit next to it.
        for (i = length - 1; i > 0; i--) {
            if (ar[i] > ar[i - 1]) {
                break;
            }
        }

        // If no such digit is found, then all
        // digits are in descending order means
        // there cannot be a greater number with
        // same set of digits
        if (i == 0) {
            return -1;
        } else {
            int x = ar[i - 1], min = i;

            // II) Find the smallest digit on right
            // side of (i-1)'th digit that is greater
            // than number[i-1]
            for (int j = i + 1; j < length; j++) {
                if (ar[j] > x && ar[j] < ar[min]) {
                    min = j;
                }
            }

            // III) Swap the above found smallest
            // digit with number[i-1]
            swap(ar, i - 1, min);

            // IV) Sort the digits after (i-1)
            // in ascending order
            Arrays.sort(ar, i, length);
            return Integer.parseInt(new String(ar));
        }
    }

    static void swap(char ar[], int i, int j) {
        char temp = ar[i];
        ar[i] = ar[j];
        ar[j] = temp;
    }

}

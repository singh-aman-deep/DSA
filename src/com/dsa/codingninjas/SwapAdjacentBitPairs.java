package com.dsa.codingninjas;

/**
 * You are given an integer 'N'. Your task is to find the number formed after swapping each even bit of 'N' in its binary representation with its adjacent bit on the right, assuming that the least significant bit is an odd bit.
 * For the first test case :
 * The binary representation of 9 is 1001. Here, we will swap the 2nd bit with the 1st bit and the 4th bit with 3rd bit. The resulting binary number will be 0110. Hence, the answer is 6 in this case.
 *
 * For the second test case :
 * The binary representation of 2 is 10. Here, we will swap the 2nd bit with the 1st bit. The resulting binary number will be 01 or 1. Hence, the answer is 1 in this case.
 */
public class SwapAdjacentBitPairs {

    public static void main(String[] args) {
        int input = 45;
        System.out.println(swapAdjacent(input));
    }

    public static int swapAdjacent(int n) {
        int evenBits = n & 0xAAAAAAAA; // Mask to extract even-positioned bits
        int oddBits = n & 0x55555555; // Mask to extract odd-positioned bits

        evenBits >>= 1; // Right-shift even bits to the right by 1 position
        oddBits <<= 1; // Left-shift odd bits to the left by 1 position

        return evenBits | oddBits;// Combine the swapped even and odd bits
    }

}

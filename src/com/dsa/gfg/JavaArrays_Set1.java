package com.dsa.gfg;

/**
 * 06 Nov 2023
 * <p>
 * Java Arrays | Set 1
 * <p>
 * For a given array of price of items,you have to calculate the average of all prices upto 2 decimal places.
 * Note: Sum is printed automatically, you only need to calculate and return the average
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input:
 * 5
 * 1 2 3 4 5
 * Output:
 * 15 3.00
 * Explanation:
 * Sum of the array is 15, hence
 * average is 15/5=3.00.
 */
public class JavaArrays_Set1 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int n = a.length;
        System.out.println(average(a,n));
    }

    static String average(int A[], int N) {
        int sum = 0;
        float avg;
        for (int i = 0; i < N; i++){
            sum+=A[i];
        }
        avg = (float) (sum*1.0/N);

        return String.format("%.2f",avg);
    }
}

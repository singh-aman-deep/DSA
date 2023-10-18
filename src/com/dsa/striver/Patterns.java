package com.dsa.striver;

public class Patterns {
    public static void main(String[] args) {
        int n = 3;
//        pattern7(n);
//        pattern8(n);
//        pattern9(n);
//        pattern10(n);
//        pattern11(n);
//        pattern12(n);
        pattern13(n);
    }

    /**
     *   *
     *  ***
     * *****
     */
    static void pattern7(int n) {
        // This is the outer loop which will loop for the rows.
        for (int i = 0; i < n; i++) {
            // For printing the spaces before stars in each row
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // For printing the stars in each row
            for (int j = 0; j < 2 * i + 1; j++) {

                System.out.print("*");
            }

            // For printing the spaces after the stars in each row
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }


            // As soon as the stars for each iteration are printed, we move to the
            // next row and give a line break otherwise all stars
            // would get printed in 1 line.
            System.out.println();
        }
    }

    /**
     * *****
     *  ***
     *   *
     */
    public static void pattern8(int n) {
// This is the outer loop which will loop for the rows.
        for (int i = 0; i < n; i++) {
            // For printing the spaces before stars in each row
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // For printing the stars in each row
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {

                System.out.print("*");
            }

            // For printing the spaces after the stars in each row
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }


            // As soon as the stars for each iteration are printed, we move to the
            // next row and give a line break otherwise all stars
            // would get printed in 1 line.
            System.out.println();
        }
    }

    /**
     *   *
     *  ***
     * *****
     * *****
     *  ***
     *   *
     */
    private static void pattern9(int n) {
        for (int i = 0; i < n; i++) {
            // For printing the spaces before stars in each row
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // For printing the stars in each row
            for (int j = 0; j < 2 * i + 1; j++) {

                System.out.print("*");
            }

            // For printing the spaces after the stars in each row
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }


            // As soon as the stars for each iteration are printed, we move to the
            // next row and give a line break otherwise all stars
            // would get printed in 1 line.
            System.out.println();
        }

        for (int i = 0; i < n; i++) {
            // For printing the spaces before stars in each row
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // For printing the stars in each row
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {

                System.out.print("*");
            }

            // For printing the spaces after the stars in each row
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }


            // As soon as the stars for each iteration are printed, we move to the
            // next row and give a line break otherwise all stars
            // would get printed in 1 line.
            System.out.println();
        }
    }

    /**
     *   *
     *   **
     *   ***
     *   **
     *   *
     */
    private static void pattern10(int n) {
        for (int i=0;i<n;i++){

            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<=n-i-2;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    /**
     * 1
     * 01
     * 101
     */
    private static void pattern11(int n) {
        for (int i=0;i<n;i++){

            for (int j=0;j<=i;j++){
                if (i%2==0){
                    System.out.print(j%2==0?1:0);
                    System.out.print(" ");
                }else {
                    System.out.print(j%2==0?0:1);
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /**
     * 1    1
     * 12  21
     * 123321
     */
    private static void pattern12(int n) {
        for (int i=1;i<=n;i++){

            for (int j=1;j<=i;j++){
                System.out.print(j);
                System.out.print(" ");
            }

            for (int j=1;j<=(n+1)/i;j++){
                System.out.print(" ");
            }

            for (int j=i;j>=1;j--){
                System.out.print(j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /**
     * 1
     * 2 3
     * 4 5 6
     */
    private static void pattern13(int n) {
        int counter=1;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(counter);
                counter++;
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}

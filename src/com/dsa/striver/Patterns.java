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
//        pattern13(n);
//        pattern14(n);
//        pattern15(n);
//        pattern16(n);
//        pattern17(n);
//        pattern18(n);
//        pattern19(n);
//        pattern20(n);
//        pattern21(n);
        pattern22(n);
    }


    /**
     * *
     * ***
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
     * ***
     * *
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
     * *
     * ***
     * *****
     * *****
     * ***
     * *
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
     * *
     * **
     * ***
     * **
     * *
     */
    private static void pattern10(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - i - 2; j++) {
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
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print(j % 2 == 0 ? 1 : 0);
                    System.out.print(" ");
                } else {
                    System.out.print(j % 2 == 0 ? 0 : 1);
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
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                System.out.print(" ");
            }

            for (int j = 1; j <= (n + 1) / i; j++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
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
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter);
                counter++;
                System.out.print(" ");
            }

            System.out.println();
        }
    }

    /**
     * A
     * A B
     * A B C
     */
    private static void pattern14(int n) {
        for (int i = 0; i < n; i++) {

            // Inner loop will loop for i times and
            // print alphabets from A to A + i.
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");

            }
            // As soon as the letters for each iteration are printed, we move to the
            // next row and give a line break otherwise all letters
            // would get printed in 1 line.
            System.out.println();

        }
    }

    /**
     * A B C
     * A B
     * A
     */
    private static void pattern15(int n) {
        for (int i = n - 1; i >= 0; i--) {

            // Inner loop will loop for i times and
            // print alphabets from A to A + i.
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");

            }
            // As soon as the letters for each iteration are printed, we move to the
            // next row and give a line break otherwise all letters
            // would get printed in 1 line.
            System.out.println();

        }
    }

    /**
     * A
     * B B
     * C C C
     */
    private static void pattern16(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i; j++) {

                System.out.print((char) ((int) ('A' + i)) + " ");

            }
            System.out.println();

        }
    }

    /**
     * A
     * ABA
     * ABCBA
     */
    private static void pattern17(int n) {
        // Outer loop for the number of rows.
        for (int i = 0; i < n; i++) {

            // for printing the spaces.
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // for printing the characters.
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 1; j <= 2 * i + 1; j++) {

                System.out.print(ch);
                if (j <= breakpoint) ch++;
                else ch--;
            }

            // for printing the spaces again.
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // As soon as the letters for each iteration are printed, we move to the
            // next row and give a line break otherwise all letters
            // would get printed in 1 line.
            System.out.println();

        }

    }

    /**
     * C
     * B C
     * A B C
     */
    private static void pattern18(int n) {
        // Outer loop for the no. of rows.
        for (int i = 0; i < n; i++) {

            // Inner loop for printing the alphabets from
            // A + n -1 -i (i is row no.) to A + n -1 ( E in this case).
            for (char ch = (char) (int) ('A' + n - 1 - i); ch <= (char) (int) ('A' + n - 1); ch++) {

                System.out.print(ch + " ");
            }

            // As soon as the letters for each iteration are printed, we move to the
            // next row and give a line break otherwise all letters
            // would get printed in 1 line.
            System.out.println();
        }
    }

    /**
     * ******
     * **  **
     * *    *
     * *    *
     * **  **
     * ******
     */
    private static void pattern19(int n) {
        // for the upper half of the pattern.

        // initial spaces.
        int iniS = 0;
        for (int i = 0; i < n; i++) {

            //for printing the stars in the row.
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

            //for printing the spaces in the row.
            for (int j = 0; j < iniS; j++) {
                System.out.print(" ");
            }

            //for printing the stars in the row.
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

            // The spaces increase by 2 every time we hit a new row.
            iniS += 2;

            // As soon as the letters for each iteration are printed, we move to the
            // next row and give a line break otherwise all letters
            // would get printed in 1 line.
            System.out.println();
        }

        // for lower half of the pattern

        // initial spaces.
        iniS = 2 * n - 2;
        for (int i = 1; i <= n; i++) {

            //for printing the stars in the row.
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //for printing the spaces in the row.
            for (int j = 0; j < iniS; j++) {
                System.out.print(" ");
            }

            //for printing the stars in the row.
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // The spaces decrease by 2 every time we hit a new row.
            iniS -= 2;

            // As soon as the letters for each iteration are printed, we move to the
            // next row and give a line break otherwise all letters
            // would get printed in 1 line.
            System.out.println();
        }
    }

    /**
     * *    *
     * **  **
     * ******
     * **  **
     * *    *
     */
    private static void pattern20(int n) {

        int iniS;
        iniS = 2 * n - 2;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            for (int j = 0; j < iniS; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            iniS -= 2;

            System.out.println();
        }
        iniS = 2;
        for (int i = 1; i < n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print("* ");
            }

            for (int j = 0; j < iniS; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= n - i; j++) {
                System.out.print("* ");
            }

            iniS += 2;

            System.out.println();
        }


    }

    /**
     * ******
     * *    *
     * *    *
     * *    *
     * *    *
     * ******
     */
    private static void pattern21(int n) {
        // outer loop for no. of rows.
        for (int i = 0; i < n; i++) {

            // inner loop for printing the stars at borders only.
            for (int j = 0; j < n; j++) {

                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    // if not border index, print space.
                    System.out.print(" ");
                }
            }

            // As soon as the stars for each iteration are printed, we move to the
            // next row and give a line break otherwise all stars
            // would get printed in 1 line.
            System.out.println();
        }
    }

    /**
     * 3 3 3 3 3
     * 3 2 2 2 3
     * 3 2 1 2 3
     * 3 2 2 2 3
     * 3 3 3 3 3
     */
    private static void pattern22(int n) {
        // Outer loop for no. of rows
        for (int i = 0; i < 2 * n - 1; i++) {

            // inner loop for no. of columns.
            for (int j = 0; j < 2 * n - 1; j++) {

                // Initialising the top, down, left and right indices of a cell.
                int top = i;
                int bottom = j;
                int right = (2 * n - 2) - j;
                int left = (2 * n - 2) - i;

                // Min of 4 directions and then we subtract from n
                // because previously we would get a pattern whose border
                // has 0's, but we want with border N's and then decrease inside.
                System.out.print(n - Math.min(Math.min(top, bottom), Math.min(left, right)) + " ");
            }

            // As soon as the numbers for each iteration are printed, we move to the
            // next row and give a line break otherwise all numbers
            // would get printed in 1 line.
            System.out.println();
        }

    }
}

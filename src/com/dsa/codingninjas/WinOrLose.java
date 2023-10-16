package com.dsa.codingninjas;

/**
 * 16 Oct 2023
 * <p>
 * Win or Lose
 * <p>
 * <p>
 * You and your friends are playing a turn-based game. You will make the first move. Initially, you have an integer ‘N’. On each player’s turn, that player makes a move consisting of two steps.
 * 1) Choose an integer ‘i’ such that 0 < ‘i’ < ‘N’ and ‘N’ is divisible by ‘i’.
 * <p>
 * 2) Update number ‘N’ to ‘N - i’.
 * If a player cannot make a move, they lose the game.
 * You are given the initial number ‘N’. You have to print “YES” if you win the game; otherwise, print “NO”.
 * <p>
 * For Example
 * <p>
 * If the number ‘N’ = 6 and you select ‘i’ to be 2, then the new number ‘N’ will be 6 - 2 = 4.
 */
public class WinOrLose {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(winOrLose(n));

    }

    public static String winOrLose(int N) {
        boolean flag = true;
        while (N != 1) {
            for (int i = 1; i < N; i++) {
                if (N % i == 0) {
                    N -= i;
                    break;
                }
            }
            flag = !flag;
        }
        if (flag) {
            return "NO";
        } else {
            return "YES";
        }
    }
}

package com.dsa.gfg;

/**
 *
 * 29 Oct 2023
 *
 * Compete the skills
 *
 * A and B are good friend and programmers. They are always in a healthy competition with each other. They decide to judge the best among them by competing. They do so by comparing their three skills as per their values. Please help them doing so as they are busy.
 *
 * Set for A are like [a1, a2, a3]
 * Set for B are like [b1, b2, b3]
 *
 * Compare ith skill of A with ith skill of B
 * if a[i] > b[i] , A's score increases by 1
 * if a[i] < b[i] , B's score increases by 1
 * if a[i] = b[i] , nothing happens
 *
 *
 */
public class CompeteTheSkills {
    static long ca=0;
    static long cb=0;
    public static void main(String[] args) {
        long [] a = {4, 2, 7};
        long [] b = {5, 2, 8};
        scores(a,b);
        System.out.println(ca+"   "+cb);
    }

    public static void scores(long a[], long b[]) {
        for (int i=0;i<a.length;i++){
            if (a[i]>b[i]){
                ca++;
            }
            if (a[i]<b[i]){
                cb++;
            }
        }

    }
}

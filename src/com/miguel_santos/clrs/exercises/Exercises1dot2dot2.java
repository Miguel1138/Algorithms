package com.miguel_santos.clrs.exercises;

import static java.lang.Math.pow;

public class Exercises1dot2dot2 {

    public static void Ex2dot2() {
        // answer link: https://atekihcan.github.io/CLRS/01/E01.02-02/
        /**
         * Suppose we are comparing implementations of insertion sort and merge sort on the same machine.
         * For inputs of size n, insertion sort runs in 8n2 steps, while merge sort runs in 64n lg n steps.
         * For which values of n does insertion sort beat merge sort?
         *
         *  8n2 < 64n lg n  -> dividing by 8n
         *  n < 8 lg n -> dividing by 8
         *  n/8 < lg n -> dividing by lg
         *  2^n/2 < n
         */

        // Since Merge sort beats insertion sort when n = 1,
        // we'll start at n = 2 and test until merge sort beats insertion sort again.
        int n = 2;
        while (n > pow(2, (n / 8.0))) {
            n += 1;
        }
        // 2 < n =< 43
        System.out.println("Minimum value of n for which merge sort runs faster is " + n);
    }
}

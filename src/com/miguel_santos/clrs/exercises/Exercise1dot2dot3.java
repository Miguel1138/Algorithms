package com.miguel_santos.clrs.exercises;

import static java.lang.Math.pow;

/**
 * What is the smallest value of n such that an algorithm whose running time is 100n^2
 * runs faster than an algorithm whose running time is 2^n on the same machine?
 */

// link for answer: https://atekihcan.github.io/CLRS/01/E01.02-03/
public class Exercise1dot2dot3 {

    public static void binarySearch() {
        System.out.println("What is the smallest value of n such that an algorithm whose running time is 100n^2  runs faster than an algorithm whose running time is 2^n on the same machine?\n");

        int n = 1;
        while (pow(2, n) < 100 * pow(n, 2)) {
            System.out.println("n = " + n + " -> 100 * " + n + "^2 = " + 100 * pow(n, 2) + " > " + pow(2, n));
            n += 1;
        }

        // Expected value to be 15
        System.out.println("n = " + n + " -> 100 * " + n + "^2 = " + 100 * pow(n, 2) + " < " + pow(2, n));
        System.out.println("Minimum value of n for which A runs faster than B is " + n);
    }

}

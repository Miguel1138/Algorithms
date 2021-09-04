package com.miguel_santos.clrs.exercises;

public class Exercise2dot1dot3 {
    /**
     * Consider the searching problem: Input: A sequence of n numbers A = (a1. a2. ... .an)
     * and a value v. Output: An index i such that v = A[i] or the special value NIL if v
     * does not appear in A. Write pseudocode for linear search, which scans through the sequence,
     * looking for v. Using a loop invariant, prove that your algorithm is correct.
     * Make sure that your loop invariant fulfills the three necessary properties.
     *
     * PseudoCode:
     * for (i = 0 to A.length - 1)
     *     if (v == A[i]) {
     *         return i;
     *     }
     * return nil;
     */
    public static Comparable<Integer> findIndex(int[] array, int searchThisNumber) {
        for (int i = 0; i < array.length; i++) {
            if (searchThisNumber == array[i]) return i;
        }
        return null;
    }
}

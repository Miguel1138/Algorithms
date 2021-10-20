package com.miguel_santos.leetCode.arrays;

public class DuplicateZeros {

    // Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
    //
    //Note that elements beyond the length of the original array are not written.
    // Do the above modifications to the input array in place and do not return anything.
    public static void solution(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0 && i + 1 < arr.length) {
                for (int j = arr.length - 1; j > i + 1; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[i + 1] = arr[i++];
            }
        }
    }
}

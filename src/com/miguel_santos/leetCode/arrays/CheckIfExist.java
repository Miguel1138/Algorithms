package com.miguel_santos.leetCode.arrays;

public class CheckIfExist {
    // link:
    // https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3250/

    public static boolean solution(int[] arr) {
        if (arr.length == 0) return false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] * 2 || arr[j] == arr[i] * 2) return true;
            }
        }

        return false;
    }

    public boolean anotherSolution(int[] arr) {
        if (arr.length == 0) return false;

        for (int i = 0; i < arr.length; i++) {
            int doubleOfCurrentElement = arr[i] * 2;
            if (search(arr, doubleOfCurrentElement, i)) return true;
        }
        return false;
    }

    private boolean search(int[] array, int element, int except) {
        for (int i = 0; i < array.length; i++) {
            if (i != except && array[i] == element) return true;
        }
        return false;
    }

}

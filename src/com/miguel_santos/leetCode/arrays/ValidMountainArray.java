package com.miguel_santos.leetCode.arrays;

public class ValidMountainArray {
    // Challenge
    // https://leetcode.com/explore/learn/card/fun-with-arrays/527/searching-for-items-in-an-array/3251/
    public static boolean solution(int[] arr) {
        // arr.length >= 3
        if (arr.length < 3) return false;

        int left = 0;
        int right = arr.length - 1;

        while (left < right && arr[left] < arr[left + 1]) {
            left++;
        }

        while (right > 0 && arr[right] < arr[right - 1]) {
            right--;
        }

        return left == right && right != arr.length - 1 && left != 0;
    }

}

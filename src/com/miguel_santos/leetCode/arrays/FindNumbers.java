package com.miguel_santos.leetCode.arrays;

// Find numbers in which the count of the digits gives an even number.
public class FindNumbers {

    public static int solution(int[] nums) {
        int evens = 0;
        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0) evens++;
        }

        return evens;
    }

    public static int anotherSolution(int[] nums) {
        int evens = 0;

        for (int i = 0; i < nums.length; i++) {
            int aux = 0;
            while (nums[i] > 0) {
                nums[i] /= 10;
                aux++;
            }
            if (aux % 2 == 0) evens++;
        }

        return evens;
    }

}

package com.miguel_santos.leetCode.arrays;

// Given a binary array nums, return the maximum number of consecutive 1's in the array.
public class FindMaxConsecutiveOnes {

    public static int solution(int[] nums) {
        int consecutives = 0;
        int bigStreak = 0;
        for (int i = 0; i < nums.length; i++) {
            consecutives = nums[i] == 1 ? ++consecutives : 0;
            if (consecutives >= bigStreak) bigStreak = consecutives;
        }

        return bigStreak;
    }

}

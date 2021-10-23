package com.miguel_santos.leetCode.arrays;

public class RemoveDuplicates {
    // link:
    // https://leetcode.com/explore/learn/card/fun-with-arrays/526/deleting-items-from-an-array/3248/
    public static int solution(int[] nums) {
        int length = nums.length;
        if (length <= 1) return length;

        int k = 0;
        for (int i = 1; i < length; i++) {
            if (nums[i] != nums[k])
                nums[++k] = nums[i]; // Increment the index and then change the value.
        }

        // Last increment because the first item it's always unique.
        return ++k;
    }

}

package com.miguel_santos.leetCode;

import java.util.*;

public class NextGreaterElement {
    /**
     * The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.
     *
     * You are given two distinct 0-indexed integer arrays nums1 and nums2, where nums1 is a subset of nums2.
     *
     * For each 0 <= i < nums1.length, find the index j such that nums1[i] == nums2[j] and determine the next greater element of nums2[j] in nums2.
     * If there is no next greater element, then the answer for this query is -1.
     *
     * Return an array ans of length nums1.length such that ans[i] is the next greater element as described above.
     *
     * @param nums1
     * @param nums2
     * @return
     */

    // INPUT nums1[4,1,2] , nums2[1,3,4,2]
    // OUTPUT [-1,3,-1]
    public static int[] solution(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<>();
        int n1 = nums1.length;
        int n2 = nums2.length;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = n2 - 1; i >= 0; i--) {
            while (stack.size() > 0 && stack.peek() < nums2[i]) {
                stack.pop();
            }
            map.put(nums2[i], stack.size() == 0 ? -1 : stack.peek());
            stack.push(nums2[i]);
        }

        int[] answer = new int[n1];
        for (int i = 0; i < n1; i++) {
            answer[i] = map.get(nums1[i]);
        }

        return answer;
    }

}

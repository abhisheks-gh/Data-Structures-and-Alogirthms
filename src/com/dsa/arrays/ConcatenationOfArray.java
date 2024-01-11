// https://leetcode.com/problems/concatenation-of-array/

package com.dsa.arrays;

import java.util.Arrays;

public class ConcatenationOfArray {

    public static void main(String[] args) {
        ConcatenationOfArray concat = new ConcatenationOfArray();
        int[] nums = {1, 3, 2, 1};
        System.out.println(Arrays.toString(concat.getConcatenation(nums)));
    }

    public int[] getConcatenation(int[] nums) {
        // Approach 1
        int[] ans = Arrays.copyOf(nums, 2 * nums.length);
        for (int i = 0; i < nums.length; i++) {
            ans[nums.length + i] = nums[i];
        }

        return ans;

        // Approach 2

        // List<Integer> list = new ArrayList<>(2 * nums.length);
        // int counter = 0;
        // while (counter < 2) {
        //     for (int i = 0; i < nums.length; i++) {
        //         list.add(nums[i]);
        //     }
        //     counter++;
        // }
        // int[] ans = new int[2 * nums.length];
        // for (int i = 0; i < ans.length; i++) {
        //     ans[i] = list.get(i);
        // }

        // return ans;
    }
}
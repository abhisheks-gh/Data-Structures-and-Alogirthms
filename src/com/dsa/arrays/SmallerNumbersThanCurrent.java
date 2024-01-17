// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

package com.dsa.arrays;

import java.util.Arrays;

public class SmallerNumbersThanCurrent {

    public static void main(String[] args) {
        SmallerNumbersThanCurrent temp = new SmallerNumbersThanCurrent();
        int[] nums = {8, 1, 2, 2, 3};
        System.out.println(Arrays.toString(temp.smallerNumbersThanCurrent(nums)));
    }

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++, count = 0) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    count++;
                }
            }
            ans[i] = count;
        }

        return ans;
    }
}
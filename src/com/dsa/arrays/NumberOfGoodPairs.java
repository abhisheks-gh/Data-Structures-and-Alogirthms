// https://leetcode.com/problems/number-of-good-pairs/

package com.dsa.arrays;

public class NumberOfGoodPairs {

    public static void main(String[] args) {
        NumberOfGoodPairs numberOfGoodPairs = new NumberOfGoodPairs();
        int[] nums = {1, 2, 3, 1, 1, 3};
        System.out.println(numberOfGoodPairs.numIdenticalPairs(nums));
    }

    public int numIdenticalPairs(int[] nums) {
        // Brute force approach
//        int count = 0;
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] == nums[j]) {
//                    count++;
//                }
//            }
//        }
//
//        return count;

        // Optimized approach
        int[] temp = new int[101];
        int result = 0;
        for (int num : nums) {
            result += temp[num];
            temp[num]++;
        }

        return result;
    }

}

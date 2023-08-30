// https://leetcode.com/problems/first-missing-positive/
// Amazon (20), Microsoft (16), Adobe (8), Google (5), Facebook (4),
// Databricks (2), Grab (2), Walmart Global Tech (2)

package com.dsa.sorting.cyclicSort.interviewQuestions;

public class FirstMissingPositive {

    public static void main(String[] args) {
        FirstMissingPositive obj = new FirstMissingPositive();
        int[] nums = {1, 2, 0};
        System.out.println(obj.firstMissingPositive(nums));
    }

    public int firstMissingPositive(int[] nums) {
        // Apply cyclic sort
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        // Search for the smallest positive missing value
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return index + 1;
            }
        }

        return nums.length + 1;
    }

    void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}

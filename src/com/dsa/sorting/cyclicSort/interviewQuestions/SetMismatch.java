// https://leetcode.com/problems/set-mismatch/
// Adobe (3)

package com.dsa.sorting.cyclicSort.interviewQuestions;

import java.util.Arrays;

public class SetMismatch {

    public static void main(String[] args) {
        SetMismatch setMismatch = new SetMismatch();
        int[] nums = {2, 1, 4, 2, 6, 5};
        System.out.println( Arrays.toString(setMismatch.findErrorNums(nums)) );
    }

    public int[] findErrorNums(int[] nums) {
        // Apply Cyclic sort
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        // In the sorted array, search for the duplicate i.e.
        // the value which is not at its correct index, index = value - 1
        for (i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                // Duplicate found
                // nums[i] will be the duplicate & expected/correct value
                // i.e. i + 1 will be the missing number.
                return new int[]{nums[i], i+1};
            }
        }

        return new int[]{-1, -1};
    }

    void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

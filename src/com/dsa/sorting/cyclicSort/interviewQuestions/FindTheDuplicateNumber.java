// https://leetcode.com/problems/find-the-duplicate-number/
// Amazon interview question
// Amazon (16), Microsoft (11), Facebook (4), Uber (3), Apple (3),
// Google (2), Qualcomm (2)

package com.dsa.sorting.cyclicSort.interviewQuestions;

public class FindTheDuplicateNumber {

    public static void main(String[] args) {
        FindTheDuplicateNumber obj = new FindTheDuplicateNumber();
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println(obj.findDuplicate(nums));
    }

    public int findDuplicate(int[] nums) {
        // Sort the array using Cyclic Sort and perform extra checks for duplicate
        int i = 0;
        while (i < nums.length) {
            // EXTRA CHECKS
            // if not at correct index, check if correct index
            // already contains the same value.
            // If it does, duplicate found
            if (nums[i] != i + 1) {
                int correctIndex = nums[i] - 1;
                if (nums[i] != nums[correctIndex]) {
                    swap(nums, i, correctIndex);
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }

        return -1;
    }

    public void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

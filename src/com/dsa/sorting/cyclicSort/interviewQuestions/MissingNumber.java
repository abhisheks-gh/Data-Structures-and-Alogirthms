// https://leetcode.com/problems/missing-number/

// Microsoft (13), Amazon (8), Facebook (6), Adobe (3), Apple (3),
// Salesforce (2), VMware (2), Nvidia (2)

package com.dsa.sorting.cyclicSort.interviewQuestions;

public class MissingNumber {

    public static void main(String[] args) {
        MissingNumber find = new MissingNumber();
        int[] arr = {4, 0, 2, 1};
        System.out.println(find.missingNumber(arr));
    }

    public int missingNumber(int[] nums) {
        // Sort the array using Cyclic Sort
        int i = 0;
        while (i < nums.length) {
            // To handle the case when we encounter the element that should
            // be at Nth index, but currently we only have N-1 indices in our
            // array because one number is missing.
            // If we are at index i & we found some element then the correct index
            // that element will be that number itself.
            // So, we are taking nums[the value of the number itself]
            int correctIndex = nums[i];
            if (nums[i] < nums.length && nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }

        // Once the array is sorted, search for the first missing number
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index) {
                return index;
            }
        }

        // When array contains all elements, then the missing element will
        // be the next number in the series i.e. N which will be at Nth index.
        return nums.length;
    }

    void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

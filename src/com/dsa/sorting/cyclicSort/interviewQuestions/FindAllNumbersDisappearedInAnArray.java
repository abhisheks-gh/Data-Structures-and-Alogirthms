// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// Google interview question
// Facebook (7), Amazon (5), Microsoft (2), Apple (2)

package com.dsa.sorting.cyclicSort.interviewQuestions;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {

    public static void main(String[] args) {
        FindAllNumbersDisappearedInAnArray obj = new FindAllNumbersDisappearedInAnArray();
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(obj.findDisappearedNumbers(nums));
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        // Sort the array using Cyclic Sort
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
        // Once the array is sorted (all duplicates are also managed by the
        // Cyclic sort algo in this process, search for the indices which do not
        // contain the expected value i.e. index + 1.
        List<Integer> answer = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                answer.add(index + 1);
            }
        }

        return answer;
    }

    public void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

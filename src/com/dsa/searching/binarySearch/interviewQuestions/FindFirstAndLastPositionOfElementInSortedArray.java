// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
// Facebook interview question

package com.dsa.searching.binarySearch.interviewQuestions;

public class FindFirstAndLastPositionOfElementInSortedArray {

    // Returns the indices of first and last occurrence of target
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};

        // Check for first occurrence of target first
        ans[0] = search(nums, target, true);

        if (ans[0] != -1) {
            // Check for the last occurrence of target
            ans[1] = search(nums, target, false);
        }

        return ans;
    }

    // Returns the index value of target
    int search(int[] nums, int target, boolean findFirstOccurrence) {
        // potential ans
        int ans = -1;

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                if (findFirstOccurrence)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }

        return ans;
    }

}

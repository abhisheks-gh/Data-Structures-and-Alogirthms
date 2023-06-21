// https://leetcode.com/problems/search-insert-position/description/
// Google (4), Bloomberg (3), Uber (2), Facebook (2), VMware (2), tiktok (2)

package com.dsa.searching.binarySearch.interviewQuestions;

import java.util.Scanner;

class SearchInsertPosition {

    public static void main(String[] args) {
        SearchInsertPosition sol = new SearchInsertPosition();
        Scanner sc = new Scanner(System.in);
        int[] nums = {1, 3, 5, 6};
        int target = sc.nextInt();
        sc.close();

        System.out.println( sol.searchInsert(nums, target) );
    }

    public int searchInsert(int[] nums, int target) {
        if (binarySearch(nums, target) == -1) {
            if (nums.length == 2) {
                if (target < nums[0])
                    return 0;
                else if (target > nums[nums.length - 1])
                    return nums.length;
                else
                    return 1;
            }

            if (target < nums[0]) {
                return 0;
            }

            if (target > nums[nums.length - 1]) {
                return nums.length;
            }

            for (int i = 1; i < nums.length; i++) {
                if (nums[i] > target) {
                    return i;
                }
            }
        }

        return binarySearch(nums, target);
    }

    public int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid])
                end = mid - 1;
            else if (target > nums[mid])
                start = mid + 1;
            else
                return mid;
        }

        return -1;
    }

}
// https://leetcode.com/problems/binary-search/
// Amazon (13), Apple (5), Google (4), Microsoft (4), Bloomberg (3),
// Adobe (3), Facebook (2), Uber (2), Yahoo (2)

package com.dsa.searching.binarySearch.interviewQuestions;

public class BinarySearch {
    public int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid])
                end = mid - 1;
            else if (target > arr[mid])
                start = mid + 1;
            else
                return mid;
        }

        return -1;
    }
}

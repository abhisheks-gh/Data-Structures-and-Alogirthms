// https://leetcode.com/problems/search-in-rotated-sorted-array/

// Amazon (31), Facebook (30), Microsoft (24), LinkedIn (17), Apple (7), Bloomberg (7)
// Adobe (7), ByteDance (6), Walmart Global Tech (5), Oracle (5), tiktok (4), VMware (3)
// Google (3), Visa (3), ServiceNow (3), Expedia (2), Nvidia (2), Salesforce (2)
// Goldman Sachs (2), Morgan Stanley (2), Splunk (2)

/** Rotated sorted array
 * arr = [2, 4, 5, 7, 8, 9, 10, 12]

 * After 1st rotation:
   arr = [12, 2, 4, 5, 7, 8, 9, 10]

 * After 2nd rotation:
   arr = [10, 12, 2, 4, 5, 7, 8, 9]

 * Approach 1 (to solve searching in rotated sorted array):
   1. Find the pivot in the array.
      Pivot is where the array is getting changed (largest value in the array)
        For e.g., arr = [10, 12, 2, 4, 5, 7, 8, 9]
        Here, pivot = 12

      To find the pivot:
        Case 1: if arr[mid] > arr[mid + 1]
        Case 2: if arr[mid] < arr[mid - 1]
        Case 3: if arr[start] >= arr[mid]
                In this case, all elements from mid will be less than arr[start]
                Hence, we can ignore all these elements since we know that the
                pivot is the largest element.
                    Therefore, end = mid - 1
        Case 4: if arr[start] < arr[mid]
                start = mid + 1


   2. Apply binary search in first half arr[0, pivot], if target not found
      apply binary search in second half arr[pivot + 1, end]
 */


package com.dsa.searching.binarySearch.interviewQuestions;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        SearchInRotatedSortedArray searcher = new SearchInRotatedSortedArray();
        System.out.println( searcher.search(arr, target) );
    }

    public int search(int[] arr, int target) {
        int pivot = findPivot(arr);

        if (pivot == -1) {
            // array is not rotated
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        // If pivot is found, it means we have found two ascending sorted arrays
        if (arr[pivot] == target) {
            return pivot;
        }
        if (target >= arr[0])
            return binarySearch(arr, target, 0, pivot - 1);

        // Case 4: If target < arr[start]
        return binarySearch(arr, target, pivot + 1, arr.length - 1);
    }

    // Method to find the pivot
    int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1])
                return mid;
            if (mid > start && arr[mid] < arr[mid - 1])
                return mid - 1;
            if (arr[start] >= arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }

        return -1;
    }

    int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
//            (start + end) might exceed the range of integers
//            int mid = (start + end) / 2;
//            Safe way of doing it:
            int mid = start + (end - start) / 2;

            if (target < arr[mid])
                end = mid - 1;
            else if (target > arr[mid])
                start = mid + 1;
            else return mid;
        }

        return -1;
    }

}

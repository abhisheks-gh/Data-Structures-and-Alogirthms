// https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/

/** Approach:
 * Find the pivot (largest value in the array)
 * Array will be rotated (pivot + 1) times as everytime we are rotating,
   pivot is adding 1 to it.
 */
package com.dsa.searching.binarySearch.interviewQuestions;

public class RotationCountInRotatedSortedArray {

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        RotationCountInRotatedSortedArray counter = new RotationCountInRotatedSortedArray();
        System.out.println(counter.countRotations(arr));
    }

    // Counts the number of rotations in rotated sorted array
    int countRotations(int[] arr) {
        int pivot = findPivot(arr);

        return pivot + 1;
    }

    // Method to find the pivot (will not work for array containing duplicate values)
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

    // Method to find the pivot (can handle duplicates)
    int findPivotInArrayHavingDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1])
                return mid;
            if (mid > start && arr[mid] < arr[mid - 1])
                return mid - 1;

            // If elements at mid, start, end are equal then
            // just skip the duplicates
            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                // skip the duplicates if they are not pivots
                if (arr[start] > arr[start + 1]) {
                    return start;
                }

                start++;

                // If not a pivot, skip the duplicates
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }

                end--;
            }
            // left side is sorted, so pivot should be in right
            else if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

}

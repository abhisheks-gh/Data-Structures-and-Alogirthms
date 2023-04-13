// https://leetcode.com/problems/find-in-mountain-array/

package com.dsa.searching.binarySearch.interviewQuestions;

public class FindInMountainArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        FindInMountainArray obj = new FindInMountainArray();
        System.out.println( obj.search(arr, target) );
    }

    int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = binarySearch(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }

        // try to search in the second half of the array
        return orderAgnosticBinarySearch(arr, target, peak + 1, arr.length - 1);
    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // We are in descending part of the array
                // this may be the ans, but look in the left
                // this is why end != mid - 1
                end = mid;
            } else {
                // We are in ascending part of the array
                // this may be the ans, but look in the right
                start = mid + 1;
            }
        }

        // In the end, start == end and pointing to the largest number
        // because of the two checks above.
        // start and end are always trying to find max element in the above two checks
        // Hence, when they are pointing to just one element, that is the maximum one
        /* More elaboration:
        * At every point of time for start and end, they have the best possible answer till that time
        * And if we are saying that only one item is remaining, hence because of above line that is the
          best possible answer*/

        return start;   // or return end (as both are equal)
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end) {
        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start / 2);

            if (target == arr[mid])
                return target;

            if (isAscending) {
                if (target < arr[mid])
                    end = mid - 1;
                else if (target > arr[mid])
                    start = mid + 1;
            } else {
                if (target < arr[mid])
                    start = mid + 1;
                else if (target > arr[mid])
                    end = mid - 1;
            }
        }

        return -1;
    }

}

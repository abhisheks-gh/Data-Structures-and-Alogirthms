// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
// Amazon Interview question

/* If the array is infinite, that means we don’t have proper
   bounds (start and end indices) to apply binary search.
   So in order to find position of key, first we find bounds
   and then apply binary search algorithm. */

package com.dsa.searching.binarySearch.interviewQuestions;

public class FindPositionOfElementInInfiniteArray {

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println( findingRange(arr, target) );
    }

    static int findingRange(int[] arr, int target) {
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        // condition for the target to lie in the range
        while (target < arr[end]) {
            int newStart = end + 1;

            // double the box value
            // end = previousEnd + (sizeOfBox) * 2
            int newEnd = end + (end - start + 1) * 2;

            start = newStart;
        }

        return binarySearch(arr, target, start, target);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
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

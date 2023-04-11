// https://leetcode.com/problems/peak-index-in-a-mountain-array/
// Amazon(10), Bloomberg(3), Apple(3), Google(2) interview question

package com.dsa.searching.binarySearch.interviewQuestions;

// In a Mountain / Bi-tonic array, value of elements first increases, then decreases.
public class PeakIndexInMountainArray {

    public static void main(String[] args) {
        int[] arr = {0, 10, 15, 20, 18, 14, 7, 2};
        System.out.println( peakIndexInMountainArray(arr) );
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // We are in decreasing part of the array
                // this may be the ans, but look in the left
                // this is why end != mid - 1
                end = mid;
            } else {
                // We are in the ascending part of the array
                // this may be the ans, but look in the right
                start = mid + 1;    // because we know that arr[mid + 1] > arr[mid]
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

}

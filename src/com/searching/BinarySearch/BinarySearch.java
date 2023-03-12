/** Binary Search Algorithm
 * 1. Find the middle element.
 * 2. Check if target > mid -> search in the right else search in the left
 * 3. If middle element == target element   // ans
 */

/**
 * Time Complexity:
 - Best case complexity / Lower bound (denoted by omega) = Ω(1)
 - Worst case complexity / Upper bound (denoted by Big-oh) = O(log n)      // n = size of array

 * Space Complexity: (Iterative approach)
 - O(1) – constant complexity – takes the same amount of space regardless of the input size.
 */

// Binary Search for arrays sorted in ascending order

package com.searching.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        System.out.println( binarySearch(arr, 22) );
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

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

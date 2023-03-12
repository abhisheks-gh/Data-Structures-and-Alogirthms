// Binary Search for arrays sorted in descending order

package com.dsa.searching.binarySearch;

public class BinarySearchDescendingArray {

    public static void main(String[] args) {
        int[] arr = {90, 75, 18, 12, 6, 4, 3, 1};
        int target = 75;
        System.out.println( binarySearchDescendingArray(arr, target) );
    }

    static int binarySearchDescendingArray(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
//            (start + end) might exceed the range of integers
//            int mid = (start + end) / 2;
//            Safe way of doing it:
            int mid = start + (end - start) / 2;

            if (target > arr[mid])
                end = mid - 1;
            else if (target < arr[mid])
                start = mid + 1;
            else return mid;
        }
        return -1;
    }

}

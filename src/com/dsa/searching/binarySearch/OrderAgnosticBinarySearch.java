package com.dsa.searching.binarySearch;

// When we don't know whether the array is sorted in ascending order
// or descending order, it is known as Order Agnostic Binary Search.
public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 22;
        System.out.println( orderAgnosticBinarySearch(arr, target) );
    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
//            (start + end) might exceed the range of integers
//            int mid = (start + end) / 2;
//            Safe way of doing it:
            int mid = start + (end - start) / 2;

            if (target == arr[mid])
                return mid;

            if (isAscending) {
                if (target < arr[mid])
                    end = mid - 1;
                else if (target > arr[mid])
                    start = mid + 1;
            } else {
                if (target > arr[mid])
                    end = mid - 1;
                else if (target < arr[mid])
                    start = mid + 1;
            }
        }

        return -1;
    }
}

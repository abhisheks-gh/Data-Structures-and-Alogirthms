// Program to find the maximum value in a range

package com.assignments.arrays;

public class MaxValueInRange {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};
        System.out.println(maxValueInRange(arr, 3, 4));
    }

    static int maxValueInRange(int[] arr, int start, int end) {
        // If array is empty
        if (arr.length == 0) {
            System.out.println("Empty array");
            return -1;
        }

        // If array is null
        if (arr == null) {
            System.out.println("null");
            return -1;
        }

        int max = arr[start];

        // Computes the max value in a range
        for (int i = start; i <= end; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        return max;
    }
}

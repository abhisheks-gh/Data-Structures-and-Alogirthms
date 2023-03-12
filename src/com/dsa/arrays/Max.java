// Program to find the largest number in the array

package com.dsa.arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};
        System.out.println(max(arr));
    }

    static int max(int[] arr) {
        // If array is empty
        if (arr.length == 0) {
            System.out.println("Empty array");
            return -1;
        }

        // If null array
        if (arr == null) {
            System.out.println("null");
            return -1;
        }

        int max = arr[0];

        // Largest number in the array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        return max;
    }
}

/** Implementation of Binary Search using recursion. */

package com.dsa.recursion;

import java.util.Scanner;

public class BinarySearchUsingRecursion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        System.out.print("Enter the target: ");
        int target = sc.nextInt();
        System.out.println( binarySearch(arr, target, 0, arr.length - 1) );
        sc.close();
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        // Target not found
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;
        if (target == arr[mid]) {
            return mid;
        }
        if (target < arr[mid]) {
            return binarySearch(arr, target, start, mid - 1);
        }
        return binarySearch(arr, target, mid + 1, end);
    }
}

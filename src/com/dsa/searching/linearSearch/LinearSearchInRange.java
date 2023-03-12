/**
 * Time Complexity:
 - Best case complexity / Lower bound (denoted by omega) = Ω(1)
 - Average case complexity (denoted by theta) = Θ(n)                   // n = size of array
 - Worst case complexity / Upper bound (denoted by Big-oh) = O(n)      // n = size of array

 * Space Complexity:
 - O(1) – constant complexity – takes the same amount of space regardless of the input size.
 * */

package com.dsa.searching.linearSearch;

import java.util.Scanner;

public class LinearSearchInRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {23, 45,1, 2, 8, 19, -3, 16, -11, 28};

        System.out.print("Enter the element you want to find: ");
        int target = sc.nextInt();
        System.out.print("Enter range values: ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        System.out.println( linearSearchInRange(nums, target, start, end) );

        sc.close();
    }

    static boolean linearSearchInRange(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return false;
        }

        for (int index = start; index <= end; index++) {
            if (arr[index] == target)
                return true;
        }

        return false;
    }

}

/**
 * Time Complexity:
    - Best case complexity / Lower bound (denoted by omega) = Ω(1)
    - Average case complexity (denoted by theta) = Θ(n)                   // n = size of array
    - Worst case complexity / Upper bound (denoted by Big-oh) = O(n)      // n = size of array

 * Space Complexity:
    - O(1) – constant complexity – takes the same amount of space regardless of the input size.
 * */

package com.searching.LinearSearch;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {23, 45,1, 2, 8, 19, -3, 16, -11, 28};

        System.out.print("Enter the element you want to find: ");
        int target = sc.nextInt();

        System.out.println( linearSearch(nums, target) );

        sc.close();
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == target)
                return index;
        }

        return -1;
    }

}

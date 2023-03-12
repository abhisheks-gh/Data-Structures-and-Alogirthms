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
import java.util.Arrays;

public class LinearSearchIn2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };

        System.out.print("Enter the element you want to search: ");
        int target = sc.nextInt();

        int[] ans = linearSearchIn2DArray(arr, target);
        System.out.println( Arrays.toString(ans) );

        sc.close();
    }

    static int[] linearSearchIn2DArray(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }

        return new int[]{-1, -1};
    }
}

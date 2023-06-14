/**
 * Time Complexity:
 - Worst case complexity / Upper bound (denoted by Big-oh) = O(2n) = O(n)   // n = size of array

 * Space Complexity: (Iterative approach)
 - O(1) – constant complexity – takes the same amount of space regardless of the input size.
 */

package com.dsa.searching.binarySearch.matrices;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchInMatrixHavingSortedRowsAndCols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        System.out.print("Enter the value you want to search: ");
        int target = sc.nextInt();
        sc.close();

        System.out.println( Arrays.toString(binarySearchInMatrixHavingSortedRowsAndCols(matrix, target)) );
    }

    static int[] binarySearchInMatrixHavingSortedRowsAndCols(int[][] matrix, int target) {
        int row = 0;
        int column = matrix.length - 1;

        while (row < matrix.length && column >= 0) {
            if (matrix[row][column] == target)
                return new int[]{row, column};
            else if (matrix[row][column] < target)
                row++;
            else
                column--;
        }

        return new int[]{-1, -1};
    }
}

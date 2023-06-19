/**
 * Time Complexity:
 - Worst case complexity / Upper bound (denoted by Big-oh) = O(log(n) + log(m)) // n, m = no. of rows & cols.

 * Space Complexity: (Iterative approach)
 - O(1) – constant complexity – takes the same amount of space regardless of the input size.
 */

// Algorithm:
// Take middle column and perform binary search on it
// to reduce the search space by eliminating rows.

// In the middle column, again reduce the search space:
// Choose the middle element of that column -
// Case 1: if element == target -> ans
// Case 2: if element > target -> ignore rows after it
// Case 3: if element > target -> ignore rows above it
// Case 4: In the end when only two rows are remaining ->
//         check if the middle column we are at contains the target
//         else check the rest of the elements

package com.dsa.searching.binarySearch.matrices;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchInSortedMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        System.out.print("Enter the value you want to search: ");
        int target = sc.nextInt();
        sc.close();
        System.out.println( Arrays.toString(binarySearchInSortedMatrix(matrix, target)) );
    }

    // Search in the sorted matrix
    static int[] binarySearchInSortedMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows == 1) {
            // Search in the only row present
            return binarySearchInGivenRowOfMatrix(matrix, 0, 0, cols-1, target);
        }

        int rowStart = 0;
        int rowEnd = rows - 1;
        int colMid = cols / 2;
        // run the loop till 2 rows are remaining
        while (rowStart < (rowEnd - 1)) {   // while this is true it will have more than 2 rows
            int mid = rowStart + (rowEnd - rowStart) / 2;

            if (matrix[mid][colMid] == target)
                return new int[]{mid, colMid};
            else if (matrix[mid][colMid] < target) {
                // ignoring the above rows
                rowStart = mid;
            } else {
                // ignoring the bottom rows
                rowEnd = mid - 1;
            }
        }

        // now we have two rows
        // check whether the target is in the column of two rows

        // checking for start
        if (matrix[rowStart][colMid] == target) {
            return new int[]{rowStart, colMid};
        }
        // checking for end
        if (matrix[rowStart + 1][colMid] == target) {
            return new int[]{rowStart + 1, colMid};
        }

        // search in 1st half
        if (target <= matrix[rowStart][colMid - 1]) {
            return binarySearchInGivenRowOfMatrix(matrix, rowStart, 0, colMid-1, target);
        }

        // search in 2nd half
        if (target >= matrix[rowStart][colMid + 1] && target <= matrix[rowStart][cols - 1]) {
            return binarySearchInGivenRowOfMatrix(matrix, rowStart, colMid + 1, cols - 1, target);
        }

        // search in 3rd half
        if (target <= matrix[rowStart + 1][colMid - 1]) {
            return binarySearchInGivenRowOfMatrix(matrix, rowStart + 1, 0, colMid - 1, target);
        } else {    // Search in 4th half
            return binarySearchInGivenRowOfMatrix(matrix, rowStart + 1, colMid + 1, cols - 1, target);
        }

    }

    // Search in the given row (between two given columns)
    static int[] binarySearchInGivenRowOfMatrix(int[][] matrix, int row, int colStart, int colEnd, int target) {
        while (colStart <= colEnd) {
            int mid = colStart + (colEnd - colStart) / 2;

            if (matrix[row][mid] == target)
                return new int[]{row, mid};
            else if (matrix[row][mid] < target)
                colStart = mid + 1;
            else
                colEnd = mid - 1;
        }

        return new int[]{-1, -1};
    }

}

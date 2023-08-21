/** Insertion sort
 * Time complexity:
    - Worst case (sorted in descending order): O(n^2)
    - Best case (sorted in ascending order): O(n)
 * Space complexity: O(1)
 * Stable?: Yes
 * Why use it?
    - Adaptive: Steps get reduce if array is sorted
                Number of swaps reduced as compared to bubble sort
    - Used for smaller values of n => works good when array is partially sorted
    - It takes part in hybrid sorting algorithms
 */

package com.dsa.sorting.insertionSort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        InsertionSort sorter = new InsertionSort();
        int[] arr = {5, 3, 4, 1, 2};
        sorter.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                } else {    // When arr[j] > arr[j-1]
                    break;
                }
            }
        }
    }

    private void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

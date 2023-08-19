/** Selection sort
 * Time complexity:
    - Worst case: O(n^2)
    - Best case: O(n^2)
 * Space complexity: O(1)
 * Stable or not?: No  */

package com.dsa.sorting.insertionSort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        InsertionSort sorter = new InsertionSort();
        int[] arr = {4, 5, 1, 2, 3};
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        sorter.insertionSort(arr);
        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }

    private void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // find the max item in the remaining array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getIndexContainingMaxElementInArray(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    private int getIndexContainingMaxElementInArray(int[] arr, int start, int end) {
        int indexContainingMax = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[indexContainingMax]) {
                indexContainingMax = i;
            }
        }

        return indexContainingMax;
    }

    private void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
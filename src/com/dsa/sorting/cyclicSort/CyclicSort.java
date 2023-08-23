/** Cyclic sort
 * Time complexity:
    - Worst case complexity: O(n)
 * Space complexity: O(1)
 * Stable or not?: No
 */

package com.dsa.sorting.cyclicSort;

import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {
        CyclicSort sorter = new CyclicSort();
        int[] arr = {3, 5, 2, 1, 4};
        System.out.println("Array before sorting: " + Arrays.toString(arr));
        sorter.cyclicSort(arr);
        System.out.println("Array after sorting: " + Arrays.toString(arr));
    }

    private void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    private void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

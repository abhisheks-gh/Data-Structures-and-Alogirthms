/** Bubble sort algorithm
 * Time complexity:
    - Best case complexity: O(n)
    - Worst case complexity: O(n^2)
 * Space complexity: O(1) // constant // No extra space i.e. copying the array etc. not required
 */

package com.dsa.sorting.bubbleSort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        int[] arr = {5, 4, 3, 2, 1};
        sort.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private void bubbleSort(int[] arr) {
        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous item
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                    swapped = true;
                }
            }

            // if it did not swap for a particular value of i,
            // it means the array is sorted hence stop the program
            if (!swapped) {
                break;
            }
        }
    }

    private void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}

// arr = [2, 3, 5, 9, 14, 16, 18], target = 15
// ceilingOfNumber = largest element in array <= target element
// For e.g. floor(arr, target = 14) = 14
// For e.g. floor(arr, target = 15) = 14
// For e.g. floor(arr, target = 4) = 3

package com.dsa.searching.binarySearch.interviewQuestions;

import java.util.Scanner;

public class FloorOfANumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 3, 5, 9, 14, 16, 18};

        System.out.print("Enter the number you want to search: ");
        int target = sc.nextInt();

        System.out.println( floor(arr, target) );

        sc.close();
    }

    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid])
                return mid;

            if (isAscending) {
                if (target < arr[mid])
                    end = mid - 1;
                else if (target > arr[mid])
                    start = mid + 1;
            } else {
                if (target < arr[mid])
                    start = mid + 1;
                else if (target > arr[mid])
                    end = mid - 1;
            }
        }


        // When while loop breaks, end = start - 1 as start will cross end
        // and the while loop breaks when target is not found in the array
        // So, end becomes the element i.e. just smaller than the target
        return end;
    }

}

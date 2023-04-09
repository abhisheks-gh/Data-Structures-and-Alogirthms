// arr = [2, 3, 5, 9, 14, 16, 18], target = 15
// ceilingOfNumber = smallest element in array >= target element
// For e.g. ceiling(arr, target = 14) = 14
// For e.g. ceiling(arr, target = 15) = 16
// For e.g. ceiling(arr, target = 4) = 5

package com.dsa.searching.binarySearch.interviewQuestions;

import java.util.Scanner;

public class CeilingOfANumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 3, 5, 9, 14, 16, 18};

        System.out.print("Enter the number you want to search: ");
        int target = sc.nextInt();

        System.out.println( ceiling(arr, target) );

        sc.close();
    }

    static int ceiling(int[] arr, int target) {
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


        // When while loop breaks, start = end + 1 as start will cross end
        // and the while loop breaks when target is not found in the array
        // So, start becomes the element i.e. just greater than the target
        return start;
    }

}

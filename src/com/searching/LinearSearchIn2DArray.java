package com.searching;

import java.util.Scanner;

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

        System.out.println( linearSearchIn2DArray(arr, target));

        sc.close();
    }

    static String linearSearchIn2DArray(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return "Found";
                }
            }
        }

        return "Not found";
    }
}

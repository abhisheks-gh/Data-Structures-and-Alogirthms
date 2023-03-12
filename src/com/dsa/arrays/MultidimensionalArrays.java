package com.dsa.arrays;

import java.util.Scanner;
import java.util.Arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        // Specifying the number of columns is not mandatory.
//        // As 2D-Arrays are array of arrays and these individual arrays
//        // can be of variable sizes.
//        int[][] arr = new int[3][];
//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5,},
//                {6, 7, 8, 9}
//        };

        int[][] arr = new int[3][3];

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                arr[row][column] = sc.nextInt();
            }
        }

//        // Output 2D array
//        for (int row = 0; row < arr.length; row++ ) {
//            for (int column = 0; column < arr[row].length; column++) {
//                System.out.print(arr[row][column] + " ");
//            }
//            System.out.println();
//        }

//        // Better way to output 2D array
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }

        // Using enhanced for (for-each) loop to output 2D array
        for (int[] element : arr) {
            System.out.println(Arrays.toString(element));
        }
        sc.close();
    }
}

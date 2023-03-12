package com.dsa.searching.linearSearch;

public class FindMax {

    public static void main(String[] args) {
        int[] arr = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        System.out.println( max(arr) );
    }

    // returns the maximum value from the array
    static int max(int[] arr) {
        if (arr.length == 0)
            return Integer.MAX_VALUE;

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        return max;
    }

}

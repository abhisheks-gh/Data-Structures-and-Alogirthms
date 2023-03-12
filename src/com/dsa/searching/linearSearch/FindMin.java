package com.dsa.searching.linearSearch;

public class FindMin {

    public static void main(String[] args) {
        int[] arr = {18, 12,-7, 3, 14, 28};
        System.out.println( min(arr) );
    }

    // returns the minimum value from array
    static int min(int[] arr) {
        if (arr.length == 0)
            return Integer.MIN_VALUE;

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }

        return min;
    }

}

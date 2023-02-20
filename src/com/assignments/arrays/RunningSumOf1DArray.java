package com.assignments.arrays;

import java.util.Arrays;

public class RunningSumOf1DArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        runningSum(arr);
    }

    static void runningSum(int[] arr) {
        int sum = 0;
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            ans[i] = sum;
        }
        System.out.println(Arrays.toString(ans));
    }
}
    
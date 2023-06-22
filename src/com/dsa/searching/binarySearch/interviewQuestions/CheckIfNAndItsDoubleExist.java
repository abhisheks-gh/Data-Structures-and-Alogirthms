// https://leetcode.com/problems/check-if-n-and-its-double-exist/description/
// Google (2)

package com.dsa.searching.binarySearch.interviewQuestions;

//import java.util.Arrays;

public class CheckIfNAndItsDoubleExist {

    public static void main(String[] args) {
        int[] arr = {-2, 0, 10, -19, 4, 6, -8};
        System.out.println(checkIfExist(arr));
    }

    public static boolean checkIfExist(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j && (2 * arr[j] == arr[i] || arr[j] == 2 * arr[i]))
                    return true;
            }
        }

        return false;
    }

//    public static boolean binarySearchApproach(int[] arr) {
//        Arrays.sort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            int target = 2 * arr[i];
//            int start = 0;
//            int end = arr.length - 1;
//
//            while (start <= end) {
//                int mid = start + (end - start) / 2;
//
//                if (arr[mid] == target && mid != i)
//                    return true;
//                else if (arr[mid] < target)
//                    start = mid + 1;
//                else
//                    end = mid - 1;
//            }
//        }
//
//        return false;
//    }

}

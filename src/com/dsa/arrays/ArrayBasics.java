package com.dsa.arrays;

import java.util.Arrays;

public class ArrayBasics {
    public static void main(String[] args) {
        /** Source: JLS (Java Language Specification) - "Heap Objects are not continuous."
         * Unlike C/C++, elements of an array are not necessarily allocated continuously.
         * It depends on the JVM whether they are going to be allocated continuously or not.

         * Therefore, array objects (in Java) may not be continuous.
         * */
        int[] arr = new int[5];
        /** Dynamic Memory Allocation
            // Breaking the steps:
            // int[] arr;           // happens at compile time
            // arr = new int[5];    // Creation of object in heap happens at runtime */

        System.out.println(Arrays.toString(arr));
    }
}

// Variable length arguments

package com.assignments.methods;

import java.util.Arrays;

public class VarArgs {
    public static void main(String... args) {
        // This function can be called with 0 or more than 0 arguments
        fun(2, 3, 4, 5, 6);
    }
    static void fun(int... x) { // Variable number of arguments
        System.out.println(Arrays.toString(x));
    }
}

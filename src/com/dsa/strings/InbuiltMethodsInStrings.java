package com.dsa.strings;

import java.util.Arrays;

public class InbuiltMethodsInStrings {

    public static void main(String[] args) {
        String name = "Abhishek Kumar";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        // original one is not changing after name.toLowerCase() as strings are immutable
        System.out.println(name);
        System.out.println(name.indexOf('k'));

        // .strip() removes extra white spaces at the ends
        System.out.println("   Abhishek   ".strip());

        // Split it from wherever there is a blank space " "
        System.out.println( Arrays.toString(name.split(" ")) );
    }
}

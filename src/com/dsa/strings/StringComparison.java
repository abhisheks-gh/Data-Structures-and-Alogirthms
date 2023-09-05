package com.dsa.strings;

public class StringComparison {

    public static void main(String[] args) {
        // Two ways:
        // 1) == (comparator) method
        // 2) equals() method

        // 1) == (comparator) method
        String a = "Hello";
        String b = "Hello";

        System.out.println(a == b); // True (pointing to same string object)

        String greet1 = new String("Hi");    // Creating these values outside String Pool
        String greet2 = new String("Hi");    // but in Heap memory only.
        String greet3 = new String("Hey!");

        System.out.println(greet1 == greet2); // False (pointing to two different string objects)

        // 2) .equals() method, When we only need to compare the values
        System.out.println(greet1.equals(greet2));  // True as different objects but same value
        System.out.println(greet1.equals(greet3));  // False as different values

        System.out.println(greet3.charAt(3));
    }
}

/** "+" operator in java is only defined for primitives or when one value is string. */

package com.dsa.strings;

import java.util.ArrayList;

public class Operators {

    public static void main(String[] args) {
        System.out.println('a' + 'b');  // 195 (addition of ASCII values of 'a' & 'b', i.e. 97 & 98)
        System.out.println("a" + "b");  // "ab" (strings are concatenated)
        System.out.println('a' + 3);    // 100 (addition of ASCII value of 'a' & 3)
        System.out.println((char)('a' + 3));    // char value of prev. result

        System.out.println("a" + 1);    // String concatenation, valueOf(1).toString();
        // After a few steps, this is same as: "a" + "1"
        // int will be converted to Integer that will call toString()

        System.out.println("Abhishek" + new ArrayList<>()); // Abhishek[]
        System.out.println("Abhishek" + new Integer(56));   // Abhishek56


        // System.out.println(new Integer(56) + new ArrayList<>()); // ERROR
        // + operator in java is only defined for primitives or when one value is string.
        System.out.println(new Integer(56) + "" + new ArrayList<>());   // 56[]
    }
}

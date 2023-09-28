// We can't have two Greeting.java file in same package, so we can create other package
// In this case package b

package com.oops.packages.a;

import static com.oops.packages.b.Message.message;

public class Greeting {

    public static void main(String[] args) {
        System.out.println("Hello world");
        message();
    }
}

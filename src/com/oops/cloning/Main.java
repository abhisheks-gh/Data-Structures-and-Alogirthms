package com.oops.cloning;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Human abhishek = new Human(21, "Abhishek Kumar");

        // Problem: it is taking a lot of processing time because we are
        // using another new keyword
//        Human twin = new Human(abhishek);

        // Instead we can use the clone method
        // Cloning: creating an exact copy of the object

        Human twin = (Human)abhishek.clone();

        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;

        // abhishek.arr also changed. What's happening?
        // This is shallow copy (if we use the commented version of clone method in Human.java)
//        System.out.println(Arrays.toString(abhishek.arr));

        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(abhishek.arr));
    }
}

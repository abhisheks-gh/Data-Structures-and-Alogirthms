package com.oops.properties.polymorphism;

public class Triangle extends Shapes {

    @Override
    void area() {
        System.out.println("Area is 0.5 * h * b");
    }
}

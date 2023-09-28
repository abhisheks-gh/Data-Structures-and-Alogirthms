

package com.oops.properties.polymorphism;

public class Numbers {

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        obj.sum(2, 3);
        obj.sum(1, 3, 7);
    }

    double sum(int a, int b) {
        return a + b;
    }

    double sum(double a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

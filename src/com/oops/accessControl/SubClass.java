package com.oops.accessControl;

public class SubClass extends A {

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(45, "Abhishek Kumar");
        int n = obj.num;
    }
}

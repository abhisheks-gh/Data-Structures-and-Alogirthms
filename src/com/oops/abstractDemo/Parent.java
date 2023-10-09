package com.oops.abstractDemo;

// Abstract classes cannot be final because they need to be inherited.
public abstract class Parent {

    int age;

    final int VALUE;

    public Parent(int age) {
        this.age = age;
        VALUE = 342437654;
    }

    // We cannot create abstract constructors
    // abstract Parent() { }    // NOT ALLOWED

    static void hello() {
        System.out.println("hey");
    }

    void normalMethod() {
        System.out.println("This is a normal method");
    }

    // All the child classes must need to override these abstract methods
    abstract void career();
    abstract void partner();
}

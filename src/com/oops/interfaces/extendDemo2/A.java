package com.oops.interfaces.extendDemo2;

public interface A {

//    public abstract void fun();

    // Static interface methods should always have a body
    // and they are called via the interface name
    static void greeting() {
        System.out.println("Hey, I am a static method");
    }

    /** Default methods are provided as a means by which interfaces could be expanded
        without breaking the existing code. So, for example we add another method without
        body in an interface, then we would have to provide the body of that method in all
        the classes that implements that interface. */
    public default void fun() {
        System.out.println("I am in A");
    }
}

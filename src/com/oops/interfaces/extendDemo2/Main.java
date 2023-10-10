package com.oops.interfaces.extendDemo2;

public class Main implements A, B {

    // Overridden methods accessibility type should be either same or less restrictive
    // than its version in the parent class or interface
    // for e.g. if it was protected in the parent class, then the overridden method should
    // either be protected or public.
    @Override
    public void greet() {

    }

    public static void main(String[] args) {
        A.greeting();
    }
}

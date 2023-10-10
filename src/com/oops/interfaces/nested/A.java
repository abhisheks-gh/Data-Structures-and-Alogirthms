package com.oops.interfaces.nested;

public class A {

    // nested interface
    /** The nested interface can be declared as public, private or protected.
     * But the top level interface have to be declared as public or the default one. */
    public interface NestedInterface {

        boolean isOdd(int num);
    }
}

class B implements A.NestedInterface {

    @Override
    public boolean isOdd(int num) {
        return !(num % 2 == 0);
    }
}

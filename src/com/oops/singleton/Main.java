package com.oops.singleton;

public class Main {

    public static void main(String[] args) {
        // Can't use Singleton() constructor as it is a Singleton class
        // as the Singleton() constructor is set to private.
//        Singleton obj = new Singleton();

        /* All these reference variable will point to the same instance
           because the Singleton class not allows to create more than
           one instance. */
        Singleton obj = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();
    }
}

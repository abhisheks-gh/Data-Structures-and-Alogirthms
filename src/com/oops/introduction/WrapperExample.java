package com.oops.introduction;

public class WrapperExample {

    public static void main(String[] args) {
//        int somethingPrimitive = 10;
//        Integer somethingObject = 45;

        Integer a = 10;
        Integer b = 20;

        swap(a, b); // won't change as Integer class is final
        System.out.println(a + " " + b); // Output: 10 20

//        final int INCREASE = 3;
//        INCREASE = 5; // ERROR: can't change a final field

        final A abhishek = new A("Abhishek");
        abhishek.name = "newName"; // In this way, it still can be modified

        /** When a non-primitive is final, you can't reassign it */
        // abhishek = new A("newObject");


        // Checking the work of finalize() method
        A obj;
        for (int i = 0; i < 1000; i++) {
            obj = new A("Random name");
        }

        // Adding System.gc() will recommend the garbage collector to run even
        // for a comparatively small number of unreferenced objects of class A
        System.gc();
    }

    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}

class A {
//    final int SOMETHING_FINAL; // ERROR: final variable not initialized

    // Since it can't be modified, always initialize a final variable while declaring
    final int SOMETHING_FINAL = 78;

    /** Final keyword guarantees this immutability to only primitive data types because
        in the case of objects, the value of the reference variable can't be modified
        (meaning it will always point to the same object) but the value of that object
        can be changed.
     */
    final Integer SOME_OBJECT_AS_FINAL = 78;

    String name;

    public A(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}

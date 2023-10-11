package com.oops.cloning;

public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3, 4, 5, 6, 9, 1};
    }

//    public Human(Human other) {
//        this.age = other.age;
//        this.name = other.name;
//    }

    /** Shallow copy:
     * Primitives will be copied as it is.
     * But the reference variable will point to the same object internally
     for non-primitives (like Strings, arrays, etc.)
     * It means changing the copied object will also result to changes in the
     actual object in case of non-primitive data members.
     * In order to solve this problem, we use DEEP COPY. */
//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone(); // this is actually doing the SHALLOW COPY of the object
//    }

    /** Deep copy:
     * Primitives will be copied as it is.
     * And the reference variables will point to the newly created copies of the
       object for non-primitive types like Strings, arrays, etc.
     * It means changing the copied object will NOT result to changes in the
        actual object in case of primitive as well as non-primitive data members. */
    @Override
    public Object clone() throws CloneNotSupportedException {
        // this is actually doing the DEEP COPY of the object
        Human twin = (Human)super.clone(); // At this stage it is shallow copy only

        // make a deep copy
        twin.arr = new int[twin.arr.length];
        for (int i = 0; i < twin.arr.length; i++) {
            twin.arr[i] = this.arr[i];
        }

        return twin;
    }
}

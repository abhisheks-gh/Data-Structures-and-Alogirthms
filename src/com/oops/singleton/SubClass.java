package com.oops.singleton;

import com.oops.accessControl.A;

public class SubClass extends A {

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        // Only the subclass object can access the base class data member (of protected accessibility type)
        // when used in subclass from different package
        SubClass obj = new SubClass(10, "Abhishek Kumar");
        int n = obj.num; // Accessible via subclass object because accessibility type of 'num' is protected
    }
}

class SubSubclass extends SubClass {
    public SubSubclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubSubclass obj = new SubSubclass(10, "Abhishek Kumar");
        int n = obj.num;
    }
}

class SubClass2 extends A {
    SubClass2(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        A obj = new SubClass2(10, "Abhishek Kumar");
        int n = obj.getNum();
    }
}

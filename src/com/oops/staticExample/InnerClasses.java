package com.oops.staticExample;

//class Test { // Only inner classes can be static
//    String name;
//
//    public Test(String name) {
//        this.name = name;
//    }

public class InnerClasses { // Outer classes can't be static
    static class Test { // Only inner classes can be static
        String name;

        public Test(String name) {
            this.name = name;
        }

        public static void main(String[] args) {
            Test a = new Test("Abhishek");
            Test b = new Test("Kannaujia");
            // Both will show the last set value i.e. "Kannaujia" as static
            // members are same for all the class objects.
            System.out.println(a.name);
            System.out.println(b.name);
        }
    }
}

// Error: As outer classes can't be static
//static class A {
//
//}

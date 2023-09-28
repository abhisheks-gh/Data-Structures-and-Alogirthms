package com.oops.staticExample;

public class Main {

    public static void main(String[] args) {
        Human abhi = new Human(21, "Abhishek Kumar", 10000, false);
        Human chotu = new Human(20, "Jai Singh", 15000, true);
        Human pratham = new Human(20, "Pratham Mandloi", 15000, true);

        // NOTE: Use class names to access static variables

        // Population will be same for all these 3 instances
//        System.out.println(abhi.population);
//        System.out.println(chotu.population);
//        System.out.println(pratham.population);

        System.out.println(Human.population);

        Main fun = new Main();
        fun.fun2();
    }

    // this is not dependent on objects
    static void fun() {
//        greeting(); // can't use because it requires an instance
        // but the method we are using it in does not depend on instances

        // We cannot access non-static stuff without referencing their instances in
        // a static context.
        // Hence, here we are referencing it.
        Main obj = new Main();
        obj.greeting();
    }

    void fun2() {
        greeting();
    }

    // Something that is not static, belongs to an object
    void greeting() {
//        fun();
        System.out.println("Hello world");
    }
}

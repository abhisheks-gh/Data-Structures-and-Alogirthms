package com.oops.staticExample;

public class Human {

    static long population; // initially 0 by default
    int age;
    String name;
    int salary;
    boolean married;

    static void message() {
        System.out.println("Hello world");
    }

    // Constructor
    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        // Every time we create instance of Human class, population is incremented by 1
        Human.population += 1;
    }
}

package com.oops.introduction;

public class IntroToOOPs {

    public static void main(String[] args) {
        // store roll numbers of 5 students
        int[] rolls = new int[5];

        // store names of 5 students
        String[] names = new String[5];

        // store marks of 5 students
        float[] marks = new float[5];

        // store data of 5 students: {roll no, name, marks}
        // Need to create own data type (using classes)
//        Student abhishek;
//        abhishek = new Student();

//        Student abhishek = new Student(); // using default constructor
//        abhishek.rollNo = 25;
//        abhishek.name = "Abhishek Kumar";
//        abhishek.marks = 91.66f;
        Student abhishek = new Student(25, "Abhishek Kumar", 91.66f);
        System.out.println(abhishek); // Output like: com.oops.introduction.Student@65ab7765
        System.out.println(abhishek.rollNo);
        System.out.println(abhishek.name);
        System.out.println(abhishek.marks);

        abhishek.changeName("Abhi");
        abhishek.greeting();

        Student pratham = new Student(53, "Pratham Mandloi", 89.9f);
        Student random = new Student(pratham);
        random.greeting();
        
        Student random2 = new Student();
        random2.greeting();

        Student one = new Student();
        Student two = one;

        one.name = "Something something";
        System.out.println(two.name);
    }
}

// Created a class
// for every single student
class Student {
    int rollNo;
    String name;
    float marks;

    // Constructors
    Student() {
//        this.rollNo = 25;
//        this.name = "Abhishek Kumar";
//        this.marks = 91.66f;

        // Calling a constructor from another constructor
        // internally it's like: Student(13, "Alex", 78.0f);
        this(1, "Default person", 100.0f);
    }

    Student(Student other) {
        this.name = other.name;
        this.rollNo = other.rollNo;
        this.marks = other.marks;
    }

    Student(int rollNo, String name, float marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    void greeting() {
        System.out.println("Hello! My name is " + this.name);
    }

    void changeName(String newName) {
        name = newName;
    }
}

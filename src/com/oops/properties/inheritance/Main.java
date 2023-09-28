package com.oops.properties.inheritance;

public class Main {

    public static void main(String[] args) {
        Box box1 = new Box(4.6,  7.9, 9.9);
        Box box2 = new Box(box1);
//        System.out.println(box1.l + " " + box1.w + " " + box1.h);

//        BoxWithWeight box3 = new BoxWithWeight();
//        BoxWithWeight box4 = new BoxWithWeight(2, 3, 4, 8);
//        System.out.println(box3.h + " " + box3.weight);

//        Box box5 = new BoxWithWeight(2, 3, 4, 8);
//        System.out.println(box5.w);
//        System.out.println(box5.weight); // can't access

        // there are many variables in both parent and child classes
        // we are given access to variables that are in the ref type i.e. BoxWithWeight
        // hence, we should have access to weight variable
        // this also means, that the ones we are trying to access should be initialized
        // but here, when the object itself is of type parent class, how will we call the constructor of child class
        // that is why we are getting error below
//        BoxWithWeight box6 = new Box(2, 3, 4);
//        System.out.println(box6);

//        BoxPrice box = new BoxPrice(5, 8, 200);

//        Box.greeting();

        Box box = new BoxWithWeight();
        box.greeting();
    }
}

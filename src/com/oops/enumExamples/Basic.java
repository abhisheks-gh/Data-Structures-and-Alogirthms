package com.oops.enumExamples;
/**
 * All the enums explicitly extends java.lang.Enum class. And we know that in Java,
   multiple inheritance is not allowed and a class can only extend one parent class,
   so an enum cannot extend anything else.
 * An enum cannot be a super class either.
 * The toString() method is overridden() and it actually prints the name of the constants.
 * But, we can implement interfaces in enums (as many interfaces as we want).
 * We can't declare abstract methods in enums (as we can't inherit enums to define the
   method body later. 
     */
public class Basic {

    enum Week implements A {
        // these are enum constants
        // every single one will be PUBLIC, STATIC and FINAL member
        // since its final, we cannot create child enums
        // type of all of these is Week
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

        // this is not public or protected, only private or default
        // But why? -> Public or protected will allow initialization of more
        // than one objects. We only want it to be a constant number of objects
        // for week. That's why it's not public or protected.
        Week() {
            System.out.println("Constructor called for " + this);
        }

        @Override
        public void Hello() {
            System.out.println("Hey, how are you?");
        }

        // internally: public static final Week Monday = new Week();


    }

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;

//        for (Week day : Week.values()) {
//            System.out.println(day);
//        }

//        System.out.println(week);
        System.out.println(Week.valueOf("Monday"));

        // ordinal: position of the enum constant declaration
//        System.out.println(week.ordinal());

        week.Hello();
    }

}

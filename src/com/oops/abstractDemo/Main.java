package com.oops.abstractDemo;

public class Main {

    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();

        son.normalMethod();

        // Which method to be called will be determined by the type of the reference variable
        // but which version of the method to call (in overriding) will be determined by the
        // type of the object
        Parent daughter = new Daughter(28);
        daughter.career();

        /** We cannot create objects of abstract Parent class like this:
         * Parent mom = new Parent(); // NOT ALLOWED

         * But we can create abstract Parent class object by implementing the methods while
            we are creating the object like this */
        Parent dad = new Parent(50) {
            @Override
            void career() {

            }

            @Override
            void partner() {

            }
        };

        Parent.hello();
    }
}

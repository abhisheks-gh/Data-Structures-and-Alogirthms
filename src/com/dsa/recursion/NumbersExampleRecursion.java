package com.dsa.recursion;

public class NumbersExampleRecursion {

    public static void main(String[] args) {
        printSomething(1);
    }

    static void printSomething(int n) {
        // Base Condition:
        // A condition where recursive function will stop making new calls.
        if (n == 5) {
            System.out.println(n);
            return;
        }

        System.out.println(n);

        // If we are calling a function again & again, we can treat it as a separate call in the stack
        // recursive call
        /** This is called tail recursion, this is the last function call
         * Tail recursion is defined as a recursive function in which the recursive call is
           the last statement that is executed by the function. So basically nothing is left
           to execute after the recursion call.*/
        printSomething(n + 1);
    }
}

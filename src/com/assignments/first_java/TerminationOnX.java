package com.assignments.first_java;

import java.util.Scanner;

// Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.

import java.util.Scanner;
// import java.lang.String;
// import java.lang.Long;

public class TerminationOnX {
    public static void main(String[] args) {
        // Long sum;
        // Long userInput;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter any number:");
        // while (userInput.toString(userInput) != "x" || userInput.toString(userInput) != "X") {
        //     userInput = sc.nextLong();
        //     sum += userInput;
        // }
        // sc.close();

        int num = 0, sum = 0;
        Scanner sc = new Scanner(System.in);
        while (num != 'X') {
            num = sc.nextInt();
            sum += num;
        }
        System.out.println("Sum = " +  sum);
        sc.close();
    }
}
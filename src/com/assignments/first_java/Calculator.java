// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

package com.assignments.first_java;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Numbers on which the operations are to be done
        double num1, num2;
        // Operator 
        char oper;
        System.out.println("Enter two numbers:");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        System.out.println("Enter a operator (+, -, *, /):");
        // Reading a character
        oper = sc.next().charAt(0);

        if (oper == '+')
            System.out.println(num1 + num2);
        if (oper == '-')
            System.out.println(num1 - num2);
        if (oper == '*')
            System.out.println(num1 * num2);
        if (oper == '/')
            System.out.println(num1 / num2);
        if (oper != '+' && oper != '-' && oper != '*' && oper != '/')
            System.out.println("Operator not in the list! Please try again.");
        sc.close();
    }
}
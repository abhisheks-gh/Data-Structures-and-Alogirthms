// Take name as input and print a greeting message for that particular name.

package com.assignments.first_java;

import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name:");
        // Taking full name (first name + surname)
        String name = sc.nextLine();;
        System.out.println("Hello " + name + "! ");
        sc.close();
    }
}
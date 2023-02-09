// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

package com.assignments.first_java;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principalAmount, simpleInterest;
        float rateOfInterest, time;
        System.out.print("Enter principal amount: ");
        principalAmount = sc.nextDouble();
        System.out.print("Enter rate of interest: ");
        rateOfInterest = sc.nextFloat();
        System.out.print("Enter time interval: ");
        time = sc.nextFloat();

        simpleInterest = (principalAmount * rateOfInterest * time) / 100;
        System.out.print("Simple Interest: " +  simpleInterest);
        sc.close();
    }
}
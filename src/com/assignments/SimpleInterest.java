// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        double principalAmount = 0, time = 0, rate = 0, simpleInterest;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount:");
        sc.nextDouble();
        System.out.println("Enter time");
        sc.nextDouble();
        System.out.println("Enter rate:");
        sc.nextDouble();
        sc.close();
        simpleInterest = (principalAmount * time * rate) / 100;
        System.out.println("Simple Interest = " + simpleInterest);
    }
}
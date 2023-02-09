// Take 3 numbers as input and print the largest number.
package com.assignments.first_java;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        sc.close();

        if (num1 > num2 && num1 > num3) {
            System.out.println("Largest number = " + num1);
        }
        if (num2 > num1 && num2 > num3) {
            System.out.println("Largest number = " + num2);
        }
        if (num3 > num1 && num3 > num2) {
            System.out.println("Largest number = " + num3);
        }
        if (num1 > num2 && num2 == num3) {
            System.out.println("Largest number = " + num1);
        }
        if (num2 > num1 && num1 == num3) {
            System.out.println("Largest number = " + num2);
        }
        if (num3 > num1 && num1 == num2) {
            System.out.println("Largest number = " + num3);
        }
    }
}
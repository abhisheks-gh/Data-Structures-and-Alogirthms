// Write a program to print whether a number is even or odd, also take input from the user.

package com.assignments.first_java;

import java.util.Scanner;

public class EvenOrOdd {
   public static void main(String[] args) {
       int num;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a number:");
       num = sc.nextInt();
       if (num % 2 == 0)
           System.out.println("Even");
       else
           System.out.println("Odd");
       sc.close();
   } 
}
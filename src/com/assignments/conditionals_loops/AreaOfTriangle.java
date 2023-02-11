// Program to compute the area of a triangle

package com.assignments.conditionals_loops;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();
        double area = 0.5 *(base * height);
        System.out.println("Area of triangle = " + area);
        sc.close();
    }
}
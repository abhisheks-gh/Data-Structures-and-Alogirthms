// Program to compute the area of a circle

package com.assignments.conditionals_loops;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        double area = 3.14 * radius * radius;
        System.out.println("Area of circle = " + area);
        sc.close();
    }
}
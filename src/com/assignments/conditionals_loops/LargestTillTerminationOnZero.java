// Take integer inputs till the user enters 0 and print the largest number from all.

package com.assignments.conditionals_loops;

import java.util.Scanner;

public class LargestTillTerminationOnZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            int input = sc.nextInt();
            if (input == 0)
                break;
            else
                sum += input;
        }
        System.out.println("Sum = " + sum);
        sc.close();
    }
}
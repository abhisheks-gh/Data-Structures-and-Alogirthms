// Keep taking numbers as inputs till the user enters ‘X’ or 'x', after that print sum of all.

package com.assignments.first_java;

import java.util.Scanner;

public class TerminationOnX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            String input = sc.next().trim();
            if (input.equals("X") || input.equals("x")) {
                break;
            } else {
                int num = Integer.parseInt(input);
                sum += num;
            }
        }
        System.out.println(sum);
        sc.close();
    }
}

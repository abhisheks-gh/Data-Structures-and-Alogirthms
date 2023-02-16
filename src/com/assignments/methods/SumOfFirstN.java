// Program to print sum of first N natural numbers

package com.assignments.methods;

import java.util.Scanner;

public class SumOfFirstN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println( sumOfFirstNaturals(n) );
        sc.close();
    }

    static int sumOfFirstNaturals(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

}

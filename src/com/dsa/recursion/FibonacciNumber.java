package com.dsa.recursion;

import java.util.Scanner;

public class FibonacciNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        System.out.println( computeNthFibonacciNumber(n) );
        sc.close();
    }

    /** Computes the Nth fibonacci number */
    static int computeNthFibonacciNumber(int n) {
        // base condition
        // Fibo(0) = 0, Fibo(1) = 1
        if (n < 2) {
            return n;
        }

        return computeNthFibonacciNumber(n - 1) + computeNthFibonacciNumber(n - 2);
    }
}

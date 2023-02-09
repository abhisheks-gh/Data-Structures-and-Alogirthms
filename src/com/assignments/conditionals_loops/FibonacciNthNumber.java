package com.assignments.conditionals_loops;
// n = 7
// Find the nth Fibonacci number
// 0, 1, 1, 2, 3, 5, 8, 13

import java.util.Scanner;
import java.util.ArrayList;

public class FibonacciNthNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        int num1 = 0;
        int num2 = 1;
        list.add(0,num1);
        list.add(1, num2);
        for (int i = 2; i <= n; i++) {
            int sum = list.get(i-2) + list.get(i-1);
            list.add(i, sum);
        }
        System.out.println(list.get(n));
        sc.close();
    }
}
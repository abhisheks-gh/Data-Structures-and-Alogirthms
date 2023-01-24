// To calculate Fibonacci Series up to n numbers.
// 1, 1, 2, 3, 5, 8, 13....

package com.assignments.first_java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("To what count you want to print the Fibonacci series: ");
        int count = sc.nextInt();
        list.add(0,1);
        list.add(1,1);
        for (int i = 2; i <= count; i++) {
            int result = list.get(i-2) + list.get(i-1);
            list.add(i, result);
        }
        System.out.println(list);
        sc.close();
    }
}
package com.dsa.first_java;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your roll ");
        int rollno = sc.nextInt();
        System.out.println("Your roll number is " + rollno);

        int a = 234_000_000;   // We can use underscores ' _ ' instead of commas ' , ' for large numbers
        System.out.println(a);
        sc.close();
    }
}
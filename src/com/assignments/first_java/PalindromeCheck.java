// To find out whether the given String is Palindrome or not.
package com.assignments.first_java;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        List<Character> rev = new ArrayList<>();
        int count = 0;
        boolean flag = true;

        for (int i = input.length()-1; i >= 0; i--) {
            rev.add(count, input.charAt(i));
            count++;
        }
//        if (rev.toString().equals(input))
//            System.out.println("Yes, it is a palindrome");
//        else
//            System.out.println("No, it is not a palindrome");

        // Comparing character wise
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != rev.get(i)) {
                flag = false;
            }
        }
        if (flag)
            System.out.println("Palindrome");
        else System.out.println("Not a Palindrome");
        sc.close();
    }
}
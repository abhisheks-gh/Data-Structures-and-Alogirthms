// To find out whether the given String is Palindrome or not.
package com.assignments.first_java;

import java.util.Scanner;
import java.lang.String;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userInput = sc.next();
        sc.close();
        boolean flag = false;
        for (int i = 0; i < userInput.length()/2; i++) {
            for (int j = userInput.length()/2; j >= 0; j--) {
                if (userInput.charAt(i) == userInput.charAt(j)) {
                    flag = true;
                } else {
                    flag = false;
                }
            }
        }
        if (flag==true) System.out.println("True");
        else System.out.println(false);
    }
}
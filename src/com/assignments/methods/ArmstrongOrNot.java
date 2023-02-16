/**
 * Armstrong Numbers: A number is thought of as an Armstrong number if the
   sum of its own digits raised to the power number of digits gives the number
   itself. For example, 0, 1, 153, 370, 371, 407 are three-digit Armstrong numbers
   and, 1634, 8208, 9474 are four-digit Armstrong numbers and there are many more.
 */

package com.assignments.methods;

import java.util.Scanner;

public class ArmstrongOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(isArmstrong(num));

//        // Printing all 3-digit Armstrong numbers
//        for (int i = 100; i <= 999; i++) {
//            if (isArmstrong(i)) {
//                System.out.println(i);
//            }
//        }

        sc.close();
    }

    static boolean isArmstrong(int num) {
        int original = num;
        long sum = 0;
        int rem;

        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            sum += (rem * rem * rem);
        }

        return sum == original;
    }

}

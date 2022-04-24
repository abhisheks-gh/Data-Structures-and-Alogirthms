// Take a number as input and print the multiplication table for it.

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        sc.close();
        for (byte i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.println(result);
        }
    }
}
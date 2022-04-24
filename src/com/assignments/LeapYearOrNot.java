// Input a year and find whether it is a leap year or not.

import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year you want to check for");
        int year = sc.nextInt();

        if (year % 4 == 0)
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
        sc.close();
    }
}
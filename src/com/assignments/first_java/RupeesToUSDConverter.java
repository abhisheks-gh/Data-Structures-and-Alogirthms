// Input currency in USD and output in Rupees

package com.assignments.first_java;

import java.time.Month;
import java.util.Scanner;
import java.time.LocalDate;

public class RupeesToUSDConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float amountInRupees;
        float amountInUSD;
        LocalDate date = LocalDate.of(2023, Month.JANUARY, 24);
        System.out.print("Enter amount in USD ($): ");
        amountInUSD = sc.nextFloat();
        amountInRupees = amountInUSD * 81.62f;
        System.out.println(amountInUSD + " USD = " + amountInRupees + " INR");
        System.out.println("According to data taken on " + date);
        sc.close();
    }
}

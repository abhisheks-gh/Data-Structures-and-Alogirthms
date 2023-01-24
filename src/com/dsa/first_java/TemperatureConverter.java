package com.dsa.first_java;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temperature in Celsius:");
        float tempInCelsius = sc.nextFloat();
        float tempInFahrenheit = (tempInCelsius * 9/5) + 32;
        System.out.println(tempInFahrenheit);

        sc.close();
    }
}
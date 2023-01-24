package com;

import java.util.Scanner;

// akaaka

public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean flag = true;
        for (int i = 0; i < s.length()/2; i++) {
            for (int j = s.length()-1; j > s.length()/2; j--) {
                if (s.charAt(i) != s.charAt(j))
                    flag = false;
            }
        }
        System.out.println(flag);
        sc.close();
    }
}

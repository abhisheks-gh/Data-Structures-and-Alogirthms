// For a given number 1385757879, find the number of occurrences of 7.

package com.assignments.first_java;

public class NumberOfOccurrences {
    public static void main(String[] args) {
        long num = 1385757879;
        String str = Long.toString(num);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '7')
                count++;
        }
        System.out.println("Number of occurrences of '7': " + count);
    }
}
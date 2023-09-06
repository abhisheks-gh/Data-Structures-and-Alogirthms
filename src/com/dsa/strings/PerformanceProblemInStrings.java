package com.dsa.strings;

public class PerformanceProblemInStrings {

    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            // Problem: In every iteration, a new string object is created and the previous
            // string objects are left unreferenced in the memory.
            // So much memory wastage
            // We can use StringBuilder to overcome this problem.
            series = series + ch;   // series += ch;
        }

        System.out.println(series);

        System.gc();    // requests JVM to run garbage collector
    }
}

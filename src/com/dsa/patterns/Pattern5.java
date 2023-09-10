// Pattern to print
//        *
//        **
//        ***
//        ****
//        *****
//        ****
//        ***
//        **
//        *

package com.dsa.patterns;

public class Pattern5 {

    public static void main(String[] args) {
        Pattern5 obj = new Pattern5();
        obj.printPattern5(5);
    }

    void printPattern5(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            // Add a new line after every row
            System.out.println();
        }

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row + 1; col++) {
                System.out.print("*");
            }
            // Add a new line after every row
            System.out.println();
        }
    }
}


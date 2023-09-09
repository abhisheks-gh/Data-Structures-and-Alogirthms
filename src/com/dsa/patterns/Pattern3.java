// Pattern to print
// *****
// ****
// ***
// **
// *

package com.dsa.patterns;

public class Pattern3 {

    public static void main(String[] args) {
        Pattern3 obj = new Pattern3();
        obj.printPattern3(5);
    }

    void printPattern3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 0; col <= n - row; col++) {
                System.out.print("*");
            }

            // Add new line after every row
            System.out.println();
        }
    }
}

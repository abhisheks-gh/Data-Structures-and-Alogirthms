// Pattern to print:
// *
// **
// ***
// ****

package com.dsa.patterns;

public class Pattern2 {

    public static void main(String[] args) {
        Pattern2 obj = new Pattern2();
        obj.printPattern2(4);
    }

    void printPattern2(int n) {
        for (int row = 1; row <= n; row++) {
            // for every row, run the col
            for (int col = 1; col <= row; col++) {
                System.out.print("*");
            }
            // Add a new line when one row is printed
            System.out.println();
        }
    }
}

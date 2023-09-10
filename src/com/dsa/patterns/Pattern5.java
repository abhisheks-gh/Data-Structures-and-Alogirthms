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
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("*");
            }
            // Add new line after every row
            System.out.println();
        }
    }
}

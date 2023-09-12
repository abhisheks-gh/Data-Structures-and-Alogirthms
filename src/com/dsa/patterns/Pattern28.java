// Pattern to print: Rhombus

package com.dsa.patterns;

public class Pattern28 {

    public static void main(String[] args) {
        Pattern28 obj = new Pattern28();
        obj.printPattern28(5);
    }

    void printPattern28(int n) {
        for (int row = 0; row < 2 * n; row++) {
            int totalColsInRow = row > n ? 2 * n - row : row;

            int noOfSpaces = n - totalColsInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }

            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            // Add new line after every row
            System.out.println();
        }
    }
}

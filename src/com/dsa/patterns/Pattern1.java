// Pattern to print
// *****
// *****
// *****
// *****

package com.dsa.patterns;

public class Pattern1 {

    public static void main(String[] args) {
        Pattern1 obj = new Pattern1();
        obj.printPattern1(4);
    }

    void printPattern1(int n) {
        for (int rows = 0; rows < 4; rows++) {
            for (int cols = 0; cols < 4; cols++) {
                System.out.print("*");
            }

            // Add new line after every row
            System.out.println();
        }
    }
}

// Pattern to print
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5

package com.dsa.patterns;

public class Pattern4 {

    public static void main(String[] args) {
        Pattern4 obj = new Pattern4();
        obj.printPattern4(5);
    }

    void printPattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            // Add a new line after every row
            System.out.println();
        }
    }
}

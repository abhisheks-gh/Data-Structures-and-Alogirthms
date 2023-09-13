// Problem link: https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md

package com.dsa.patterns;

public class Pattern30 {

    public static void main(String[] args) {
        Pattern30 obj = new Pattern30();
        obj.printPattern30(5);
    }
    
    void printPattern30(int n) {
        for (int row = 1; row <= n; row++) {

            for (int space = 0; space < n - row; space++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }
}

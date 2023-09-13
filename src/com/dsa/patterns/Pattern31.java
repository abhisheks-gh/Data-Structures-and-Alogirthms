// Problem link: https://github.com/kunal-kushwaha/DSA-Bootcamp-Java/blob/main/assignments/09-patterns.md

package com.dsa.patterns;

public class Pattern31 {

    public static void main(String[] args) {
        Pattern31 obj = new Pattern31();
        obj.printPattern31(4);
    }

    // Value at every cell will be equal to the minimum of its
    // distance from all 4 imaginary outer walls surrounding
    // this pattern (from left, right, top & down)
    // Distance:
    // From left -> col                 From up -> row
    // From right -> n - col            From down -> n - row
    void printPattern31(int n) {
        int originalN = n;
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = originalN - Math.min(Math.min(col, n - col), Math.min(row, n - row));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}

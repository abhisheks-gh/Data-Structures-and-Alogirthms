// Print this pattern:
//        0 0 0 0 0 0 0 0 0
//        0 1 1 1 1 1 1 1 0
//        0 1 2 2 2 2 2 1 0
//        0 1 2 3 3 3 2 1 0
//        0 1 2 3 4 3 2 1 0
//        0 1 2 3 3 3 2 1 0
//        0 1 2 2 2 2 2 1 0
//        0 1 1 1 1 1 1 1 0
//        0 0 0 0 0 0 0 0 0

package com.dsa.patterns;

public class SimilarToPattern31 {

    public static void main(String[] args) {
        SimilarToPattern31 obj = new SimilarToPattern31();
        obj.printPattern(4);
    }

    // Value at every cell will be equal to the minimum of its
    // distance from all 4 imaginary outer walls surrounding
    // this pattern (from left, right, top & down)
    // Distance:
    // From left -> col                 From up -> row
    // From right -> n - col            From down -> n - row
    void printPattern(int n) {
        n = 2 * n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex = Math.min(Math.min(col, n - col), Math.min(row, n - row));
                System.out.print(atEveryIndex + " ");
            }
            System.out.println();
        }
    }
}

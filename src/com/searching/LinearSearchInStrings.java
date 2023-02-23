/**
 * Time Complexity:
 - Best case complexity / Lower bound (denoted by omega) = Ω(1)
 - Average case complexity (denoted by theta) = Θ(n)                   // n = size of array
 - Worst case complexity / Upper bound (denoted by Big-oh) = O(n)      // n = size of array

 * Space Complexity:
 - O(1) – constant complexity – takes the same amount of space regardless of the input size.
 * */

package com.searching;

public class LinearSearchInStrings {
    public static void main(String[] args) {
        String name = "Joseph";
        char target = 'o';
        System.out.println( search(name, target) );
    }

    static boolean search(String str, char target) {
        if (str.length() == 0)
            return false;

        for (char ch : str.toCharArray()) {
            if (ch == target)
                return true;
        }

        return false;
    }
}

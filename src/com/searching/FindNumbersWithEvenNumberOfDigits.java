// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

/** Alternative approach: Convert each number to String type and
    check the length of the String */

package com.searching;

public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int countOfEvenDigitNumbers = 0;

        for (int i = 0; i < nums.length; i++) {
            if ( isEvenDigitNumber( nums[i] ) )
                countOfEvenDigitNumbers++;
        }

        return countOfEvenDigitNumbers;
    }

    // Checks whether a number contains even digits or not
    static boolean isEvenDigitNumber(int num) {
        int numberOfDigits = digitsInNumber(num);

        return numberOfDigits % 2 == 0;
    }

    // Counts number of digits in a number
    static int digitsInNumber(int num) {
        // handling negative numbers
        if (num < 0) {
            // num = num * -1;

            // abs() method returns the absolute (positive) value of a number
            num = Math.abs(num);
        }

        // if number (num) itself is 0
        if (num == 0) {
            return 1;
        }

        int count = 0;

        while (num > 0) {
            count++;
            num /= 10;
        }

        return count;
    }

}
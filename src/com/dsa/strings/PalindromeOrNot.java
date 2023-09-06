// Program to check if the given string is a palindrome or not

package com.dsa.strings;

public class PalindromeOrNot {

    public static void main(String[] args) {
        PalindromeOrNot check = new PalindromeOrNot();
        String str = "abcdcba";
        System.out.println(check.isPalindrome(str));
    }

    boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }

        for (int i = 0; i <= str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if (start != end) {
                return false;
            }
        }

        return true;
    }
}

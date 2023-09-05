/** There are many format specifiers we can use, Here are some common ones:
 * %c - Character
 * %d - Decimal number (base 10)
 * %e - Exponential floating-point number
 * %f - Floating-point number
 * %i - Integer
 * %o - Octal number (base 8)
 * %s - String
 * %u - Unsigned decimal (integer) number
 * %x - Hexadecimal number (base 16)
 * %t - Date/time
 * %n - Newline */

package com.dsa.strings;

public class PrettyPrinting {

    public static void main(String[] args) {
        float a = 453.1274f;
        System.out.printf("Formatted number is %.2f", a);   // It's also rounding-off
        System.out.println();
        System.out.printf("Pie: %.3f", Math.PI);
        System.out.println();

        // Can also use it like this
        System.out.printf("Hi, my name is %s and I am %s", "Abhishek", "Cool");
    }
}

package com.dsa.firstJava;

// import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
      // Scanner sc = new Scanner(System.in);
      // float num = sc.nextFloat();
      // System.out.println(num);


        int a = 257;
        // Typecasting
        byte b = (byte)(a);

        // The highest number that byte datatype can store is '256'
        // But we are trying to typecast an integer '257' to byte type.
        // Hence, the output to this will be (257 % 256) i.e. 1.

        // System.out.println(b);


        byte e = 40;
        byte f = 50;
        byte g = 100;

        // The output to this will be 20.
        int h = e * f / g;

        // e * f will result to 2000 which exceeds the range of byte type
        // To handle this problem java automatically is promoting each byte
        // to integer when it's evaluating this expression.

        System.out.println(h);

        // So, although we have taken data of byte types, but to perform this calculation java
        // is promoting bytes to integers.



        // byte x = 50;
        // This will give an error because everytime we are performing byte operations, these bytes
        // are implicitly getting converted to integer & assigning integer(Big datatype) to byte(Small datatype)
        // is not allowed.
        // byte y = x * 2;


        int number = 'a';
        // Output to this will be 97.
        // Java is implicitly converting char 'a' to its integer ascii value 97.
        System.out.println(number);



        // Java follows the unicode principles.
        // Unicode is a 16-bit character encoding standard and is capable to represent
        // almost every character of well-known languages of the world.
        System.out.println("Hello");       // English
        System.out.println("नमस्ते");        // Hindi
        System.out.println("你好");        // Chinese
        System.out.println("こんにちは");   // Japanese


        // Rule for typecasting:
        // All the data types involved in the operation are converted to bigger one.
        // For example:
        // float * byte = float
        // int / char = int
        // double * short = double
        // float + int - double = double


        // sc.close();
    }
}
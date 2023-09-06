package com.dsa.stringbuilder;

public class UsingStringBuilder {

    public static void main(String[] args) {
        // StringBuilder is mutable unlike strings
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }

        System.out.println(builder.toString());

        builder.deleteCharAt(0);
        System.out.println(builder);

        builder.reverse();
        System.out.println(builder);
    }
}

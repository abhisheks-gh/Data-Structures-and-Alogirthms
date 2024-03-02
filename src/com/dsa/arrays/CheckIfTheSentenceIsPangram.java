// https://leetcode.com/problems/check-if-the-sentence-is-pangram/

package com.dsa.arrays;

public class CheckIfTheSentenceIsPangram {

    public static void main(String[] args) {
        CheckIfTheSentenceIsPangram obj = new CheckIfTheSentenceIsPangram();
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        // String sentence = "leetcode";
        // String sentence = "onrcsnlxckptsxffbyswujpamfltvmdoxovggepknmtacrjkkorjgvgtgaiaudspnpxkwikevmjeephhiyvnoymjwjfopovscbefecnoytjxfwasabwohqujwowmakpyuuqvgfab";
        System.out.println(obj.checkIfPangram(sentence));
    }

    public boolean checkIfPangram(String sentence) {
        for (char ch = 97; ch <= 122; ch++) {
            boolean flag = false;
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ch) {
                    flag = true;
                }
            }
            if (!flag) {
                return false;
            }
        }
        return true;
    }
}
// https://leetcode.com/problems/length-of-last-word/

package com.dsa.strings.interviewQuestions;

public class LengthOfLastWord {

    public static void main(String[] args) {
        LengthOfLastWord sol = new LengthOfLastWord();
        String s = "   fly me   to   the moon  ";
        System.out.println(sol.lengthOfLastWord(s));
    }

    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] arr = s.split(" ");
        return arr[arr.length - 1].length();
    }

}

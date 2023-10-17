// https://leetcode.com/problems/shuffle-string/

package com.dsa.strings.interviewQuestions;

public class ShuffleString {
    public static void main(String[] args) {
        ShuffleString temp = new ShuffleString();
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(temp.restoreString(s, indices));
    }

    public String restoreString(String s, int[] indices) {
        char[] ans = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            ans[indices[i]] = s.charAt(i);
        }

        return new String(ans);
    }
}

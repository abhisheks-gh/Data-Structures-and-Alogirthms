// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/

package com.dsa.strings;

public class FindTheIndexOfFirstOccurrenceInString {

    public static void main(String[] args) {
        FindTheIndexOfFirstOccurrenceInString obj = new FindTheIndexOfFirstOccurrenceInString();
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(obj.strStr(haystack, needle));
    }

    public int strStr(String haystack, String needle) {
        // Approach 1:
//        return haystack.indexOf(needle);

        // Approach 2:
        if (haystack.isEmpty()) {
            return 0;
        }

        if (haystack.length() < needle.length()) {
            return -1;
        }

        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            for (int j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }

                if (j == needle.length() - 1) {
                    return i;
                }
            }
        }

        return -1;
    }

}
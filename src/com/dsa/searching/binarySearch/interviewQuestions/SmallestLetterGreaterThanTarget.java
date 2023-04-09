// https://leetcode.com/problems/find-smallest-letter-greater-than-target/

package com.dsa.searching.binarySearch.interviewQuestions;

public class SmallestLetterGreaterThanTarget {

    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'a';

        System.out.println( nextGreatestLetter(letters, target) );
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }

        // When while loop breaks, start = end + 1 as start will cross end
        // and the while loop breaks when target is not found in the array
        // So, start becomes the element i.e. just greater than the target
        return letters[start % letters.length];
    }

}

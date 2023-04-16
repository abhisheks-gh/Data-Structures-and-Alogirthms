// https://leetcode.com/problems/first-bad-version/
// Google (19), Amazon(12), Facebook (7), Microsoft (6), Apple (5),
// Adobe (4), Cisco (2)

package com.dsa.searching.binarySearch.interviewQuestions;

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
public class FirstBadVersion extends VersionControl{

    public int firstBadVersion(int n) {
        int start = 1;

        while (start <= n) {
            int mid = start + (n - start) / 2;

            if (isBadVersion(mid)) {
                n = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

}

class VersionControl {

    protected boolean isBadVersion(int n) {
        return false;   // return true;
    }

}

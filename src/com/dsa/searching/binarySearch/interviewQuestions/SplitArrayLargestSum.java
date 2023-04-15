// https://leetcode.com/problems/split-array-largest-sum/

// Google (8), Amazon (6), tiktok (6), Facebook (5), ByteDance (2), Apple (2)

/** arr = [7, 2, 5, 10, 8]
 * Approach:
 * Case 1:
    Minimum number of partitions that we can make = 1 (taking the entire array)
    In this case, answer will be maximum i.e. the sum of the entire array (32 in this case)
 * Case 2:
    Maximum = number of partitions that we can make = Length of array (taking each element as a sub-array)
            {7}, {2}, {5}, {10}, {8}

    In this case, answer will be minimum i.e. maximum value in the actual array (10 in this case)
        Now, start = 10, end = 32

        range = [10, 32]    // Here it clicked, that binary search will be applied
        mid = start + (end - start) / 2 = 21

    Make a new array (initially empty), and a new variable called pieces (initially 0).
    Check if the element of actual array exceeds the lower bound:
        1. if no -> add it to the new array
        2. if yes -> create one more array, increment pieces by 1 and keep doing the previous
           step for the remaining elements of the actual array.

            [7, 2, 5], [8, 10]          // pieces = 2

        3. In this way we will have total pieces array!

            // CHECK 1
            if (pieces <= m) {          // m = min sub-arrays to be created
                // search in the left
                end = mid;              // (10 + 21) / 2 = 15
            }

            [7, 2, 5], [8], [10]        // pieces = 3
            Again follow these steps for this sub-array.

            // CHECK 2
            if (pieces > m) {
                start = mid + 1;        // (15 + 1 = 16), end = 21
            }

            newMid = (16 + 21) / 2 = 18

            [7, 2, 5], [8, 10]          // pieces = 2

            Again check if pieces <= m -> start = 16, end = 18
                So, (mid = 16 + 18) / 2 = 17
            [7, 2, 5], [8], [10]         // pieces = 3

            As, pieces > m  -> start = mid + 1
                                     = 18

            Now, start = 18, end = 18. Therefore, mid = 18     // ANSWER
 */

package com.dsa.searching.binarySearch.interviewQuestions;

public class SplitArrayLargestSum {

    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            // After loop ends, this will give max item from the array
            start = Math.max(start, nums[i]);
            // Sum of all the values (Case 2: upper bound of m)
            end += nums[i];
        }

        while (start < end) {
            // try for the mid as potential answer
            int mid = start + (end - start) / 2;

            // calculating number of pieces, the array can be divided in with this max sum
            int sum = 0;
            int pieces = 1;

            for (int num : nums) {
                if (sum + num > mid) {
                    // Can't add element in this sub-array, make new one
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if (pieces > k) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return end;     // Here, start == end
    }

}

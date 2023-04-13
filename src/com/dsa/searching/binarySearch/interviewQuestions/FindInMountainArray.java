// https://leetcode.com/problems/find-in-mountain-array/

/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakIndexInMountainArray(mountainArr);
        int firstTry = orderAgnosticBinarySearch(mountainArr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }

        // try to search in the second half of the array
        return orderAgnosticBinarySearch(mountainArr, target, peak + 1, mountainArr.length() - 1);
    }

    static int peakIndexInMountainArray(MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length() - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mountainArr.get(mid) > mountainArr.get(mid + 1)) {
                // We are in descending part of the array
                // this may be the ans, but look in the left
                // this is why end != mid - 1
                end = mid;
            } else {
                // We are in ascending part of the array
                // this may be the ans, but look in the right
                start = mid + 1;
            }
        }

        // In the end, start == end and pointing to the largest number
        // because of the two checks above.
        // start and end are always trying to find max element in the above two checks
        // Hence, when they are pointing to just one element, that is the maximum one
        /* More elaboration:
        * At every point of time for start and end, they have the best possible answer till that time
        * And if we are saying that only one item is remaining, hence because of above line that is the
          best possible answer*/

        return start;   // or return end (as both are equal)
    }

    static int orderAgnosticBinarySearch(MountainArray mountainArr, int target, int start, int end) {
        boolean isAscending = mountainArr.get(start) < mountainArr.get(end);

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == mountainArr.get(mid))
                return mid;

            if (isAscending) {
                if (target < mountainArr.get(mid))
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                if (target < mountainArr.get(mid))
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }

        return -1;
    }

}

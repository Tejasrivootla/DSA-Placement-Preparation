package Arrays;

/*
----------------------------------------------------
Problem : 977. Squares of a Sorted Array
Platform : LeetCode

Pattern :
Two Pointers

Time Complexity : O(n)

Space Complexity : O(n)

Status : Solved ✅

Date : 28-06-2026
----------------------------------------------------
*/

public class Squares_Of_A_Sorted_Array {

    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] res = new int[n];

        int l = 0;
        int r = n - 1;
        int index = n - 1;

        while (l <= r) {

            if (Math.abs(nums[l]) > Math.abs(nums[r])) {
                res[index] = nums[l] * nums[l];
                l++;
            } else {
                res[index] = nums[r] * nums[r];
                r--;
            }

            index--;
        }

        return res;
    }
}
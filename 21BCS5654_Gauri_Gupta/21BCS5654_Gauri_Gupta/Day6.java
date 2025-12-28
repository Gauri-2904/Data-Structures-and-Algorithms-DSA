/*
 * Problem: Rotate Array
 * LeetCode: 189
 *
 * Given an integer array nums, rotate the array to the right by k steps,
 * where k is non-negative.
 *
 * The rotation should be done in-place, using O(1) extra space.
 *
 * Example:
 * Input:  nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 *
 * Approach:
 * - Use the Reverse Array technique.
 * - Steps:
 *   1. Reverse the entire array
 *   2. Reverse the first k elements
 *   3. Reverse the remaining elements
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {

    public void rotate(int[] nums, int k) {

        // Handle cases where k >= array length
        k = k % nums.length;

        // Step 1: Reverse the entire array
        reverse(nums, 0, nums.length - 1);

        // Step 2: Reverse first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse remaining elements
        reverse(nums, k, nums.length - 1);
    }

    // Helper method to reverse array elements between indices i and j
    public static void reverse(int[] nums, int i, int j) {
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}

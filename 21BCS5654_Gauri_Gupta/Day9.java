📝 Problem Statement

You are given an integer array nums.
You start at index 0, and each element nums[i] represents the maximum jump length from that position.

Objective

Return true if you can reach the last index, otherwise return false.

💡 Intuition

Instead of jumping forward and trying all possibilities, we work backwards.

Think of the last index as the goal

Move from right to left

If from index i you can reach the current goal, then update the goal to i

At the end, if the goal reaches index 0, the jump is possible

🚀 Approach (Greedy – Backward)

Start with goal = last index

Traverse the array from right to left

Check if i + nums[i] >= goal

If yes → update goal = i

Finally, check if goal == 0

This works because we always keep track of the leftmost position from which the end is reachable.

🧮 Algorithm

Initialize goal = nums.length - 1

Traverse from n-2 to 0

If nums[i] + i >= goal, update goal = i

Return true if goal == 0, else false

🧑‍💻 Java Implementation
class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int goal = n - 1;

        // Traverse from right to left
        for (int i = n - 2; i >= 0; i--) {
            // If current index can reach the goal
            if (nums[i] + i >= goal) {
                goal = i;
            }
        }

        // If we can move the goal to index 0, jump is possible
        return goal == 0;
    }
}

⏱️ Time Complexity

O(n) — Single pass through the array

💾 Space Complexity

O(1) — Constant extra space

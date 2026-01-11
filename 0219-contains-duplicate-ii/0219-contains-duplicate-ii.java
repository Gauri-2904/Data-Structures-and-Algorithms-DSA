import java.util.HashSet;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        // HashSet to store elements in the current window
        HashSet<Integer> set = new HashSet<>();

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {

            // Step 1: Maintain window size of k
            // If index difference exceeds k, remove the old element
            if (i > k) {
                set.remove(nums[i - k - 1]);
            }

            // Step 2: Check if current element already exists in window
            if (set.contains(nums[i])) {
                return true; // duplicate found within distance k
            }

            // Step 3: Add current element to the window
            set.add(nums[i]);
        }

        // No duplicate found within distance k
        return false;
    }
}

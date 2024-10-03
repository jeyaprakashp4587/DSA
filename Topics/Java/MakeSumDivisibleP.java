import java.util.HashMap;

public class MakeSumDivisibleP {
    public static int minSubarray(int[] nums, int p) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum = (totalSum + num) % p; // Compute total sum modulo p
        }

        if (totalSum == 0) {
            return 0; // If total sum is divisible by p, return 0
        }

        // HashMap to store the prefix sum mod and its index
        HashMap<Integer, Integer> prefixModMap = new HashMap<>();
        prefixModMap.put(0, -1); // Initialize with mod 0 at index -1

        int currentMod = 0;
        int minLen = nums.length;

        for (int i = 0; i < nums.length; i++) {
            currentMod = (currentMod + nums[i]) % p; // Update current mod of prefix sum
            int targetMod = (currentMod - totalSum + p) % p; // Calculate the target mod

            // Check if the target mod exists in the map
            if (prefixModMap.containsKey(targetMod)) {
                minLen = Math.min(minLen, i - prefixModMap.get(targetMod)); // Update minLen
            }

            // Store the current mod and its index
            prefixModMap.put(currentMod, i);
        }

        // If no valid subarray is found, return -1
        return minLen == nums.length ? -1 : minLen;
    }

    public static void main(String[] args) {
        int[] nums = { 3, 1, 4, 2 };
        int p = 6;
        int result = minSubarray(nums, p);
        System.out.println("Minimum length of subarray to remove: " + result);
    }
}

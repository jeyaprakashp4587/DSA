class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] remainderCounts = new int[k];
        for (int num : arr) {
            int remainder = (num % k + k) % k;  // Handle negative numbers
            remainderCounts[remainder]++;
        }
        
        if (remainderCounts[0] % 2 != 0) return false;  // Elements divisible by k should pair with each other
        
        for (int i = 1; i < k; i++) {
            if (remainderCounts[i] != remainderCounts[k - i]) {
                return false;  // Pairs with complementary remainders must match
            }
        }
        
        return true;
    }
}

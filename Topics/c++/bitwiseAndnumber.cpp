class Solution {
public:
    int rangeBitwiseAnd(int left, int right) {
         int shift = 0;
      
    // // Find the common prefix
    while (left < right) {
        left >>= 1;
        right >>= 1;
        shift++;
        
    }
    // Shift back to the original bit length
    return left << shift;
    }
};
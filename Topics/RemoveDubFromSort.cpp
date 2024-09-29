#include <iostream>
#include <vector>
using namespace std;
class Solution
{
public:
    int removeDuplicates(vector<int> &nums)
    {
        if (nums.size() == 0)
            return 0; // Edge case: empty array

        int i = 0; // Pointer for unique elements
        for (int j = 1; j < nums.size(); j++)
        {
            if (nums[j] != nums[i])
            {                      // Found a new unique element
                i++;               // Move i to the next position
                nums[i] = nums[j]; // Update it with the new element
            }
        }
        return i + 1; // The length of the unique array is i + 1
    }
};

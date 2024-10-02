#include <iostream>
#include <vector>

using namespace std;
int main()

{
    int result;
    vector<int> nums = {4,
                        3,
                        2,
                        4,
                        5};
    int k = 3;
    for (int i = 0; i < nums.size(); i++)
    {
        // Compare the current element with all subsequent elements
        for (int j = i + 1; j < nums.size(); j++)
        {
            if (nums[i] == nums[j])
            {
                return true; // Duplicate found
            }
        }
    }
    // No duplicates found
    return false;
}

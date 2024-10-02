#include <iostream>
#include <vector>
using namespace std;

int missingNumber(vector<int> &nums)
{
    int n = nums.size();
    int total_sum = n * (n + 1) / 2; // Sum of numbers from 0 to n
    int array_sum = 0;

    for (int num : nums)
    {
        array_sum += num; // Sum of numbers in the array
    }

    return total_sum - array_sum; // Missing number is the difference
}

int main()
{
    vector<int> nums = {3, 0, 1};
    cout << "Missing number: " << missingNumber(nums) << endl; // Output: 2
    return 0;
}

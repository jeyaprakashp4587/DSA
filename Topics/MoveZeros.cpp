#include <iostream>
#include <vector>
using namespace std;
int main()
{
    vector<int> nums = {1, 1, 0, 4, 2, 0};
    int j = 0;
    for (int i = 0; i < nums.size(); i++)
    {
        if (nums[i] != 0)
        {
            nums[j] = nums[i];
            j++;
        }
    }
    while (j < nums.size())
    {
        nums[j] = 0;
        j++;
    }

    for (int e = 0; e < nums.size(); e++)

    {
        cout << nums[e];
    }

    return 0;
}
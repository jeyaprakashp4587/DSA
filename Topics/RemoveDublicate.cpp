#include <iostream>
#include <vector>
using namespace std;

int removeDuplicates(vector<int>& nums) {
    if (nums.empty()) return 0;
    int val =2;
    int j = 0; // Index for the position of the next non-val element
    for (int i = 0; i < nums.size(); ++i) {
        if (nums[i] != val) {
            nums[j] = nums[i]; // Place the non-val element at the next position
            ++j; // Move to the next position
        }
    }
    return j; 
}

int main() {
    vector<int> nums = {1, 1, 2,4,2,5};
    int k = removeDuplicates(nums);

    cout << "k = " << k << endl;
    cout << "Modified array: ";
    for (int i = 0; i < k; ++i) {
        cout << nums[i] << " ";
    }
    cout << endl;

    return 0;
}

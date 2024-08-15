#include <iostream>
#include <vector>
using namespace std;

int main() {
    vector<int> arr= {4,5,6,7,0,1,2};
    int target = 0;
      int index = -1; 

    for (int i = 0; i < arr.size(); i++) {
        if (arr[i] == target) {
            index = i; 
            break;
        }
    }
}
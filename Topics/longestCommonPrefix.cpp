#include <iostream>
#include <string>
#include <vector>
using namespace std;
int main() {
    vector <string> arr = {"flower","flow","flight"};
    string result;
    for (int i = 0; i < arr.size(); i++)
    {
         for (int j = 0; j < arr[i].size(); j++) {
            result += arr[i][j]; 
        }
    }
    
    return 0;
}
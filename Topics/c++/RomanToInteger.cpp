#include <iostream>
#include <map>
#include <string>

using namespace std;

int main() {
    map<string, int> myMap;
    myMap["I"] = 1;
    myMap["V"] = 5;
    myMap["X"] = 10;
    myMap["L"] = 50;
    myMap["C"] = 100;
    myMap["D"] = 500;
    myMap["M"] = 1000;
    string res = "MCMXCIV";
    int result = 0; 
    int stsize = res.size();
    for (int i = 0; i < stsize; i++) {
        string currentChar(1, res[i]); 
        auto it = myMap.find(currentChar);
        if (it != myMap.end()) {
            result += it->second;
        }
    }
    cout << result << endl; 
    return 0;
}

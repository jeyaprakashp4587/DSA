#include <iostream>
#include <vector>
#include <string>
using namespace std;
int main()

{
    char result = 0;
    for (char c : s)
    {
        result ^= c; // XOR all characters in string s
    }
    for (char c : t)
    {
        result ^= c; // XOR all characters in string t
    }
    return result;
}
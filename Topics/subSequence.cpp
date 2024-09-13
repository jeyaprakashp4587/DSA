#include <iostream>
#include <string>
using namespace std;
int main()
{
    int i = 0, j = 0; // two pointers, one for each string

    while (i < s.length() && j < t.length())
    {
        if (s[i] == t[j])
        {
            i++; // move the pointer in s if characters match
        }
        j++; // always move the pointer in t
    }

    // If we have matched all characters in s, return true
    return i == s.length();
}
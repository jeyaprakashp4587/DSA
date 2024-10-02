#include <iostream>
#include <vector>
#include <string>
using namespace std;
int main()
{
    string s = "jeyaprakash";
    char first = s[0];
    int result;
    for (int i = 1; i < s.size(); i++)
    {
        if (first != s[i])
        {
            if (first == s[0])
            {
                result = 0;
                break;
            }
            result = i;
            break;
        }
        else
        {
            first = s[i];
        }
    }

    cout << result;
    return 0;
}
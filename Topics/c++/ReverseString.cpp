#include <iostream>
#include <vector>
using namespace std;

void reverseString(vector<char> &s)
{
    int left = 0;
    int right = s.size() - 1;

    while (left < right)
    {
        // Swap characters at left and right pointers
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;

        // Move the pointers towards the middle
        left++;
        right--;
    }
}

int main()
{
    vector<char> s = {'h', 'e', 'l', 'l', 'o'};

    cout << "Original string: ";
    for (char c : s)
    {
        cout << c;
    }
    cout << endl;

    reverseString(s); // Reverse the string

    cout << "Reversed string: ";
    for (char c : s)
    {
        cout << c;
    }
    cout << endl;

    return 0;
}

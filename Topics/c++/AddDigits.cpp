#include <iostream>

using namespace std;

int sum(int n)
{
    int sum = 0;
    while (n > 0)
    {
        int digit = n % 10;
        sum += digit;
        n /= 10;
    }
    return sum;
}

int main()
{
    int num = 38;
    int find = sum(num);

    while (find >= 10)
    {
        find = sum(find); // Keep summing the digits until it's a single digit
    }

    cout << "The final single-digit sum is: " << find << endl;

    return 0;
}

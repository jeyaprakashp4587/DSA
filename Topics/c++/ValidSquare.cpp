#include <iostream>
#include <vector>
using namespace std;
int main()
{
    int n = 16;
    int sqr = 0;
    bool result;
    for (int i = 1; i * i <= n; i++)
    {
        sqr = i;
    }
    if (sqr * sqr == n)
    {
        result = true;
    }
    cout << result;
    return 0;
}

#include <iostream>
#include <vector>

using namespace std;
int main()

{
    int result;
    vector<int> num = {4,
                       3,
                       2,
                       4,
                       5};

    for (int i = 0; i < num.size(); i++)
    {
        /* code */
        for (int k = 1; k < num.size(); k++)
        {
            if (num[k] != num[i])
            {
                result = num[i];
            }
        }
    }
    cout << result;

    return 0;
}

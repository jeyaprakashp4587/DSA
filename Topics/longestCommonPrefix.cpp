#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
using namespace std;
int main() {
    vector <string> arr = {"flights","flowring","flibling"};
    string result;
    // sort(arr.begin(),arr.end());
    string firstElement = arr[0];
     string lastElement = arr[arr.size() -1];
    // for (int i = 0; i < firstElement.size(); i++)
    // { 
    // //  if (firstElement[i] == lastElement[i])
    // //  {
    // //    result +=firstElement[i];
    // //  }
    // //  else{
    // //     break;
    // //  }

    // }
    cout<<arr[1];
    return 0;
}
#include <iostream>
using namespace std;
int main() {
    int numbers;
    cin>>numbers;
    long long reversed = 0;
    while (numbers !=0){
        int digit = numbers % 10;
        reversed  = reversed *10 + digit;
         if (reversed > INT_MAX || reversed < INT_MIN) {
                return 0;
            }
        numbers /= 10;
        while (reversed %10 == 0 && reversed != 0) {
        reversed /= 10;  
        }
        int resukt =  static_cast<int>(reversed);
        cout<<resukt<<endl;
    }
    return 0;
}
#include <iostream>
using namespace std;
int main() {
    int numbers;
    cin>>numbers;
    int reversed = 0;
    while (numbers !=0){
        int digit = numbers % 10;
        reversed  = reversed *10 + digit;
        numbers /= 10;
        while (reversed %10 == 0 && reversed != 0) {
        reversed /= 10;  
        }
    }
    return 0;
}
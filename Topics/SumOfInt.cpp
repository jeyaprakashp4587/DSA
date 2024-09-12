#include <iostream>
using namespace std;

int addWithoutPlus(int r, int y) {
    // while (b != 0) {
    //       // Find the carry
    //     a = a ^ b;            // Add without carrying
    //     b = carry << 1;       // Shift the carry to the left
    //     // cout<<carry;
    // }
    // return a;
    int a = 5;
    int b = 10;
    int carry = a & b;  
    cout<< carry;
}

int main() {
    int num1 = 15;
    int num2 = 20;
    cout << "Sum: " << addWithoutPlus(num1, num2) << endl;
    return 0;
}

#include <iostream>
using namespace std;
int main() {
    int c;
    cin>>c;
    int check = c;
    int reversed =0;
    if (check < 0)    
{
        return false;
    }
    
    while (c!=0){
     int digit = c%10;
     reversed  = reversed *10 +digit;
     c /= 10; 
    }
    
    if(reversed == check){
        cout<<"Yes";
    }
    else{
        cout<<"no";
    } 
}
#include<iostream>
using namespace std;

int main(){
    int array[]={2,8,4,6,7};

     int n = sizeof(array)/sizeof(array[0]);

    for(int i=n-1; i>=0; i--){
        cout << array[i];
    }
}
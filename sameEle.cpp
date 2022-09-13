//same element in an array in the range of k.

#include<iostream>
using namespace std;
//arr is an array where n is the number of element and k is the range.
bool check(int arr[], int n, int k){
//for arr[0] to arr[n], j = i+1, to compare with next element.
    for(int i = 0; i < n; i++){
        int j = i+1;
        int range = k;

        //range is the counter.
        //not in array element. 

        while(j<n && range>0)
        {
            if(arr[i]==arr[j]){
                return true;
            }
            j++;
            range--;
        }
    }
    return false;
}

int main(){

    //it check 3 time, 1 with  2, 1 with 3, 1 with  3 and 1 with 4 only
    // after that counter wiil be 0,  and reset as 3 again. 

    int arr[] = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
    int size = sizeof(arr)/sizeof(arr[0]);

        if(check(arr, size, 3)){
        cout << "YES";
    }else {
        cout << "NO";
    }

}
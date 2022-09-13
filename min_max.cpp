#include<iostream>
using namespace std;

struct Pair{
    int min, max;
};

Pair getminmax(int array[], int e_no){
    struct Pair obj;
    if(e_no==1){
        obj.max=array[0];
        obj.min=array[0];
        return obj;
    }

    if(array[0] < array[1]){
        obj.max=array[1];
        obj.min=array[0];
    }
    else{
        obj.max=array[0];
        obj.min=array[1];
    }
    for(int i=0; i<e_no; i++){
        
        if(array[i]>=obj.max){
            obj.max=array[i];
        }else if(array[i]<=obj.min){
            obj.min=array[i];
        }
    }
    return obj;
}

int main(){
    int arraySize;
     cout << "enter size of your array : \n";

    cin >> arraySize;

    cout << "enter array elements :\n";

    int array[arraySize];

    for(int i=0; i<arraySize; i++){
        cin >> array[i];
    }
    struct Pair obj = getminmax(array, arraySize);

    cout << "minimum element is : "<<obj.min <<endl;
    cout << "maximum element is : "<<obj.max <<endl;


}
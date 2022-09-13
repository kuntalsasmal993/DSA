#include <bits/stdc++.h>
using namespace std;

//kadane algorithm

class vari{
    public:
    int max_sum, currentElementSum;
};
int arr(int array[], int n){

    vari obj;

    obj.max_sum = 0;
    obj.currentElementSum=0;

//[5,0,7,9,3,4]

    for(int i=0; i<n; i++){

        obj.currentElementSum=obj.currentElementSum+array[i];

        if(obj.max_sum < obj.currentElementSum){
            obj.max_sum = obj.currentElementSum;

        }
        // if(obj.max_sum > 0 && obj.currentElementSum!=0 && obj.max_sum >=obj.currentElementSum){
        //     cout << array[i] << " ";
        // }
        if(obj.currentElementSum < 0){
            obj.currentElementSum=0;
        }
        
    }
    return obj.max_sum;
}

int main(){

    int array[] = {-2, -3, 4, -1, -2, 1, 5, -3};
    int size = 8;

   vari obj;
   obj.max_sum = arr(array,size);

        cout << obj.max_sum;


    return 0;


}
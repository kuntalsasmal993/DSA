#include<iostream>
using namespace std;

int logic(){
    int input_number;//let a number 121
    int compared_number = 0;
    cout << "Enter a palindrome number : ";
    cin >> input_number; //121 as an input
   int input_number_copy = input_number;
    while(input_number>0) //input_number = 121 ; 12 ; 1 ; 0(loop terminate)
    {
        int reminder = input_number%10; // 121%10 = 1 ; 12%10 = 2 ; 1
        compared_number = (compared_number*10)+reminder; //0*10+1 = 1 ; 1*10+2 = 12 ; 12*10+1 = 121
        input_number = input_number/10; //121/10 = 12 ; 12/10 = 1 ; 1/10 = 0
    }
    if(input_number_copy == compared_number){
        cout << "the number is palindrome";
    }else{
        cout << "the number is not palindrome";

    }
    return 0;
}
int main()
{
    logic();

    return 0;
}

/*                                 THIS LOGIC HELP TO REVERSE ANY NUMBER

int reversed_number = 0;
while(input_number>0) 
    {
        int reminder = input_number%10; 
        reversed_number = (reversed_number*10)+reminder;
        input_number = input_number/10;
    }

*/

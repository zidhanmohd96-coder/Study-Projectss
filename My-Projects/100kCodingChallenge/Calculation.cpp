#include <iostream>
using namespace std;

int addition(int a, int b){
    return a+b;
}
int substraction(int a, int b){
    return a-b;
}
int multiplication(int a, int b){
    return a*b;
}
int division(int a, int b){
    return a/b;
}

int main(){

    int choice;
    cout<<"Enter the calculation to be done: \n1 for addition\n2 for substraction\n3 for multiplication\n4 for division"<<endl;
    cin>>choice;

    int a,b;
    cout<<"Enter the two numbers to be calculated: "<<endl;
    cin>>a>>b;

    int result;
    
    if(choice==1){
        result=addition(a,b);
        cout<<"The result of addition is: "<<result<<endl;
    }
    else if(choice==2){
        result=substraction(a,b);
        cout<<"The result of substraction is: "<<result<<endl;
    }
    else if(choice==3){
        result=multiplication(a,b);
        cout<<"The result of multiplication is: "<<result<<endl;
    }
    else if(choice==4){
        result=division(a,b);
        cout<<"The result of division is: "<<result<<endl;
    }
    else{
        cout<<"Invalid choice"<<endl;
    }

}
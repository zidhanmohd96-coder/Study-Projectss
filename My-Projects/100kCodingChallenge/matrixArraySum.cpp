#include<iostream>
using namespace std;

int main(){
    int i,j,size;

    cout<<"Enter the size of the matrix: \n";
    cin>>size;

    int arr1[size][size],arr2[size][size],sum[size][size];

    cout<<"Enter the elements of the first matrix array: \n";
    for(i=0;i<size;i++){
        for(j=0;j<size;j++){
            cin>>arr1[i][j];
        }
    }
    cout<<"Enter the elements of the second matrix array: \n";
    for(i=0;i<size;i++){
        for(j=0;j<size;j++){
            cin>>arr2[i][j];
        }
    }

    //Summation
    for(i=0;i<size;i++){
        for(j=0;j<size;j++){
            sum[i][j] = arr1[i][j] + arr2[i][j];
        }
    }

    for(i=0;i<size;i++){
        for(j=0;j<size;j++){
            cout<<sum[i][j]<<" ";
        }
        cout<<endl;
    }
}
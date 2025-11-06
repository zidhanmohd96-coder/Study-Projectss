#include <iostream>
using namespace std;


int main() {

	int i,j,limit,n;
    int k=0;
    int arr[10]={10,20,30,40,50,30,10,10};
    int dup[90];
    n = sizeof(arr)/sizeof(arr[0]);

    for(i=0;i<n;i++){
        if(arr[i] != arr[i-1]){
            dup[k++] = arr[i];
        }else{
            continue;
        }
    }
    //Print the duplicates
    for(i=0;i<k;i++){
        cout << dup[i] << " ";
    }
	

	return 0;
}
#include <stdio.h>
#include <stdlib.h>

int main(){

    int i, size, j, temp;
    setbuf(stdout,NULL);

    printf("This program will sort the array in ascending order.\n");
    printf("Enter the size of the array: ");
    scanf("%d", &size);

    int arr[size];

    printf("Enter the values of the array: ");
    for(i = 0; i < size; i++){
        scanf("%d", &arr[i]);
    }

    printf("The values of the array are: ");
    for(i = 0; i < size; i++){
        printf("%d\t", arr[i]);
    }
    printf("\n");

    // Sorting the array using selection sort
    for(i=0;i<size-1;i++){
        for(j=i+1;j<size;j++){
            if(arr[j]<arr[i]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }

    printf("The sorted array is: ");
    for(i=0;i<size;i++){
        printf("%d\t", arr[i]);
    }
    printf("\n");

    return 0;
}
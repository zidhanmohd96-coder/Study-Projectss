#include <stdio.h>

int main() {
    int arr[100], n, i, j, newArr[100], isDuplicate;
    int newSize = 0;

    printf("Enter size of array: ");
    scanf("%d", &n);
    
    printf("Enter array elements: ");
    for(i = 0; i < n; i++)
        scanf("%d", &arr[i]);

    for(i = 0; i < n; i++) {
        isDuplicate = 0;
        for(j = 0; j < newSize; j++) {
            if(arr[i] == newArr[j]) {
                isDuplicate = 1;
                break;
            }
        }
        if(isDuplicate == 0) {
            newArr[newSize] = arr[i];
            newSize++;
        }
    }

    printf("New array with unique elements: ");
    for(i = 0; i < newSize; i++) {
        printf("%d ", newArr[i]);
    }
    printf("\n");

    return 0;
}

